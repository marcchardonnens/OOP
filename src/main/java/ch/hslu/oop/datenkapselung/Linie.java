package ch.hslu.oop.datenkapselung;

import ch.hslu.oop.Kontrollstrukturen.Point;

public class Linie {

    private Point p1,p2;


    public Linie(final Point p1,final Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Linie(final int x1,final int y1,final int x2,final int y2)
    {
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }

    public final Point getStartPoint()
    {
        return new Point(p1);
    }

    public final Point getEndPoint()
    {
        return new Point(p2);
    }

    //alternative way
//    public int[] getStartPoint()
//    {
//        return new int[]{p1.getX(), p1.getY()};
//    }

    public void moveStartingPoint(final int x,final int y)
    {
        p1.setX(x);
        p1.setY(y);
    }

    public void moveEndingPoint(final int x,final int y)
    {
        p2.setX(x);
        p2.setY(y);
    }





}
