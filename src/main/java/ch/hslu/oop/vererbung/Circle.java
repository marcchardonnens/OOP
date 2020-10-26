package ch.hslu.oop.vererbung;

public class Circle extends Shape {

    private int diameter;


    public Circle(final int x, final int y, final int diameter)
    {
        super(x,y);
        this.diameter = diameter;

    }

    public int getDiameter()
    {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public double getArea()
    {
        return Math.pow(diameter/2, 2) * Math.PI;
    }

    public double getPerimeter() {
        return diameter * Math.PI;
    }
}
