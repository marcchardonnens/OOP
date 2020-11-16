package ch.hslu.oop.temperatur;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Beispiel einer einfachen Klasse Temperatur
 */
public final class Temperatur implements Comparable<Temperatur> {

    public static final float KELVINOFFSET = 273.15f;
    /**
     * Exercise 1.3 a)
     * Stores current Temperatur Value in Celsius
     */
    private float tempCelsius;

    /**
     * Exercise 1.3 h)
     * Sets default value of 20.0 degrees in Celsius
     */
    Temperatur() {
        this.tempCelsius = 20.0f;
    }

    /**
     * Exercise 1.3 i)
     * @param tempCelsius: Sets default value in Celsius
     *                     If the Value is lower than -273.15 than the temperatur is automatically set to that number.
     */
    Temperatur(float tempCelsius) {
        this.tempCelsius = Math.max(tempCelsius, -KELVINOFFSET);;
    }

    /**
     * Exercise 1.3 c)
     * @return float: Returns current Temperatur in Celsius
     */
    public float getTempCelsius() {
        return this.tempCelsius;
    }

    /**
     * Exercise 1.3 d)
     * @param tempCelsius: Sets current Temperatur to the new Temperatur in Celsius.
     *                     If the Value is lower than -273.15 than the temperatur is automatically set to that number.
     */
    public void setTempCelsius(float tempCelsius) {
        this.tempCelsius = Math.max(tempCelsius, -KELVINOFFSET);
    }

    /**
     * Exercise 1.3 e)
     * @return float: Returns current Temperatur in Kelvin
     */
    public float getTempKelvin() {
        return CelsiusToKelvin(tempCelsius);
    }

    /**
     * Exercise 1.3 f)
     * @return float: Returns current Temperatur in Fahrenheit
     */
    public float getTempFarhenheit() {
        return this.tempCelsius * 1.8f + 32.0f;
    }

    /**
     * Exercise 1.3 g)
     * @param temp: Adds a value to the current temperatur in Celsius or Kelvin.
     *              If value the result is lower than -273.15 then the value will be set to that number.
     */
    public void addTemp(float temp) {
        float newTemp = this.tempCelsius + temp;
        this.tempCelsius = Math.max(newTemp, -KELVINOFFSET);
    }


    /**
     * Exercise 1.3 g)
     * @param temp: Subtracts a value to the current temperatur in Celsius or Kelvin.
     *              If value the result is lower than -273.15 then the value will be set to that number.
     */
    public void subtractTemp(float temp)
    {
        addTemp(temp * -1);
    }

    @Override
    public String toString() {
        return "Temperatur{" +
                "tempCelsius=" + tempCelsius +
                '}';
    }

    public Aggregatszustand getAggregatszustand(AElement element){

        return element.getAggregatszustand(this);

    }

    public boolean isHigherThan(Temperatur temp)
    {
        return this.tempCelsius > temp.tempCelsius;
    }

    public boolean isLowerThan(Temperatur temp)
    {
        return this.tempCelsius < temp.tempCelsius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperatur that = (Temperatur) o;
        return Float.compare(that.tempCelsius, tempCelsius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tempCelsius);
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * <p>The implementor must ensure
     * {@code sgn(x.compareTo(y)) == -sgn(y.compareTo(x))}
     * for all {@code x} and {@code y}.  (This
     * implies that {@code x.compareTo(y)} must throw an exception iff
     * {@code y.compareTo(x)} throws an exception.)
     *
     * <p>The implementor must also ensure that the relation is transitive:
     * {@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
     * {@code x.compareTo(z) > 0}.
     *
     * <p>Finally, the implementor must ensure that {@code x.compareTo(y)==0}
     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}, for
     * all {@code z}.
     *
     * <p>It is strongly recommended, but <i>not</i> strictly required that
     * {@code (x.compareTo(y)==0) == (x.equals(y))}.  Generally speaking, any
     * class that implements the {@code Comparable} interface and violates
     * this condition should clearly indicate this fact.  The recommended
     * language is "Note: this class has a natural ordering that is
     * inconsistent with equals."
     *
     * <p>In the foregoing description, the notation
     * {@code sgn(}<i>expression</i>{@code )} designates the mathematical
     * <i>signum</i> function, which is defined to return one of {@code -1},
     * {@code 0}, or {@code 1} according to whether the value of
     * <i>expression</i> is negative, zero, or positive, respectively.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    @Override
    public int compareTo(@NotNull Temperatur o) {
        return Float.compare(tempCelsius, o.tempCelsius);
    }

    public static float CelsiusToKelvin(float tempCelsius)
    {
        return tempCelsius - KELVINOFFSET;
    }

    public static float KelvinToCelsius(float tempKelvin)
    {
        return tempKelvin + KELVINOFFSET;
    }
}
