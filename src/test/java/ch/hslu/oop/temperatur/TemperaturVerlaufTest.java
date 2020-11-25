package ch.hslu.oop.temperatur;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {

    private  TemperaturVerlauf temperaturVerlauf;

    @BeforeEach
    void setUp() {
        temperaturVerlauf = new TemperaturVerlauf();
    }

    @Test
    void add() {
        assertTrue(temperaturVerlauf.add(Temperatur.createFromCelsius(100)));
        assertEquals(1, temperaturVerlauf.getCount());
    }

    @Test
    void clear() {
        temperaturVerlauf.add(Temperatur.createFromCelsius(100));
        temperaturVerlauf.add(Temperatur.createFromCelsius(100));
        temperaturVerlauf.add(Temperatur.createFromCelsius(100));
        temperaturVerlauf.add(Temperatur.createFromCelsius(100));
        temperaturVerlauf.add(Temperatur.createFromCelsius(100));
        temperaturVerlauf.clear();
        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    void getCount() {
        temperaturVerlauf.add(Temperatur.createFromCelsius(50));
        temperaturVerlauf.add(Temperatur.createFromCelsius(50));
        temperaturVerlauf.add(Temperatur.createFromCelsius(50));
        temperaturVerlauf.add(Temperatur.createFromCelsius(50));
        assertEquals(4, temperaturVerlauf.getCount());
    }

    @Test
    void getMax() {
        temperaturVerlauf.add(Temperatur.createFromCelsius(10));
        temperaturVerlauf.add(Temperatur.createFromCelsius(12));
        temperaturVerlauf.add(Temperatur.createFromCelsius(15));
        temperaturVerlauf.add(Temperatur.createFromCelsius(-2));
        temperaturVerlauf.add(Temperatur.createFromCelsius(12));
        temperaturVerlauf.add(Temperatur.createFromCelsius(42));

        assertEquals(Temperatur.createFromCelsius(42), temperaturVerlauf.getMax());
    }

    @Test
    void getMaxEmpty()
    {
        temperaturVerlauf.getMax();


    }

    @Test
    void getMin() {
        temperaturVerlauf.add(Temperatur.createFromCelsius(10));
        temperaturVerlauf.add(Temperatur.createFromCelsius(12));
        temperaturVerlauf.add(Temperatur.createFromCelsius(15));
        temperaturVerlauf.add(Temperatur.createFromCelsius(-2));
        temperaturVerlauf.add(Temperatur.createFromCelsius(12));
        temperaturVerlauf.add(Temperatur.createFromCelsius(42));

        assertEquals(Temperatur.createFromCelsius(-2), temperaturVerlauf.getMin());
    }

    @Test
    void getMinEmpty()
    {
        temperaturVerlauf.getMin();
    }

    @Test
    void getAverage() {

        temperaturVerlauf.add(Temperatur.createFromCelsius(15.5f));
        temperaturVerlauf.add(Temperatur.createFromCelsius(10.5f));
        temperaturVerlauf.add(Temperatur.createFromCelsius(5.5f));

        assertEquals(Temperatur.createFromCelsius(10.5f), temperaturVerlauf.getAverage());

    }
}