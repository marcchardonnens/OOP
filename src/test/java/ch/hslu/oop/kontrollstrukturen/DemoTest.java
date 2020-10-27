package ch.hslu.oop.kontrollstrukturen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    private Demo demo = new Demo();

    @Test
    void max() {
        assertEquals(5, demo.max(2,5));
    }

    @Test
    void min() {
        assertEquals(3, demo.min(3, 74));
    }

    @Test
    void testMax() {
        assertEquals( 9, demo.max(2,3,9));
    }
}