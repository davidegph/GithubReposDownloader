package org.davide.github.githubdownloader.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repo
{
    private int id;
    private String node_id;
    private String name;
    private String full_name;
    private Owner owner;
    @JsonProperty("private")
    private boolean privateProperty;
    private String html_url;
    private String description;
    private boolean fork;
    private String url;
    private String forks_url;
    private String keys_url;
    private String collaborators_url;
    private String teams_url;
    private String hooks_url;
    private String issue_events_url;
    private String events_url;
    private String assignees_url;
    private String branches_url;
    private String tags_url;
    private String blobs_url;
    private String git_tags_url;
    private String git_refs_url;
    private String trees_url;
    private String statuses_url;
    private String languages_url;
    private String stargazers_url;
    private String contributors_url;
    private String subscribers_url;
    private String subscription_url;
    private String commits_url;
    private String git_commits_url;
    private String comments_url;
    private String issue_comment_url;
    private String contents_url;
    private String compare_url;
    private String merges_url;
    private String archive_url;
    private String downloads_url;
    private String issues_url;
    private String pulls_url;
    private String milestons_url;
    private String notifications_url;
    private String labels_url;
    private String releases_url;
    private String deployments_url;
    // date
    private String created_at;
    // date
    private String updated_at;
    //date
    private String pushed_at;
    private String git_url;
    private String ssh_url;
    private String clone_url;
    private String svn_url;
    private String homepage;
    private int size;
    private int stagazers_count;
    private int watchers_count;
    private String language;
    private boolean has_issues;
    private boolean has_projects;
    private boolean has_downloads;
    private boolean has_wiki;
    private boolean has_pages;
    private int forks_count;
    private String mirror_url;
    private boolean archived;
    private int open_issues_count;
    private License license;
    private int forks;
    private int open_issues;
    private int watchers;
    private String default_branch;
    private Permissions permissions;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNode_id()
    {
        return node_id;
    }

    public void setNode_id(String node_id)
    {
        this.node_id = node_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getFull_name()
    {
        return full_name;
    }

    public void setFull_name(String full_name)
    {
        this.full_name = full_name;
    }

    public Owner getOwner()
    {
        return owner;
    }

    public void setOwner(Owner owner)
    {
        this.owner = owner;
    }

    public boolean isPrivateProperty()
    {
        return privateProperty;
    }

    public void setPrivateProperty(boolean privateProperty)
    {
        this.privateProperty = privateProperty;
    }

    public String getHtml_url()
    {
        return html_url;
    }

    public void setHtml_url(String html_url)
    {
        this.html_url = html_url;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean isFork()
    {
        return fork;
    }

    public void setFork(boolean fork)
    {
        this.fork = fork;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getForks_url()
    {
        return forks_url;
    }

    public void setForks_url(String forks_url)
    {
        this.forks_url = forks_url;
    }

    public String getKeys_url()
    {
        return keys_url;
    }

    public void setKeys_url(String keys_url)
    {
        this.keys_url = keys_url;
    }

    public String getCollaborators_url()
    {
        return collaborators_url;
    }

    public void setCollaborators_url(String collaborators_url)
    {
        this.collaborators_url = collaborators_url;
    }

    public String getTeams_url()
    {
        return teams_url;
    }

    public void setTeams_url(String teams_url)
    {
        this.teams_url = teams_url;
    }

    public String getHooks_url()
    {
        return hooks_url;
    }

    public void setHooks_url(String hooks_url)
    {
        this.hooks_url = hooks_url;
    }

    public String getIssue_events_url()
    {
        return issue_events_url;
    }

    public void setIssue_events_url(String issue_events_url)
    {
        this.issue_events_url = issue_events_url;
    }

    public String getEvents_url()
    {
        return events_url;
    }

    public void setEvents_url(String events_url)
    {
        this.events_url = events_url;
    }

    public String getAssignees_url()
    {
        return assignees_url;
    }

    public void setAssignees_url(String assignees_url)
    {
        this.assignees_url = assignees_url;
    }

    public String getBranches_url()
    {
        return branches_url;
    }

    public void setBranches_url(String branches_url)
    {
        this.branches_url = branches_url;
    }

    public String getTags_url()
    {
        return tags_url;
    }

    public void setTags_url(String tags_url)
    {
        this.tags_url = tags_url;
    }

    public String getBlobs_url()
    {
        return blobs_url;
    }

    public void setBlobs_url(String blobs_url)
    {
        this.blobs_url = blobs_url;
    }

    public String getGit_tags_url()
    {
        return git_tags_url;
    }

    public void setGit_tags_url(String git_tags_url)
    {
        this.git_tags_url = git_tags_url;
    }

    public String getGit_refs_url()
    {
        return git_refs_url;
    }

    public void setGit_refs_url(String git_refs_url)
    {
        this.git_refs_url = git_refs_url;
    }

    public String getTrees_url()
    {
        return trees_url;
    }

    public void setTrees_url(String trees_url)
    {
        this.trees_url = trees_url;
    }

    public String getStatuses_url()
    {
        return statuses_url;
    }

    public void setStatuses_url(String statuses_url)
    {
        this.statuses_url = statuses_url;
    }

    public String getLanguages_url()
    {
        return languages_url;
    }

    public void setLanguages_url(String languages_url)
    {
        this.languages_url = languages_url;
    }

    public String getStargazers_url()
    {
        return stargazers_url;
    }

    public void setStargazers_url(String stargazers_url)
    {
        this.stargazers_url = stargazers_url;
    }

    public String getContributors_url()
    {
        return contributors_url;
    }

    public void setContributors_url(String contributors_url)
    {
        this.contributors_url = contributors_url;
    }

    public String getSubscribers_url()
    {
        return subscribers_url;
    }

    public void setSubscribers_url(String subscribers_url)
    {
        this.subscribers_url = subscribers_url;
    }

    public String getSubscription_url()
    {
        return subscription_url;
    }

    public void setSubscription_url(String subscription_url)
    {
        this.subscription_url = subscription_url;
    }

    public String getCommits_url()
    {
        return commits_url;
    }

    public void setCommits_url(String commits_url)
    {
        this.commits_url = commits_url;
    }

    public String getGit_commits_url()
    {
        return git_commits_url;
    }

    public void setGit_commits_url(String git_commits_url)
    {
        this.git_commits_url = git_commits_url;
    }

    public String getComments_url()
    {
        return comments_url;
    }

    public void setComments_url(String comments_url)
    {
        this.comments_url = comments_url;
    }

    public String getIssue_comment_url()
    {
        return issue_comment_url;
    }

    public void setIssue_comment_url(String issue_comment_url)
    {
        this.issue_comment_url = issue_comment_url;
    }

    public String getContents_url()
    {
        return contents_url;
    }

    public void setContents_url(String contents_url)
    {
        this.contents_url = contents_url;
    }

    public String getCompare_url()
    {
        return compare_url;
    }

    public void setCompare_url(String compare_url)
    {
        this.compare_url = compare_url;
    }

    public String getMerges_url()
    {
        return merges_url;
    }

    public void setMerges_url(String merges_url)
    {
        this.merges_url = merges_url;
    }

    public String getArchive_url()
    {
        return archive_url;
    }

    public void setArchive_url(String archive_url)
    {
        this.archive_url = archive_url;
    }

    public String getDownloads_url()
    {
        return downloads_url;
    }

    public void setDownloads_url(String downloads_url)
    {
        this.downloads_url = downloads_url;
    }

    public String getIssues_url()
    {
        return issues_url;
    }

    public void setIssues_url(String issues_url)
    {
        this.issues_url = issues_url;
    }

    public String getPulls_url()
    {
        return pulls_url;
    }

    public void setPulls_url(String pulls_url)
    {
        this.pulls_url = pulls_url;
    }

    public String getMilestons_url()
    {
        return milestons_url;
    }

    public void setMilestons_url(String milestons_url)
    {
        this.milestons_url = milestons_url;
    }

    public String getNotifications_url()
    {
        return notifications_url;
    }

    public void setNotifications_url(String notifications_url)
    {
        this.notifications_url = notifications_url;
    }

    public String getLabels_url()
    {
        return labels_url;
    }

    public void setLabels_url(String labels_url)
    {
        this.labels_url = labels_url;
    }

    public String getReleases_url()
    {
        return releases_url;
    }

    public void setReleases_url(String releases_url)
    {
        this.releases_url = releases_url;
    }

    public String getDeployments_url()
    {
        return deployments_url;
    }

    public void setDeployments_url(String deployments_url)
    {
        this.deployments_url = deployments_url;
    }

    public String getCreated_at()
    {
        return created_at;
    }

    public void setCreated_at(String created_at)
    {
        this.created_at = created_at;
    }

    public String getUpdated_at()
    {
        return updated_at;
    }

    public void setUpdated_at(String updated_at)
    {
        this.updated_at = updated_at;
    }

    public String getPushed_at()
    {
        return pushed_at;
    }

    public void setPushed_at(String pushed_at)
    {
        this.pushed_at = pushed_at;
    }

    public String getGit_url()
    {
        return git_url;
    }

    public void setGit_url(String git_url)
    {
        this.git_url = git_url;
    }

    public String getSsh_url()
    {
        return ssh_url;
    }

    public void setSsh_url(String ssh_url)
    {
        this.ssh_url = ssh_url;
    }

    public String getClone_url()
    {
        return clone_url;
    }

    public void setClone_url(String clone_url)
    {
        this.clone_url = clone_url;
    }

    public String getSvn_url()
    {
        return svn_url;
    }

    public void setSvn_url(String svn_url)
    {
        this.svn_url = svn_url;
    }

    public String getHomepage()
    {
        return homepage;
    }

    public void setHomepage(String homepage)
    {
        this.homepage = homepage;
    }

    public int getSize()
    {
        return size;
    }

    public void setSize(int size)
    {
        this.size = size;
    }

    public int getStagazers_count()
    {
        return stagazers_count;
    }

    public void setStagazers_count(int stagazers_count)
    {
        this.stagazers_count = stagazers_count;
    }

    public int getWatchers_count()
    {
        return watchers_count;
    }

    public void setWatchers_count(int watchers_count)
    {
        this.watchers_count = watchers_count;
    }

    public String getLanguage()
    {
        return language;
    }

    public void setLanguage(String language)
    {
        this.language = language;
    }

    public boolean isHas_issues()
    {
        return has_issues;
    }

    public void setHas_issues(boolean has_issues)
    {
        this.has_issues = has_issues;
    }

    public boolean isHas_projects()
    {
        return has_projects;
    }

    public void setHas_projects(boolean has_projects)
    {
        this.has_projects = has_projects;
    }

    public boolean isHas_downloads()
    {
        return has_downloads;
    }

    public void setHas_downloads(boolean has_downloads)
    {
        this.has_downloads = has_downloads;
    }

    public boolean isHas_wiki()
    {
        return has_wiki;
    }

    public void setHas_wiki(boolean has_wiki)
    {
        this.has_wiki = has_wiki;
    }

    public boolean isHas_pages()
    {
        return has_pages;
    }

    public void setHas_pages(boolean has_pages)
    {
        this.has_pages = has_pages;
    }

    public int getForks_count()
    {
        return forks_count;
    }

    public void setForks_count(int forks_count)
    {
        this.forks_count = forks_count;
    }

    public String getMirror_url()
    {
        return mirror_url;
    }

    public void setMirror_url(String mirror_url)
    {
        this.mirror_url = mirror_url;
    }

    public boolean isArchived()
    {
        return archived;
    }

    public void setArchived(boolean archived)
    {
        this.archived = archived;
    }

    public int getOpen_issues_count()
    {
        return open_issues_count;
    }

    public void setOpen_issues_count(int open_issues_count)
    {
        this.open_issues_count = open_issues_count;
    }

    public int getForks()
    {
        return forks;
    }

    public void setForks(int forks)
    {
        this.forks = forks;
    }

    public int getOpen_issues()
    {
        return open_issues;
    }

    public void setOpen_issues(int open_issues)
    {
        this.open_issues = open_issues;
    }

    public int getWatchers()
    {
        return watchers;
    }

    public void setWatchers(int watchers)
    {
        this.watchers = watchers;
    }

    public String getDefault_branch()
    {
        return default_branch;
    }

    public void setDefault_branch(String default_branch)
    {
        this.default_branch = default_branch;
    }

    public Permissions getPermissions()
    {
        return permissions;
    }

    public void setPermissions(Permissions permissions)
    {
        this.permissions = permissions;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.node_id);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.full_name);
        hash = 89 * hash + Objects.hashCode(this.owner);
        hash = 89 * hash + (this.privateProperty ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.html_url);
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + (this.fork ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.url);
        hash = 89 * hash + Objects.hashCode(this.forks_url);
        hash = 89 * hash + Objects.hashCode(this.keys_url);
        hash = 89 * hash + Objects.hashCode(this.collaborators_url);
        hash = 89 * hash + Objects.hashCode(this.teams_url);
        hash = 89 * hash + Objects.hashCode(this.hooks_url);
        hash = 89 * hash + Objects.hashCode(this.issue_events_url);
        hash = 89 * hash + Objects.hashCode(this.events_url);
        hash = 89 * hash + Objects.hashCode(this.assignees_url);
        hash = 89 * hash + Objects.hashCode(this.branches_url);
        hash = 89 * hash + Objects.hashCode(this.tags_url);
        hash = 89 * hash + Objects.hashCode(this.blobs_url);
        hash = 89 * hash + Objects.hashCode(this.git_tags_url);
        hash = 89 * hash + Objects.hashCode(this.git_refs_url);
        hash = 89 * hash + Objects.hashCode(this.trees_url);
        hash = 89 * hash + Objects.hashCode(this.statuses_url);
        hash = 89 * hash + Objects.hashCode(this.languages_url);
        hash = 89 * hash + Objects.hashCode(this.stargazers_url);
        hash = 89 * hash + Objects.hashCode(this.contributors_url);
        hash = 89 * hash + Objects.hashCode(this.subscribers_url);
        hash = 89 * hash + Objects.hashCode(this.subscription_url);
        hash = 89 * hash + Objects.hashCode(this.commits_url);
        hash = 89 * hash + Objects.hashCode(this.git_commits_url);
        hash = 89 * hash + Objects.hashCode(this.comments_url);
        hash = 89 * hash + Objects.hashCode(this.issue_comment_url);
        hash = 89 * hash + Objects.hashCode(this.contents_url);
        hash = 89 * hash + Objects.hashCode(this.compare_url);
        hash = 89 * hash + Objects.hashCode(this.merges_url);
        hash = 89 * hash + Objects.hashCode(this.archive_url);
        hash = 89 * hash + Objects.hashCode(this.downloads_url);
        hash = 89 * hash + Objects.hashCode(this.issues_url);
        hash = 89 * hash + Objects.hashCode(this.pulls_url);
        hash = 89 * hash + Objects.hashCode(this.milestons_url);
        hash = 89 * hash + Objects.hashCode(this.notifications_url);
        hash = 89 * hash + Objects.hashCode(this.labels_url);
        hash = 89 * hash + Objects.hashCode(this.releases_url);
        hash = 89 * hash + Objects.hashCode(this.deployments_url);
        hash = 89 * hash + Objects.hashCode(this.created_at);
        hash = 89 * hash + Objects.hashCode(this.updated_at);
        hash = 89 * hash + Objects.hashCode(this.pushed_at);
        hash = 89 * hash + Objects.hashCode(this.git_url);
        hash = 89 * hash + Objects.hashCode(this.ssh_url);
        hash = 89 * hash + Objects.hashCode(this.clone_url);
        hash = 89 * hash + Objects.hashCode(this.svn_url);
        hash = 89 * hash + Objects.hashCode(this.homepage);
        hash = 89 * hash + this.size;
        hash = 89 * hash + this.stagazers_count;
        hash = 89 * hash + this.watchers_count;
        hash = 89 * hash + Objects.hashCode(this.language);
        hash = 89 * hash + (this.has_issues ? 1 : 0);
        hash = 89 * hash + (this.has_projects ? 1 : 0);
        hash = 89 * hash + (this.has_downloads ? 1 : 0);
        hash = 89 * hash + (this.has_wiki ? 1 : 0);
        hash = 89 * hash + (this.has_pages ? 1 : 0);
        hash = 89 * hash + this.forks_count;
        hash = 89 * hash + Objects.hashCode(this.mirror_url);
        hash = 89 * hash + (this.archived ? 1 : 0);
        hash = 89 * hash + this.open_issues_count;
        hash = 89 * hash + Objects.hashCode(this.license);
        hash = 89 * hash + this.forks;
        hash = 89 * hash + this.open_issues;
        hash = 89 * hash + this.watchers;
        hash = 89 * hash + Objects.hashCode(this.default_branch);
        hash = 89 * hash + Objects.hashCode(this.permissions);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Repo other = (Repo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.privateProperty != other.privateProperty) {
            return false;
        }
        if (this.fork != other.fork) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.stagazers_count != other.stagazers_count) {
            return false;
        }
        if (this.watchers_count != other.watchers_count) {
            return false;
        }
        if (this.has_issues != other.has_issues) {
            return false;
        }
        if (this.has_projects != other.has_projects) {
            return false;
        }
        if (this.has_downloads != other.has_downloads) {
            return false;
        }
        if (this.has_wiki != other.has_wiki) {
            return false;
        }
        if (this.has_pages != other.has_pages) {
            return false;
        }
        if (this.forks_count != other.forks_count) {
            return false;
        }
        if (this.archived != other.archived) {
            return false;
        }
        if (this.open_issues_count != other.open_issues_count) {
            return false;
        }
        if (this.forks != other.forks) {
            return false;
        }
        if (this.open_issues != other.open_issues) {
            return false;
        }
        if (this.watchers != other.watchers) {
            return false;
        }
        if (!Objects.equals(this.node_id, other.node_id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.full_name, other.full_name)) {
            return false;
        }
        if (!Objects.equals(this.html_url, other.html_url)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.forks_url, other.forks_url)) {
            return false;
        }
        if (!Objects.equals(this.keys_url, other.keys_url)) {
            return false;
        }
        if (!Objects.equals(this.collaborators_url, other.collaborators_url)) {
            return false;
        }
        if (!Objects.equals(this.teams_url, other.teams_url)) {
            return false;
        }
        if (!Objects.equals(this.hooks_url, other.hooks_url)) {
            return false;
        }
        if (!Objects.equals(this.issue_events_url, other.issue_events_url)) {
            return false;
        }
        if (!Objects.equals(this.events_url, other.events_url)) {
            return false;
        }
        if (!Objects.equals(this.assignees_url, other.assignees_url)) {
            return false;
        }
        if (!Objects.equals(this.branches_url, other.branches_url)) {
            return false;
        }
        if (!Objects.equals(this.tags_url, other.tags_url)) {
            return false;
        }
        if (!Objects.equals(this.blobs_url, other.blobs_url)) {
            return false;
        }
        if (!Objects.equals(this.git_tags_url, other.git_tags_url)) {
            return false;
        }
        if (!Objects.equals(this.git_refs_url, other.git_refs_url)) {
            return false;
        }
        if (!Objects.equals(this.trees_url, other.trees_url)) {
            return false;
        }
        if (!Objects.equals(this.statuses_url, other.statuses_url)) {
            return false;
        }
        if (!Objects.equals(this.languages_url, other.languages_url)) {
            return false;
        }
        if (!Objects.equals(this.stargazers_url, other.stargazers_url)) {
            return false;
        }
        if (!Objects.equals(this.contributors_url, other.contributors_url)) {
            return false;
        }
        if (!Objects.equals(this.subscribers_url, other.subscribers_url)) {
            return false;
        }
        if (!Objects.equals(this.subscription_url, other.subscription_url)) {
            return false;
        }
        if (!Objects.equals(this.commits_url, other.commits_url)) {
            return false;
        }
        if (!Objects.equals(this.git_commits_url, other.git_commits_url)) {
            return false;
        }
        if (!Objects.equals(this.comments_url, other.comments_url)) {
            return false;
        }
        if (!Objects.equals(this.issue_comment_url, other.issue_comment_url)) {
            return false;
        }
        if (!Objects.equals(this.contents_url, other.contents_url)) {
            return false;
        }
        if (!Objects.equals(this.compare_url, other.compare_url)) {
            return false;
        }
        if (!Objects.equals(this.merges_url, other.merges_url)) {
            return false;
        }
        if (!Objects.equals(this.archive_url, other.archive_url)) {
            return false;
        }
        if (!Objects.equals(this.downloads_url, other.downloads_url)) {
            return false;
        }
        if (!Objects.equals(this.issues_url, other.issues_url)) {
            return false;
        }
        if (!Objects.equals(this.pulls_url, other.pulls_url)) {
            return false;
        }
        if (!Objects.equals(this.milestons_url, other.milestons_url)) {
            return false;
        }
        if (!Objects.equals(this.notifications_url, other.notifications_url)) {
            return false;
        }
        if (!Objects.equals(this.labels_url, other.labels_url)) {
            return false;
        }
        if (!Objects.equals(this.releases_url, other.releases_url)) {
            return false;
        }
        if (!Objects.equals(this.deployments_url, other.deployments_url)) {
            return false;
        }
        if (!Objects.equals(this.created_at, other.created_at)) {
            return false;
        }
        if (!Objects.equals(this.updated_at, other.updated_at)) {
            return false;
        }
        if (!Objects.equals(this.pushed_at, other.pushed_at)) {
            return false;
        }
        if (!Objects.equals(this.git_url, other.git_url)) {
            return false;
        }
        if (!Objects.equals(this.ssh_url, other.ssh_url)) {
            return false;
        }
        if (!Objects.equals(this.clone_url, other.clone_url)) {
            return false;
        }
        if (!Objects.equals(this.svn_url, other.svn_url)) {
            return false;
        }
        if (!Objects.equals(this.homepage, other.homepage)) {
            return false;
        }
        if (!Objects.equals(this.language, other.language)) {
            return false;
        }
        if (!Objects.equals(this.mirror_url, other.mirror_url)) {
            return false;
        }
        if (!Objects.equals(this.license, other.license)) {
            return false;
        }
        if (!Objects.equals(this.default_branch, other.default_branch)) {
            return false;
        }
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        if (!Objects.equals(this.permissions, other.permissions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Repo{" + "id=" + id + ", node_id=" + node_id + ", name=" + name + ", full_name=" + full_name + ", owner=" + owner + ", privateProperty=" + privateProperty + ", html_url=" + html_url + ", description=" + description + ", fork=" + fork + ", url=" + url + ", forks_url=" + forks_url + ", keys_url=" + keys_url + ", collaborators_url=" + collaborators_url + ", teams_url=" + teams_url + ", hooks_url=" + hooks_url + ", issue_events_url=" + issue_events_url + ", events_url=" + events_url + ", assignees_url=" + assignees_url + ", branches_url=" + branches_url + ", tags_url=" + tags_url + ", blobs_url=" + blobs_url + ", git_tags_url=" + git_tags_url + ", git_refs_url=" + git_refs_url + ", trees_url=" + trees_url + ", statuses_url=" + statuses_url + ", languages_url=" + languages_url + ", stargazers_url=" + stargazers_url + ", contributors_url=" + contributors_url + ", subscribers_url=" + subscribers_url + ", subscription_url=" + subscription_url + ", commits_url=" + commits_url + ", git_commits_url=" + git_commits_url + ", comments_url=" + comments_url + ", issue_comment_url=" + issue_comment_url + ", contents_url=" + contents_url + ", compare_url=" + compare_url + ", merges_url=" + merges_url + ", archive_url=" + archive_url + ", downloads_url=" + downloads_url + ", issues_url=" + issues_url + ", pulls_url=" + pulls_url + ", milestons_url=" + milestons_url + ", notifications_url=" + notifications_url + ", labels_url=" + labels_url + ", releases_url=" + releases_url + ", deployments_url=" + deployments_url + ", created_at=" + created_at + ", updated_at=" + updated_at + ", pushed_at=" + pushed_at + ", git_url=" + git_url + ", ssh_url=" + ssh_url + ", clone_url=" + clone_url + ", svn_url=" + svn_url + ", homepage=" + homepage + ", size=" + size + ", stagazers_count=" + stagazers_count + ", watchers_count=" + watchers_count + ", language=" + language + ", has_issues=" + has_issues + ", has_projects=" + has_projects + ", has_downloads=" + has_downloads + ", has_wiki=" + has_wiki + ", has_pages=" + has_pages + ", forks_count=" + forks_count + ", mirror_url=" + mirror_url + ", archived=" + archived + ", open_issues_count=" + open_issues_count + ", license=" + license + ", forks=" + forks + ", open_issues=" + open_issues + ", watchers=" + watchers + ", default_branch=" + default_branch + ", permissions=" + permissions + '}';
    }

    public License getLicense()
    {
        return license;
    }

    public void setLicense(License license)
    {
        this.license = license;
    }

}
