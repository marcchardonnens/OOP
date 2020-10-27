package ch.hslu.oop.vererbung;

import ch.hslu.oop.kontrollstrukturen.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private Rectangle rectangle;

    @BeforeEach
    public void SetUp()
    {
        rectangle = new Rectangle(0,0,4,4);
    }

    @Test
    void move() {
        rectangle.move(2,2);
        assertEquals(new Point(2,2),rectangle.getPoint());
    }

    @Test
    void getPoint() {
        assertNotNull(rectangle.getPoint());
    }

    @Test
    void getHeight() {
        assertEquals(4,rectangle.getHeight());
    }

    @Test
    void getWidth() {
        assertEquals(4,rectangle.getWidth());
    }

    @Test
    void changeDimension() {
        rectangle.changeDimension(3,5);
        assertEquals(5, rectangle.getHeight());
        assertEquals(3, rectangle.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(16, rectangle.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(16, rectangle.getPerimeter());
    }
}