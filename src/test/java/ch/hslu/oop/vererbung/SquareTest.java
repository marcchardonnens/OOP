package ch.hslu.oop.vererbung;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square s;
    @BeforeEach
    void setUp() {
        s = new Square(0,0,10);
    }

    @Test
    void getHeight() {
        assert(10 == s.getHeight());
    }

    @Test
    void getWidth() {
        assert(10 == s.getWidth());
    }

    @Test
    void changeDimension() {

    }

    @Test
    void getArea() {
    }

    @Test
    void testGetPerimeter() {
    }

    @Test
    void testMove() {
    }
}