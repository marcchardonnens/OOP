package ch.hslu.oop.kontrollstrukturen;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    /**
     * @param x X Koordinate
     * @param y Y Koordinate
     */
    public Point(final int x, final int y){
        this.x = x;
        this.y = y;
    }


    /**
     * Copykontruktor
     * @param p Punkt Objekt das kopiert wird.
     */
    public Point(final Point p)
    {
        this.x = p.getX();
        this.y = p.getY();
    }

    /**
     * @return Gibt X Koordinate zurück.
     */
    public int getX() {
        return x;
    }

    /**
     * @return Gibt Y Koordinate zurück.
     */
    public int getY() {
        return y;
    }

    /**
     * @param x neue X Koordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param y neue Y Koordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Quadrant   I = 1
     * Quadrant  II = 2
     * Quadrant III = 3
     * Quadrant  IV = 4
     * Achse        = 0
     *
     * @return Gibt die Nummer vom Quadrant zurück
     */
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

    /**
     * @param x Verschiebung in X Richtung
     * @param y Verschiebung in Y Richtung
     */
    public void moveRelative(final int x, final int y)
    {
        this.x = this.x + x;
        this.y = this.y + y;
    }

    /**
     * @param p Verschiebung durch Koordinaten von Punkt p
     */
    public  void moveRelative(final Point p)
    {
        this.x = this.x + p.getX();
        this.y = this.y + p.getY();
    }

    /**
     * Verschiebung auf die nächste ganze Koordinate mit Winkel und Betrag
     * Es kann nur auf ganze Koordinaten verschoben wird. Dadurch kann der Winkel abgefälscht werden.
     * x 3.2343 -> 3
     * y 2.4644 -> 2
     *
     * @param grad Winkel in Grad
     * @param betrag Länge der Verschiebung
     */
    public void moveRelative(final double grad, final int betrag)
    {
        //x und y sind ints, Kommastellen werden abgezwackt
        this.x = this.x + (int) (Math.cos(Math.toRadians(grad)) * betrag);
        this.y = this.y + (int) (Math.sin(Math.toRadians(grad)) * betrag);
    }

    /**
     * @return Gibt den Punkt und dessen Koordinaten als String zurück
     */
    @Override
    public String toString() {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }

    /**
     * @param obj Objekt das verglichen wird.
     * @return Gibt true zurück wenn die Koordinaten beider Objekte übereinstimmen
     */
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

    /**
     * @return Gibt den Hashwert zurück
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
