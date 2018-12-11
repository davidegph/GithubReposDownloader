package org.davide.github.githubdownloader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.davide.github.githubdownloader.core.GithubUrlBuilder;
import org.davide.github.githubdownloader.models.Repo;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootApplication
public class App implements CommandLineRunner
{
    private static final Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder)
    {
        return builder.build();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void run(String... args) throws Exception
    {
        String downloadLocation = null;
        String username = null;
        String password = null;

        Options options = getOptions();

        HelpFormatter formatter = new HelpFormatter();
        String header = "Do something useful with an input file\n\n";
        String footer = "\nPlease report issues at http://example.com/issues";
        formatter.printHelp("GitDownloader", header, options, footer, true);

        GithubUrlBuilder urlBuilder = new GithubUrlBuilder();
        CommandLineParser parser = new DefaultParser();

        validateInputs(parser);

        try {
            if (cmd.hasOption("h")) {
                formatter.printHelp("GitDownloader", header, options, footer, true);
                continue;
            }
            if (cmd.hasOption("a")) {
                urlBuilder.setUrl(cmd.getOptionValue("a"));
            }
            if (cmd.hasOption("o")) {
                urlBuilder.setOrganization(cmd.getOptionValue("o"));
            } else {
                throw new ParseException("You should enter an organization");
            }
            if (cmd.hasOption("d")) {
                downloadLocation = cmd.getOptionValue("d");
            } else {
                downloadLocation = Paths.get("DefaultDownloadLocation").toString();
            }
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
            break;
        } catch (ParseException exp) {
            log.error("Something went wrong parsing your command... Please, try again. Error message: " + exp.getMessage());
            formatter.printHelp("GitDownloader", header, options, footer, true);
        }

        UriComponentsBuilder queryBuilder = UriComponentsBuilder
            .fromUriString(urlBuilder.build())
            .queryParam("per_page", 1000);

        log.info("URL: " + queryBuilder.toUriString());
        ResponseEntity<List<Repo>> repoList = restTemplate.exchange(queryBuilder.toUriString(),
                                                                    HttpMethod.GET, null,
                                                                    new ParameterizedTypeReference<List<Repo>>()
                                                                {
                                                                });
        List<Repo> list = repoList.getBody();
        log.error("Repos number: " + list.size());
        final Path createdDirectory = Files.createDirectory(Paths.get(downloadLocation));

        list.parallelStream().forEach(r -> {
            Path download = Paths.get(createdDirectory.toString(), r.getName());
            try {
                Files.createDirectory(download);
            } catch (IOException ex) {
                log.error("Error while creating directory: " + download);
            }
            log.info("Cloning from " + r.getGit_url() + " to " + download);

            try (Git result = Git.cloneRepository()
                .setURI(r.getGit_url())
                //.setCredentialsProvider(new UsernamePasswordCredentialsProvider(user, pass))
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

    private static Options getOptions()
    {
        // url option
        Option urlOption = Option.builder("a")
            .longOpt("url")
            .desc("Url of the GitHub API server, in the format https://....com")
            .numberOfArgs(1)
            .required(false)
            .build();

        // organization option
        Option organizationOption = Option.builder("o")
            .longOpt("organization")
            .desc("Organization name")
            .numberOfArgs(1)
            .required(true)
            .build();

        // download location option
        Option downloadLocationOption = Option.builder("d")
            .longOpt("downloadLocation")
            .desc("Download location. By default is DefaultDownloadLocation")
            .numberOfArgs(1)
            .required(false)
            .build();

        // username option
        Option usernameOption = Option.builder("u")
            .longOpt("username")
            .desc("Username, only needed for private repos")
            .numberOfArgs(1)
            .required(false)
            .build();

        // password option
        Option passwordOption = Option.builder("p")
            .longOpt("password")
            .desc("Password, only needed for private repos")
            .numberOfArgs(1)
            .required(false)
            .build();

        // help option
        Option helpOption = Option.builder("h")
            .longOpt("help")
            .desc("Print this help information")
            .hasArg(false)
            .required(false)
            .build();

        Options options = new Options();
        options.addOption(urlOption);
        options.addOption(organizationOption);
        options.addOption(downloadLocationOption);
        options.addOption(usernameOption);
        options.addOption(passwordOption);
        options.addOption(helpOption);

        return options;
    }

    private boolean validateInputs(CommandLineParser parser, Options options, String... args)
    {
        CommandLine cmd = parser.parse(options, args);
        if (cmd.getOptions().length == 0) {
            return false;
        } else if (!cmd.hasOption("o")) {
            return false;
        } else {
            return true;
        }
    }

}
