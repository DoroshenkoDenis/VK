package ru.doroshenko.domain;

import java.util.Date;

public class PostHeaderInfo {
    private String linkPostOwner;
    private int idPostOwner;
    private String namePostOwner;
    private Date postDate;

    public String getLinkPostOwner() {
        return linkPostOwner;
    }

    public void setLinkPostOwner(String linkPostOwner) {
        this.linkPostOwner = linkPostOwner;
    }

    public int getIdPostOwner() {
        return idPostOwner;
    }

    public void setIdPostOwner(int idPostOwner) {
        this.idPostOwner = idPostOwner;
    }

    public String getNamePostOwner() {
        return namePostOwner;
    }

    public void setNamePostOwner(String namePostOwner) {
        this.namePostOwner = namePostOwner;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }
}
