package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void shouldChangeChannel () {
        Radio radio = new Radio();
        radio.setCurrentChannel();
        radio.getChannel();
        assertEquals(0,radio.);
    }



}