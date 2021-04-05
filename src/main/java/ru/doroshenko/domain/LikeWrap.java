package ru.doroshenko.domain;

import java.awt.*;

public class LikeWrap {
    private int likeCount;//счётчик числа пользователей, которым понравилась запись
    private Image likeBtnImg;
    private String textLikeCount;//текст - "число пользователей, которым понравилась запись"
    private int userLikes;// наличие отметки «Мне нравится» от текущего пользователя
    private boolean canLike;//информация о том, может ли текущий пользователь поставить отметку «Мне нравится»

    private boolean canPublish;//информация о том, может ли текущий пользователь сделать репост записи
    private Image commentImg; // картинка - заглушка
    private Image repostBtnImg;// картинка - заглушка
    private Image viewImg;//картинка - заглушка
    private int viewCount;//счётчик числа просмотров
    private String viewCountText;//текст -"числа просмотров"




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

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }

    public String getViewCountText() {
        return viewCountText;
    }

    public void setViewCountText(String viewCountText) {
        this.viewCountText = viewCountText;
    }
}
