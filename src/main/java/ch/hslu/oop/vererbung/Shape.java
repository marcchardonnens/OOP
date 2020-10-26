package ch.hslu.oop.vererbung;

import ch.hslu.oop.kontrollstrukturen.Point;

public abstract class Shape {
    Point point;
    protected Shape(final int x, final int y) {
        point = new Point(x,y);
    }
    public final void move(final int newX, final int newY) {
        point.setX(newX);
        point.setY(newY);
    }

    public Point getPoint()
    {
        return new Point(point);
    }



}
