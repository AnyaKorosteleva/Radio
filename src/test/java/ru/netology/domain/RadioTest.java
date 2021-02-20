package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldNextCurrentChannel () {
        radio.setCurrentChannel(2);
        radio.nextChannel();
        assertEquals(3,radio.getCurrentChannel());
    }
    @Test
    public void shouldNextMaxCurrentChannel () {
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }
    @Test
    public void shouldPrevCurrentChannel () {
        radio.setCurrentChannel(2);
        radio.prevChannel();
        assertEquals(1,radio.getCurrentChannel());
    }
    @Test
    public void shouldPrevMinCurrentChannel () {
        radio.setCurrentChannel(0);
        radio.prevChannel();
        assertEquals(9, radio.getCurrentChannel());
    }
    @Test
    public void shouldNextCurrentVolume () {
        radio.setCurrentVolume(5);
        radio.plusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    public void shouldNextMaxCurrentVolume () {
        radio.setCurrentVolume(10);
        radio.plusVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void shouldPrevCurrentVolume () {
        radio.setCurrentVolume(7);
        radio.minusVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    public void shouldPrevMinCurrentVolume () {
        radio.setCurrentVolume(0);
        radio.minusVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}
