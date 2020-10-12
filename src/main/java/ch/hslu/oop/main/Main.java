package ch.hslu.oop.main;

import ch.hslu.oop.Kontrollstrukturen.Point;
import ch.hslu.oop.datenkapselung.Linie;

public class Main {

    public static void main(String[] args)
    {
        Linie l = new Linie(new Point(0,0), new Point(5, 5));

        l.getStartPoint().setX(2);

        System.out.println(l.getStartPoint().getX());
    }
}
