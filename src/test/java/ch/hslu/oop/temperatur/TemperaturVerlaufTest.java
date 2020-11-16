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
        assertTrue(temperaturVerlauf.add(new Temperatur(100)));
        assertEquals(1, temperaturVerlauf.getCount());
    }

    @Test
    void clear() {
        temperaturVerlauf.add(new Temperatur(100));
        temperaturVerlauf.add(new Temperatur(100));
        temperaturVerlauf.add(new Temperatur(100));
        temperaturVerlauf.add(new Temperatur(100));
        temperaturVerlauf.add(new Temperatur(100));
        temperaturVerlauf.clear();
        assertEquals(0, temperaturVerlauf.getCount());
    }

    @Test
    void getCount() {
        temperaturVerlauf.add(new Temperatur(50));
        temperaturVerlauf.add(new Temperatur(50));
        temperaturVerlauf.add(new Temperatur(50));
        temperaturVerlauf.add(new Temperatur(50));
        assertEquals(4, temperaturVerlauf.getCount());
    }

    @Test
    void getMax() {
        temperaturVerlauf.add(new Temperatur(10));
        temperaturVerlauf.add(new Temperatur(12));
        temperaturVerlauf.add(new Temperatur(15));
        temperaturVerlauf.add(new Temperatur(-2));
        temperaturVerlauf.add(new Temperatur(12));
        temperaturVerlauf.add(new Temperatur(42));

        assertEquals(new Temperatur(42), temperaturVerlauf.getMax());
    }

    @Test
    void getMaxEmpty()
    {
        temperaturVerlauf.getMax();


    }

    @Test
    void getMin() {
        temperaturVerlauf.add(new Temperatur(10));
        temperaturVerlauf.add(new Temperatur(12));
        temperaturVerlauf.add(new Temperatur(15));
        temperaturVerlauf.add(new Temperatur(-2));
        temperaturVerlauf.add(new Temperatur(12));
        temperaturVerlauf.add(new Temperatur(42));

        assertEquals(new Temperatur(-2), temperaturVerlauf.getMin());
    }

    @Test
    void getMinEmpty()
    {
        temperaturVerlauf.getMin();
    }

    @Test
    void getAverage() {

        temperaturVerlauf.add(new Temperatur(15.5f));
        temperaturVerlauf.add(new Temperatur(10.5f));
        temperaturVerlauf.add(new Temperatur(5.5f));

        assertEquals(new Temperatur(10.5f), temperaturVerlauf.getAverage());

    }
}