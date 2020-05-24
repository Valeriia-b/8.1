package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @ Test
    void shouldSetNumberOfStation () {
        Radio radio = new Radio(20);
        assertEquals(20, radio.getMaxStation());
    }

    @Test
    void currentStationMoreDefaultMax() {
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void currentStationMoreSetMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(21);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void currentStationLessMin() {
        radio.setCurrentStation(-5);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldCurrentStationDefault() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void volumeMoreMax() {
        radio.setVolume(110);
        assertEquals(0, radio.getVolume());
    }
    @Test
    void volumeLessMin() {
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
        Radio radio = new Radio(20);
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
        Radio radio = new Radio(20);
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
        Radio radio = new Radio(20);
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