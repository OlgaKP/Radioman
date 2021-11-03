package ru.netology.manager;
import ru.netology.domain.Radio;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ServiceTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetCurrentAvgVolume() {
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentLessVolume() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMoreVolume() {
        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAvgVolume() {
        radio.setCurrentVolume(6);
        radio.increaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseMaxVolume() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseAvgVolume() {
        radio.setCurrentVolume(4);
        radio.decreaseVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseMinVolume() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentAvgStation() {
        radio.setCurrentStation(7);

        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentLessStation() {
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMoreStation() {
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextAvgStation() {
        radio.setCurrentStation(3);
        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMoreStation() {
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevAvgStation() {
        radio.setCurrentStation(7);
        radio.prevStation ();

        int expected = 6;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevLessStation() {
        radio.setCurrentStation(0);
        radio.prevStation ();

        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }
}
