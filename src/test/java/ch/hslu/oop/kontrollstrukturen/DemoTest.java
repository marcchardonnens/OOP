package ch.hslu.oop.kontrollstrukturen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    private Demo demo = new Demo();

    @Test
    void max() {
        assertEquals(5, demo.max(2,5));
        assertEquals(96, demo.max(96,34));
        assertEquals(22, demo.max(22,22));

    }

    @Test
    void min() {
        assertEquals(3, demo.min(3, 74));
        assertEquals(58, demo.min(98, 58));
        assertEquals(8, demo.min(8, 8));
    }

    @Test
    void testMax() {
        assertEquals( 9, demo.max(2,3,9));
        assertEquals( 33, demo.max(22,33,2));
        assertEquals( 21, demo.max(21,13,9));
        assertEquals( 9, demo.max(3,3,9));
        assertEquals( 9, demo.max(2,9,9));
        assertEquals( 10, demo.max(10,10,10));
    }
}