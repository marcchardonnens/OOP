package ch.hslu.oop.temperatur;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AElementTest {

    @Test
    void getTempBoilingPoint() {
        assertEquals(1749f, new Lead().getTempBoilingPoint().getTempCelsius());
    }

    @Test
    void getTempMeltingPoint() {
        assertEquals(327f, new Lead().getTempMeltingPoint().getTempCelsius());
    }

    @Test
    void getAggregatszustand() {
        assertEquals(Aggregatszustand.fest, new Lead().getAggregatszustand(new Temperatur(100)));
    }

    @Test
    void testToString() {

        assertEquals("ch.hslu.oop.temperatur.Nitrogen{" +
                "tempMeltingPoint=" + -210f +
                ", tempBoilingPoint=" + -195f +
                ", shortName='" + "N" + '\'' +
                '}', new Nitrogen().toString());
    }

    @Test
    void testToStringMercury() {

        assertEquals("ch.hslu.oop.temperatur.Mercury{" +
                "tempMeltingPoint=" + -38f +
                ", tempBoilingPoint=" + 356f +
                ", shortName='" + "Hg" + '\'' +
                '}'
                + "ACHTUNG: GIFTIG!!", new Mercury().toString());
    }
}