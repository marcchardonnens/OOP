package ch.hslu.oop.vererbung;

public class Rectangle extends Shape {
    protected int width;
    protected int height;
    public Rectangle(final int x, final int y,
                     final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void changeDimension(final int newWidth, final int newHeight)
    {
        width = newWidth;
        height = newHeight;
    }

    public int getArea()
    {
        return width * height;
    }

    @Override
    public int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }

}
