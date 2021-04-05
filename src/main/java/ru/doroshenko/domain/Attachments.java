package ru.doroshenko.domain;

import javax.sound.sampled.AudioFormat;
import java.awt.*;

public class Attachments {
    private Image image;
    private AudioFormat audioFormat;

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
}
