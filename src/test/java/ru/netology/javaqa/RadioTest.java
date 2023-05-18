package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetStationAfterLastZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotSetStationLowFirstNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        radio.nextStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetNextStationZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevStationIfMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevStationIfMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(20);

        int expected = 20;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeIfLowZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetCurrentVolumeIfAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotIncreaseVolumeIfMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldNotTurnDownVolumeIfZero() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldTurnDownVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(5);

        radio.turnDownVolume();

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldTurnDownVolumeIfMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        radio.turnDownVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}