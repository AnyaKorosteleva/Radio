package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(29);

    @Test
    public void shouldNextCurrentChannel() {
        radio.setCurrentChannel(15);
        radio.nextChannel();
        assertEquals(16, radio.getCurrentChannel());
    }

    @Test
    public void shouldNextMaxCurrentChannel() {
        radio.setCurrentChannel(29);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevCurrentChannel() {
        radio.setCurrentChannel(2);
        radio.prevChannel();
        assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    public void shouldPrevMinCurrentChannel() {
        radio.setCurrentChannel(0);
        radio.prevChannel();
        assertEquals(29, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetCurrentChannel() {
        radio.setCurrentChannel(3);
        assertEquals(3, radio.getCurrentChannel());
    }

    @Test
    public void shouldNextCurrentVolume() {
        radio.setCurrentVolume(27);
        radio.plusVolume();
        assertEquals(28, radio.getCurrentVolume());
    }

    @Test
    public void shouldNextMaxCurrentVolume() {
        radio.setCurrentVolume(100);
        radio.plusVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevCurrentVolume() {
        radio.setCurrentVolume(7);
        radio.minusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    public void shouldPrevMinCurrentVolume() {
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetChannelUnderMin () {
        radio.setCurrentChannel(5);
        radio.setCurrentChannel(-1);
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetChannelUpperMax () {
        radio.setCurrentChannel(5);
        radio.setCurrentChannel(110);
        assertEquals(5, radio.getCurrentChannel());
    }

    @Test
    public void shouldSetVolumeUnderMin () {
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(-1);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolumeUpperMax () {
        radio.setCurrentVolume(5);
        radio.setCurrentVolume(110);
        assertEquals(5, radio.getCurrentVolume());
    }
}
