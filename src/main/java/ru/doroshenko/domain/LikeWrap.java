package ru.doroshenko.domain;

import java.awt.*;

public class LikeWrap {
    private int likeCount;
    private Image likeBtnImg;
    private String textLikeCount;

    private Image commentImg; // заглушка
    private Image repostBtnImg;// заглушка
    private Image viewImg;
    private int viewCount;

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public Image getLikeBtnImg() {
        return likeBtnImg;
    }

    public void setLikeBtnImg(Image likeBtnImg) {
        this.likeBtnImg = likeBtnImg;
    }

    public String getTextLikeCount() {
        return textLikeCount;
    }

    public void setTextLikeCount(String textLikeCount) {
        this.textLikeCount = textLikeCount;
    }

    public Image getCommentImg() {
        return commentImg;
    }

    public void setCommentImg(Image commentImg) {
        this.commentImg = commentImg;
    }

    public Image getRepostBtnImg() {
        return repostBtnImg;
    }

    public void setRepostBtnImg(Image repostBtnImg) {
        this.repostBtnImg = repostBtnImg;
    }

    public Image getViewImg() {
        return viewImg;
    }

    public void setViewImg(Image viewImg) {
        this.viewImg = viewImg;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
