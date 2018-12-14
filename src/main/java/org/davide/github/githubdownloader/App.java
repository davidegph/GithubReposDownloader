package org.davide.github.githubdownloader;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class App
{
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder)
    {
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        if(System.ge)
        Proxy proxy = new Proxy(Type.HTTP, new InetSocketAddress("my.host.com", 8080));
        requestFactory.setProxy(proxy);

        return new RestTemplate(requestFactory);
    }

//    @Override
//    public void run(String... args) throws Exception
//    {
//        String url = null;
//        String organization = null;
//        String downloadLocation = null;
//        String username = null;
//        String password = null;
//
//        Options options = new Options();
//        options.addOption("a", true, "Url of the GitHub API server, in format https://....com");
//        options.addOption("o", true, "Organization name");
//        options.addOption("d", true, "Download location");
//        options.addOption("u", true, "Username");
//        options.addOption("p", true, "Password");
//
//        CommandLineParser parser = new DefaultParser();
//        CommandLine cmd = parser.parse(options, args);
//
//        HelpFormatter formatter = new HelpFormatter();
//        formatter.printHelp("GitDownloader", options);
//
//        if (cmd.hasOption("o")) {
//            organization = cmd.getOptionValue("o");
//        } else {
//            log.error("You should enter an organization");
//            System.exit(0);
//        }
//        if (cmd.hasOption("a")) {
//            log.warn(cmd.getOptionValue("a"));
//            url = cmd.getOptionValue("a");
//            if(url.equals("https://github.com")){
//                url = "https://api.github.com/orgs/" + organization;
//            }else{
//                url = url + "/api/v3/orgs/" + organization;
//            }
//        } else {
//            log.error("You should enter an url");
//            System.exit(0);
//        }
//        if (cmd.hasOption("d")) {
//            downloadLocation = cmd.getOptionValue("d");
//        } else {
//            log.error("You should enter a download location");
//            System.exit(0);
//        }
//        if (cmd.hasOption("u")) {
//            username = cmd.getOptionValue("u");
//        } else {
//            log.error("You should enter an username");
//            System.exit(0);
//        }
//        if (cmd.hasOption("p")) {
//            password = cmd.getOptionValue("p");
//        } else {
//            log.error("You should enter a password");
//            System.exit(0);
//        }
//
//        String address = url + "/repos";
//
//        log.warn("Address: " + address);
//
//        UriComponentsBuilder builder = UriComponentsBuilder
//            .fromUriString(address)
//            .queryParam("per_page", 1000);
//
//        log.info("URL: " + builder.toUriString());
//        ResponseEntity<List<Repo>> repoList = restTemplate.exchange(builder.toUriString(),
//                                                                    HttpMethod.GET, null,
//                                                                    new ParameterizedTypeReference<List<Repo>>()
//                                                                {
//                                                                });
//        List<Repo> list = repoList.getBody();
//        log.info("Repos number: " + list.size());
//        final String downloaded = downloadLocation;
//        final String user = username;
//        final String pass = password;
//        list.parallelStream().forEach(r -> {
//            Path download = Paths.get(downloaded, r.getName());
//            try {
//                Files.createDirectories(download);
//            } catch (IOException ex) {
//                log.error("Error while creating directory: " + downloaded);
//            }
//            log.info("Cloning from " + r.getGit_url() + " to " + downloaded);
//            try (Git result = Git.cloneRepository()
//                .setURI(r.getGit_url())
//                .setCredentialsProvider(new UsernamePasswordCredentialsProvider(user, pass))
//                .setDirectory(download.toFile())
//                .call()) {
//                // Note: the call() returns an opened repository already which needs to be closed to avoid file handle leaks!
//                log.info("Having repository: " + result.getRepository().getDirectory());
//            } catch (GitAPIException ex) {
//                log.error("Big error: " + ex.getMessage());
//            }
//            log.warn("DONE! " + r.getName());
//        });
//        log.info("Completed!!!!!!!!!!!");
//    }
}
