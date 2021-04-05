package ru.doroshenko.domain;

public class PostHeader {
    private PostImage postImage;
    private PostHeaderInfo postHeaderInfo;

    public PostImage getPostImage() {
        return postImage;
    }

    public void setPostImage(PostImage postImage) {
        this.postImage = postImage;
    }

    public PostHeaderInfo getPostHeaderInfo() {
        return postHeaderInfo;
    }

    public void setPostHeaderInfo(PostHeaderInfo postHeaderInfo) {
        this.postHeaderInfo = postHeaderInfo;
    }
}
