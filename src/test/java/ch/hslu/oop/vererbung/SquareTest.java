package ch.hslu.oop.vererbung;

import ch.hslu.oop.kontrollstrukturen.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square;

    @BeforeEach
    public void SetUp()
    {
        square = new Square(0,0,5);
    }

    @Test
    void move() {
        square.move(2,2);
        assertEquals(new Point(2,2), square.getPoint());
    }

    @Test
    void getPoint() {
        assertNotNull(square.getPoint());
    }

    @Test
    void getHeight() {
        assertEquals(5,square.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(5, square.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(25, square.getArea());
    }

    @Test
    void changeDimension() {
        square.changeDimension(3);
        assertEquals(3, square.getWidth());
        assertEquals(3, square.getHeight());
    }

    @Test
    void getPerimeter() {
        assertEquals(20, square.getPerimeter());
    }
}