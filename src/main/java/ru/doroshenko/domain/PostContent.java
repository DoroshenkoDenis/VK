package ru.doroshenko.domain;

import javax.sound.sampled.AudioFormat;
import java.awt.*;

public class PostContent {
    private String postText;
    private Image image;
    private AudioFormat audioFormat;
    private LikeWrap likeWrap;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public AudioFormat getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormat audioFormat) {
        this.audioFormat = audioFormat;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public LikeWrap getLikeWrap() {
        return likeWrap;
    }

    public void setLikeWrap(LikeWrap likeWrap) {
        this.likeWrap = likeWrap;
    }
}
