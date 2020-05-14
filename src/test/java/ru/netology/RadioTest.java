package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void CurrentStationMoreDefaultMax() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }
    @ Test
    void shouldSetNumberOfStation () {
        radio.setMaxStation(20);
        assertEquals(20, radio.getMaxStation());
    }
    @Test
    void CurrentStationMoreSetMax() {
        radio.setMaxStation(20);
        radio.setCurrentStation(21);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void CurrentStationLessMin() {
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldCurrentStationDefault() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void VolumeMoreMax() {
        radio.setVolume(110);
        assertEquals(0, radio.getVolume());
    }
    @Test
    void VolumeLessMin() {
        radio.setVolume(-5);
        assertEquals(0, radio.getVolume());
    }
    @Test
    void shouldVolume() {
        radio.setVolume(5);
        assertEquals(5, radio.getVolume());
    }

    @Test
    void shouldNotIncreaseStationDefault() {
        radio.setCurrentStation(10);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldNotIncreaseSetStation() {
        radio.setMaxStation(20);
        radio.setCurrentStation(20);
        radio.increaseStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldIncreaseStationDefault() {
        radio.setCurrentStation(7);
        radio.increaseStation();
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    void shouldIncreaseSetStation() {
        radio.setMaxStation(20);
        radio.setCurrentStation(11);
        radio.increaseStation();
        assertEquals(12, radio.getCurrentStation());
    }

    @Test
    void shouldNotDecreaseStationDefault() {
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(10, radio.getCurrentStation());
    }
    @Test
    void shouldNotDecreaseSetStation() {
        radio.setMaxStation(20);
        radio.setCurrentStation(0);
        radio.decreaseStation();
        assertEquals(20, radio.getCurrentStation());
    }
    @Test
    void shouldDecreaseStation() {
        radio.setCurrentStation(8);
        radio.decreaseStation();
        assertEquals(7, radio.getCurrentStation());
    }
    @Test
    void shouldNotIncreaseVolume() {
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getVolume());
    }
    @Test
    void shouldIncreaseVolume() {
        radio.setVolume(7);
        radio.increaseVolume();
        assertEquals(8, radio.getVolume());
    }
    @Test
    void shouldNotDecreaseVolume() {
        radio.setVolume(-1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }
    @Test
    void shouldDecreaseVolume() {
        radio.setVolume(5);
        radio.decreaseVolume();
        assertEquals(4, radio.getVolume());
    }
}