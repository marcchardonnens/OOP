package ch.hslu.oop.temperatur;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {

    private Temperatur temperatur;

    @BeforeEach
    public void SetUp()
    {
        temperatur = new Temperatur(100);
    }

    @Test
    void getTempCelsius() {
        assertEquals(100, temperatur.getTempCelsius());
    }

    @Test
    void setTempCelsius() {
        temperatur.setTempCelsius(200);
        assertEquals(200,temperatur.getTempCelsius());
    }

    @Test
    void getTempKelvin() {
        assertEquals(373.15, temperatur.getTempKelvin(), 0.0001f);
    }

    @Test
    void getTempFarhenheit() {
        assertEquals(212, temperatur.getTempFarhenheit());
    }

    @Test
    void addTemp() {
        temperatur.addTemp(50);
        assertEquals(150, temperatur.getTempCelsius());
        temperatur.addTemp(-25);
        assertEquals(125, temperatur.getTempCelsius());
    }

    @Test
    void subtractTemp() {
        temperatur.subtractTemp(50);
        assertEquals(50, temperatur.getTempCelsius());
        temperatur.subtractTemp(-40);
        assertEquals(90, temperatur.getTempCelsius());
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
        assertTrue(temperatur.isHigherThan(new Temperatur(99)));
    }

    @Test
    void isLowerThan() {
        assertTrue(temperatur.isLowerThan(new Temperatur(101)));
    }

    @Test
    void testEquals() {
        assertTrue(temperatur.equals(new Temperatur(100)));
        assertFalse(temperatur.equals(new Temperatur(99)));
    }

    @Test
    void testHashCode() {
        assertEquals(new Temperatur(100).hashCode(),temperatur.hashCode());
        assertNotEquals(new Temperatur(101).hashCode(),temperatur.hashCode());
    }

    @Test
    void compareTo() {
        assertEquals(0, temperatur.compareTo(new Temperatur(100)));
        assertTrue(0 > temperatur.compareTo(new Temperatur(150)));
        assertTrue(0 < temperatur.compareTo(new Temperatur(40)));
    }

    @Test
    void celsiusToKelvin() {
        assertEquals(-173.15f, Temperatur.CelsiusToKelvin(100));
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(273.15f,Temperatur.KelvinToCelsius(0));
    }
}