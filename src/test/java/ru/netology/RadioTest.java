package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void CurrentStationMoreMax() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void CurrentStationLessMin() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldCurrentStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void VolumeMoreMax() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(11);
        assertEquals(0, radio.getVolume());
    }
    @Test
    void VolumeLessMin() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(-5);
        assertEquals(0, radio.getVolume());
    }
    @Test
    void shouldVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(5);
        assertEquals(5, radio.getVolume());
    }


    @Test
    void shouldNotIncreaseStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        radio.increaseStation();
        assertEquals(8, radio.getCurrentStation());
    }


    @Test
    void shouldNotDecreaseStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(8);
        radio.decreaseStation();
        assertEquals(7, radio.getCurrentStation());
    }
    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getVolume());
    }
    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getVolume());
    }
    @Test
    void shouldNotDecreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
    }

}