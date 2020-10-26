package ch.hslu.oop.datenkapselung;

import ch.hslu.oop.kontrollstrukturen.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinieTest {

    Linie linie;

    @BeforeEach
    public void SetUp()
    {
        linie = new Linie(new Point(0,0), new Point(1,1));
    }

    @Test
    void getStartPoint() {
        assertTrue(new Point(0,0).equals( linie.getStartPoint()));

    }

    @Test
    void getEndPoint() {
        assertTrue(new Point(1,1).equals( linie.getEndPoint()));
    }

    @Test
    void moveStartingPoint() {
        linie.moveStartingPoint(-1,-1);
        assertTrue(new Point(-1,-1).equals( linie.getStartPoint()));
    }

    @Test
    void moveEndingPoint() {
        linie.moveEndingPoint(2,2);
        assertTrue(new Point(2,2).equals( linie.getEndPoint()));
    }
}