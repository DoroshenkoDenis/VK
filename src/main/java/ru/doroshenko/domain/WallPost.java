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
}
