package ru.netology.domain;

public class Radio {
    String name;

    private int currentChannel;
    private int currentVolume;
    boolean on;
    int maxChannel = 9;
    int minChannel = 0;
    int maxVolume = 10;
    int minVolume = 0;

    public void nextChannel() {
        if (currentChannel < maxChannel)
            currentChannel++;
        if (currentChannel == maxChannel)
            currentChannel = minChannel;
    }

    public void prevChannel() {
        if(currentChannel > minChannel)
            currentChannel--;
        if(currentChannel == minChannel)
            currentChannel = maxChannel;
    }

    public void plusVolume() {
        if (currentVolume < maxVolume)
            currentVolume++;
    }
    public void minusVolume() {
        if (currentVolume > minVolume)
            currentVolume--;
    }
    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

}
