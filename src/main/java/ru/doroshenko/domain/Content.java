package ru.doroshenko.domain;

public class Content {
    private PostContent postContent;
    private PostHeader postHeader;

    public PostContent getPostContent() {
        return postContent;
    }

    public void setPostContent(PostContent postContent) {
        this.postContent = postContent;
    }

    public PostHeader getPostHeader() {
        return postHeader;
    }

    public void setPostHeader(PostHeader postHeader) {
        this.postHeader = postHeader;
    }
}
