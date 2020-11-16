package ch.hslu.oop.vererbung;

public final class Square extends Shape {
    private int side;

    public Square(final int x,final int y, final int sideLength) {
        super(x,y);
        side = sideLength;
    }


    public int getHeight() {
        return side;
    }

    public int getWidth() {
        return side;
    }



    public int getArea()
    {
        return side * side;
    }


    public void changeDimension(final int newLength)
    {
        side = newLength;
    }

    public int getPerimeter()
    {
        return 4 * side;
    }
}
