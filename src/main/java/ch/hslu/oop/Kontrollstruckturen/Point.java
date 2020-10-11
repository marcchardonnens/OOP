package ch.hslu.oop.Kontrollstruckturen;

public class Point {
    private int x;
    private int y;

    Public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }

    public int getQuadrant(){
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


}
