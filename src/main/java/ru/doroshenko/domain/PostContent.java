package ru.doroshenko.domain;

public class PostContent {
    private String postText;
    private Attachments attachments;
    private LikeWrap likeWrap;

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public Attachments getAttachments() {
        return attachments;
    }

    public void setAttachments(Attachments attachments) {
        this.attachments = attachments;
    }

    public LikeWrap getLikeWrap() {
        return likeWrap;
    }

    public void setLikeWrap(LikeWrap likeWrap) {
        this.likeWrap = likeWrap;
    }
}
