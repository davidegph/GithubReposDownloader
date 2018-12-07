package org.davide.github.githubdownloader.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
class Owner {
    private String login;
    private int id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private boolean site_admin;

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

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

    public String getAvatar_url()
    {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url)
    {
        this.avatar_url = avatar_url;
    }

    public String getGravatar_id()
    {
        return gravatar_id;
    }

    public void setGravatar_id(String gravatar_id)
    {
        this.gravatar_id = gravatar_id;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getHtml_url()
    {
        return html_url;
    }

    public void setHtml_url(String html_url)
    {
        this.html_url = html_url;
    }

    public String getFollowers_url()
    {
        return followers_url;
    }

    public void setFollowers_url(String followers_url)
    {
        this.followers_url = followers_url;
    }

    public String getFollowing_url()
    {
        return following_url;
    }

    public void setFollowing_url(String following_url)
    {
        this.following_url = following_url;
    }

    public String getGists_url()
    {
        return gists_url;
    }

    public void setGists_url(String gists_url)
    {
        this.gists_url = gists_url;
    }

    public String getStarred_url()
    {
        return starred_url;
    }

    public void setStarred_url(String starred_url)
    {
        this.starred_url = starred_url;
    }

    public String getSubscriptions_url()
    {
        return subscriptions_url;
    }

    public void setSubscriptions_url(String subscriptions_url)
    {
        this.subscriptions_url = subscriptions_url;
    }

    public String getOrganizations_url()
    {
        return organizations_url;
    }

    public void setOrganizations_url(String organizations_url)
    {
        this.organizations_url = organizations_url;
    }

    public String getRepos_url()
    {
        return repos_url;
    }

    public void setRepos_url(String repos_url)
    {
        this.repos_url = repos_url;
    }

    public String getEvents_url()
    {
        return events_url;
    }

    public void setEvents_url(String events_url)
    {
        this.events_url = events_url;
    }

    public String getReceived_events_url()
    {
        return received_events_url;
    }

    public void setReceived_events_url(String received_events_url)
    {
        this.received_events_url = received_events_url;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public boolean isSite_admin()
    {
        return site_admin;
    }

    public void setSite_admin(boolean site_admin)
    {
        this.site_admin = site_admin;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.login);
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.node_id);
        hash = 71 * hash + Objects.hashCode(this.avatar_url);
        hash = 71 * hash + Objects.hashCode(this.gravatar_id);
        hash = 71 * hash + Objects.hashCode(this.url);
        hash = 71 * hash + Objects.hashCode(this.html_url);
        hash = 71 * hash + Objects.hashCode(this.followers_url);
        hash = 71 * hash + Objects.hashCode(this.following_url);
        hash = 71 * hash + Objects.hashCode(this.gists_url);
        hash = 71 * hash + Objects.hashCode(this.starred_url);
        hash = 71 * hash + Objects.hashCode(this.subscriptions_url);
        hash = 71 * hash + Objects.hashCode(this.organizations_url);
        hash = 71 * hash + Objects.hashCode(this.repos_url);
        hash = 71 * hash + Objects.hashCode(this.events_url);
        hash = 71 * hash + Objects.hashCode(this.received_events_url);
        hash = 71 * hash + Objects.hashCode(this.type);
        hash = 71 * hash + (this.site_admin ? 1 : 0);
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
        final Owner other = (Owner) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.site_admin != other.site_admin) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.node_id, other.node_id)) {
            return false;
        }
        if (!Objects.equals(this.avatar_url, other.avatar_url)) {
            return false;
        }
        if (!Objects.equals(this.gravatar_id, other.gravatar_id)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.html_url, other.html_url)) {
            return false;
        }
        if (!Objects.equals(this.followers_url, other.followers_url)) {
            return false;
        }
        if (!Objects.equals(this.following_url, other.following_url)) {
            return false;
        }
        if (!Objects.equals(this.gists_url, other.gists_url)) {
            return false;
        }
        if (!Objects.equals(this.starred_url, other.starred_url)) {
            return false;
        }
        if (!Objects.equals(this.subscriptions_url, other.subscriptions_url)) {
            return false;
        }
        if (!Objects.equals(this.organizations_url, other.organizations_url)) {
            return false;
        }
        if (!Objects.equals(this.repos_url, other.repos_url)) {
            return false;
        }
        if (!Objects.equals(this.events_url, other.events_url)) {
            return false;
        }
        if (!Objects.equals(this.received_events_url, other.received_events_url)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Owner{" + "login=" + login + ", id=" + id + ", node_id=" + node_id + ", avatar_url=" + avatar_url + ", gravatar_id=" + gravatar_id + ", url=" + url + ", html_url=" + html_url + ", followers_url=" + followers_url + ", following_url=" + following_url + ", gists_url=" + gists_url + ", starred_url=" + starred_url + ", subscriptions_url=" + subscriptions_url + ", organizations_url=" + organizations_url + ", repos_url=" + repos_url + ", events_url=" + events_url + ", received_events_url=" + received_events_url + ", type=" + type + ", site_admin=" + site_admin + '}';
    }
    
    
}
