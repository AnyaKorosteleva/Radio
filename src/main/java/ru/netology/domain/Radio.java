package ru.netology.domain;

public class Radio {
    String name;
    private int channel;
    private int currentChannel;
    private int volume;
    private int сurrentVolume;
    int next = 1;
    int prev = -1;
    int plus = 1;
    int minus = -1;
    boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > 9) {
            this.currentChannel = 0;
        }
        if (currentChannel < 0) {
            this.currentChannel = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCurrentVolume() {
        return сurrentVolume;
    }

    public void setCurrentVolume(int getCurrentVolume) {
        if (getCurrentVolume > 10) {
        this.сurrentVolume = 10;
        }
        if (currentChannel < 0) {
            this.currentChannel = 0;
        }
        this.currentChannel = getCurrentVolume;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    public int getMinus() {
        return minus;
    }

    public void setMinus(int minus) {
        this.minus = minus;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setCurrentChannel() {
    }
}