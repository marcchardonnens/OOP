package ch.hslu.oop.Kontrollstrukturen;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }


    public Point(final Point p)
    {
        this.x = p.getX();
        this.y = p.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getQuadrant(){
        if(x == 0 || y == 0)
        {
            return 0;
        }

        if(x < 0)
        {
            if(y < 0)
            {
                return 3;
            }
            else
            {
                return 2;
            }
        }
        else
        {
            if (y < 0)
            {
                return 4;
            }
            else{
                return 1;
            }
        }
    }

    public void moveRelative(final int x, final int y)
    {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    public  void moveRelative(final Point p)
    {
        this.x = this.x + p.getX();
        this.y = this.y + p.getY();
    }

    public void moveRelative(final double grad, final int betrag)
    {
        //x und y sind ints, Kommastellen werden abgezwackt
        this.x = this.x + (int) (Math.cos(Math.toRadians(grad)) * betrag);
        this.y = this.y + (int) (Math.sin(Math.toRadians(grad)) * betrag);
    }

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        final Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
