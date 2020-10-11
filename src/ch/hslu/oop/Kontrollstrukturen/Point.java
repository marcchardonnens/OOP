package ch.hslu.oop.Kontrollstrukturen;

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
}
