package ru.doroshenko.domain;

import java.util.Date;

public class WallPost {
    private int id; // id поста
    private boolean isFixed; //прикреплён ли пост
    private Content content; // содержимое поста
    private boolean isCopied; // является ли пост репостом
    private int idCopyPost;// id исходного поста
    private Date dataCopyPost; // дата создания копии
    private String linkCopyPost; // ссылка на исходный пост
    private int replyOwnerId; //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId; //идентификатор записи, в ответ на которую была оставлена текущая
    private boolean onlyFriendsPost; //запись была создана с опцией «Только для друзей»
    private CommentPost commentPost;//  комментариии
    private Donut settingsPost;// донат
    private boolean isFavoritePost;// избранное
    private boolean canEditPost;//может ли текущий пользователь редактировать пост
    private boolean canDeletePost;//может ли текущий пользователь удалить пост

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public boolean isCopied() {
        return isCopied;
    }

    public void setCopied(boolean copied) {
        isCopied = copied;
    }

    public int getIdCopyPost() {
        return idCopyPost;
    }

    public void setIdCopyPost(int idCopyPost) {
        this.idCopyPost = idCopyPost;
    }

    public Date getDataCopyPost() {
        return dataCopyPost;
    }

    public void setDataCopyPost(Date dataCopyPost) {
        this.dataCopyPost = dataCopyPost;
    }

    public String getLinkCopyPost() {
        return linkCopyPost;
    }

    public void setLinkCopyPost(String linkCopyPost) {
        this.linkCopyPost = linkCopyPost;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean isOnlyFriendsPost() {
        return onlyFriendsPost;
    }

    public void setOnlyFriendsPost(boolean onlyFriendsPost) {
        this.onlyFriendsPost = onlyFriendsPost;
    }

    public CommentPost getCommentPost() {
        return commentPost;
    }

    public void setCommentPost(CommentPost commentPost) {
        this.commentPost = commentPost;
    }

    public Donut getSettingsPost() {
        return settingsPost;
    }

    public void setSettingsPost(Donut settingsPost) {
        this.settingsPost = settingsPost;
    }

    public boolean isFavoritePost() {
        return isFavoritePost;
    }

    public void setFavoritePost(boolean favoritePost) {
        isFavoritePost = favoritePost;
    }

    public boolean isCanEditPost() {
        return canEditPost;
    }

    public void setCanEditPost(boolean canEditPost) {
        this.canEditPost = canEditPost;
    }

    public boolean isCanDeletePost() {
        return canDeletePost;
    }

    public void setCanDeletePost(boolean canDeletePost) {
        this.canDeletePost = canDeletePost;
    }
}
