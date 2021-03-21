package ru.netology.domain;

public class Radio {
    String name;
    private int currentChannel;
    private int currentVolume;
    private boolean on;
    private int maxChannel = 10;
    private int minChannel = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    public void nextChannel() {
        this.currentChannel++;
        if (this.currentChannel > maxChannel) {
            this.currentChannel = minChannel;
        }
    }

    public void prevChannel() {
        this.currentChannel--;
        if (this.currentChannel < minChannel)
            this.currentChannel = maxChannel;
    }

    public void plusVolume() {
        this.currentVolume++;
        if (this.currentVolume > maxVolume)
            this.currentVolume = maxVolume;
    }

    public void minusVolume() {
        this.currentVolume--;
        if (this.currentVolume < minVolume) {
            this.currentVolume = minVolume;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < minChannel) {
            return;
        }
        if (currentChannel > maxChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}