package org.davide.github.githubdownloader.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
class Permissions {
    private boolean admin;
    private boolean push;
    private boolean pull;

    public boolean isAdmin()
    {
        return admin;
    }

    public void setAdmin(boolean admin)
    {
        this.admin = admin;
    }

    public boolean isPush()
    {
        return push;
    }

    public void setPush(boolean push)
    {
        this.push = push;
    }

    public boolean isPull()
    {
        return pull;
    }

    public void setPull(boolean pull)
    {
        this.pull = pull;
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 23 * hash + (this.admin ? 1 : 0);
        hash = 23 * hash + (this.push ? 1 : 0);
        hash = 23 * hash + (this.pull ? 1 : 0);
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
        final Permissions other = (Permissions) obj;
        if (this.admin != other.admin) {
            return false;
        }
        if (this.push != other.push) {
            return false;
        }
        if (this.pull != other.pull) {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "Permissions{" + "admin=" + admin + ", push=" + push + ", pull=" + pull + '}';
    }
    
    
}
