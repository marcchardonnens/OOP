package ch.hslu.oop.Kontrollstrukturen;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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

    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
