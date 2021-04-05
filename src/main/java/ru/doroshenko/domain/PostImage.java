package ru.doroshenko.domain;

public class PostImage {
    private String linkPostOwner;
    private String linkPostOwnerImg;
    private int width;
    private int height;

    public String getLinkPostOwner() {
        return linkPostOwner;
    }

    public void setLinkPostOwner(String linkPostOwner) {
        this.linkPostOwner = linkPostOwner;
    }

    public String getLinkPostOwnerImg() {
        return linkPostOwnerImg;
    }

    public void setLinkPostOwnerImg(String linkPostOwnerImg) {
        this.linkPostOwnerImg = linkPostOwnerImg;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
