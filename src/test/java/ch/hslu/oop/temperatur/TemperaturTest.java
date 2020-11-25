package ch.hslu.oop.temperatur;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    private Temperatur temperatur;

    @BeforeEach
    public void SetUp()
    {
        temperatur = Temperatur.createFromCelsius(100);
    }

    @Test
    void getTempCelsius() {
        assertEquals(100, temperatur.getTempCelsius());
    }

    @Test
    void getTempKelvin() {
        assertEquals(373.15f, temperatur.getTempKelvin(), 0.001f);
    }

    @Test
    void getTempFarhenheit() {
        assertEquals(212, temperatur.getTempFarhenheit());
    }

    @Test
    void testToString() {
        assertEquals("Temperatur{tempCelsius=" + 100.0 +"}", temperatur.toString());
    }

    @Test
    void getAggregatszustand() {
        assertEquals(Aggregatszustand.fest, temperatur.getAggregatszustand(new Lead()));
    }

    @Test
    void isHigherThan() {
        assertTrue(temperatur.isHigherThan(Temperatur.createFromCelsius(99)));
    }

    @Test
    void isLowerThan() {
        assertTrue(temperatur.isLowerThan(Temperatur.createFromCelsius(101)));
    }

    @Test
    void testEquals() {
        assertTrue(temperatur.equals(Temperatur.createFromCelsius(100)));
        assertFalse(temperatur.equals(Temperatur.createFromCelsius(99)));
    }

    @Test
    void testHashCode() {
        assertEquals(Temperatur.createFromCelsius(100).hashCode(),temperatur.hashCode());
        assertNotEquals(Temperatur.createFromCelsius(101).hashCode(),temperatur.hashCode());
    }

    @Test
    void compareTo() {
        assertEquals(0, temperatur.compareTo(Temperatur.createFromCelsius(100)));
        assertTrue(0 > temperatur.compareTo(Temperatur.createFromCelsius(150)));
        assertTrue(0 < temperatur.compareTo(Temperatur.createFromCelsius(40)));
    }

    @Test
    void celsiusToKelvin() {
        assertEquals(373.15f, Temperatur.CelsiusToKelvin(100));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(-273.15f,Temperatur.KelvinToCelsius(0));
    }

    @Test
    void createFromCelsius() {
        assertThrows(IllegalArgumentException.class, () -> Temperatur.createFromCelsius(-300),"Mindest Temparatur ist -273.15");
    }

    @Test
    void createFromKelvin() {
        assertEquals(-273.15f, Temperatur.createFromKelvin(0f).getTempCelsius() ,0.0001f);
    }
}