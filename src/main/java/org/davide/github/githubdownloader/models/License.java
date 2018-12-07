package org.davide.github.githubdownloader.models;

import java.util.Objects;

public class License
{
    private String key;
    private String name;
    private String spdx_id;
    private String url;
    private String node_id;

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSpdx_id()
    {
        return spdx_id;
    }

    public void setSpdx_id(String spdx_id)
    {
        this.spdx_id = spdx_id;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getNode_id()
    {
        return node_id;
    }

    public void setNode_id(String node_id)
    {
        this.node_id = node_id;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.key);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.spdx_id);
        hash = 67 * hash + Objects.hashCode(this.url);
        hash = 67 * hash + Objects.hashCode(this.node_id);
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
        final License other = (License) obj;
        if (!Objects.equals(this.key, other.key)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.spdx_id, other.spdx_id)) {
            return false;
        }
        if (!Objects.equals(this.url, other.url)) {
            return false;
        }
        if (!Objects.equals(this.node_id, other.node_id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "License{" + "key=" + key + ", name=" + name + ", spdx_id=" + spdx_id + ", url=" + url + ", node_id=" + node_id + '}';
    }
    
    
}
