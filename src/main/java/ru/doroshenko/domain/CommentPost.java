package ru.doroshenko.domain;

public class CommentPost {
    private int count; // количество комментариев
    private boolean canPost; // информация о том, может ли текущий пользователь комментировать запись
    private boolean canGroupsCommentPost;// информация о том, могут ли сообщества комментировать запись
    private boolean canCloseCommentPost;//может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpenCommentPost;//может ли текущий пользователь открыть комментарии к записи

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public boolean isCanGroupsCommentPost() {
        return canGroupsCommentPost;
    }

    public void setCanGroupsCommentPost(boolean canGroupsCommentPost) {
        this.canGroupsCommentPost = canGroupsCommentPost;
    }

    public boolean isCanCloseCommentPost() {
        return canCloseCommentPost;
    }

    public void setCanCloseCommentPost(boolean canCloseCommentPost) {
        this.canCloseCommentPost = canCloseCommentPost;
    }

    public boolean isCanOpenCommentPost() {
        return canOpenCommentPost;
    }

    public void setCanOpenCommentPost(boolean canOpenCommentPost) {
        this.canOpenCommentPost = canOpenCommentPost;
    }
}
