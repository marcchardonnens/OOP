package ch.hslu.oop.vererbung;

import ch.hslu.oop.kontrollstrukturen.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private Circle circle;

    @BeforeEach
    public void SetUp()
    {
        circle = new Circle(3,3, 2);
    }

    @Test
    void move() {
        circle.move(0,0);
        assertTrue(new Point(0,0).equals( circle.getPoint()));
    }

    @Test
    void getDiameter() {
        assertEquals(2, circle.getDiameter());
    }

    @Test
    void setDiameter() {
        circle.setDiameter(3);
        assertEquals(3, circle.getDiameter());
    }

    @Test
    void getArea() {
        assertEquals(Math.PI, circle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(Math.PI * 2, circle.getPerimeter());
    }

    @Test
    void getPoint() {
        assertNotNull(circle.getPoint());
    }
}