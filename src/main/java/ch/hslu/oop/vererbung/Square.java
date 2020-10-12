package ch.hslu.oop.vererbung;

public class Square extends Rectangle {

    public Square(final int x,final int y, final int sideLength) {
        super(x, y, sideLength, sideLength);
    }

    public void changeDimension(final int newLength)
    {
        width = newLength;
        height = newLength;
    }

}
