package org.davide.github.githubdownloader.core;

public class GithubUrlBuilder
{
    private String url;
    private GithubEnum type;
    private String organization;

    public GithubUrlBuilder setUrl(String url)
    {
        this.url = url;
        return this;
    }

    public GithubUrlBuilder setType(GithubEnum type)
    {
        this.type = type;
        return this;
    }

    public GithubUrlBuilder setOrganization(String organization)
    {
        this.organization = organization;
        return this;
    }

    public String build()
    {
        if (this.url == null) {
            this.url = "https://api.github.com/orgs/";
        } else {
            this.url = this.url + "/api/v3/orgs/";
        }
        return this.url + this.organization + "/repos";
    }

    public String getUrl()
    {
        return url;
    }

    public GithubEnum getType()
    {
        return type;
    }

}
