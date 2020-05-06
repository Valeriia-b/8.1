package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldCurrentTemperature (){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(10);
        assertEquals(10, conditioner.getCurrentTemperature());
    }
    @Test
    public void CurrentTemperatureMoreMax (){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(35);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void CurrentTemperatureLessMin (){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(4);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(10);
        conditioner.increaseCurrentTemperature();
        assertEquals(11, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotIncreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        conditioner.setMinTemperature(5);
        conditioner.setCurrentTemperature(30);
        conditioner.increaseCurrentTemperature();
        assertEquals(30, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(8);
        conditioner.decreaseCurrentTemperature();
        assertEquals(7, conditioner.getCurrentTemperature());
    }
    @Test
    public void shouldNotDecreaseTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(5);
        conditioner.setMaxTemperature(30);
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();
        assertEquals(5, conditioner.getCurrentTemperature());
    }


}