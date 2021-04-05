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
}
