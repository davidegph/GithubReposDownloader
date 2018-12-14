package org.davide.github.githubdownloader.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.davide.github.githubdownloader.models.Repo;
import org.davide.github.githubdownloader.utils.GithubUrlBuilder;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Controller
public class AppController
{
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/organizations")
    public String organizations(@RequestParam(value = "organization", required = true) String organization,
                                @RequestParam(value = "dowloadLocation", required = false, defaultValue = "ReposDefaultDownload") String downloadLocation,
                                @RequestParam(value = "githubHost", required = false, defaultValue = "https://api.github.com/orgs/") String githubHost,
                                Model model)
    {
        model.addAttribute("organization", organization);
        model.addAttribute("downloadLocation", downloadLocation);
        model.addAttribute("githubHost", githubHost);
        GithubUrlBuilder githubUrlBuilder = new GithubUrlBuilder()
            .setOrganization(organization);
        cloneRepos(githubUrlBuilder.build(), downloadLocation);

        return "organizations";
    }

    public void cloneRepos(String address, String downloadLocation)
    {

        UriComponentsBuilder builder = UriComponentsBuilder
            .fromUriString(address)
            .queryParam("per_page", 1000);

        log.info("URL: " + builder.toUriString());
//        ResponseEntity<Object> exchange = restTemplate.exchange("https://api.github.com/authorizations", HttpMethod.POST, null, Object.class);
//        log.warn("Exchange: " + exchange);
        
        ResponseEntity<List<Repo>> repoList = restTemplate.exchange("https://github.houston.softwaregrp.net/api/v3/orgs/caf/repos",
                                                                    HttpMethod.GET, null,
                                                                    new ParameterizedTypeReference<List<Repo>>(){});
        List<Repo> list = repoList.getBody();
        log.info("Repos number: " + list.size());
        final String downloaded = downloadLocation;
        list.parallelStream().forEach(r -> {
            Path download = Paths.get(downloaded, r.getName());
            try {
                Files.createDirectories(download);
            } catch (IOException ex) {
                log.error("Error while creating directory: " + downloaded);
            }
            log.info("Cloning from " + r.getGit_url() + " to " + downloaded);
            try (Git result = Git.cloneRepository()
                .setURI(r.getGit_url())
                //.setCredentialsProvider(new UsernamePasswordCredentialsProvider("davidegph", "Str4cc14t3ll4"))
                .setDirectory(download.toFile())
                .call()) {
                // Note: the call() returns an opened repository already which needs to be closed to avoid file handle leaks!
                log.info("Having repository: " + result.getRepository().getDirectory());
            } catch (GitAPIException ex) {
                log.error("Big error: " + ex.getMessage());
            }
            log.warn("DONE! " + r.getName());
        });
        log.info("Completed!!!!!!!!!!!");
    }

}
