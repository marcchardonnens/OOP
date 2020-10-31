package ch.hslu.oop.temperatur;

import java.util.Objects;

/**
 * Beispiel einer einfachen Klasse Temperatur
 */
public class Temperatur {

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
        this.tempCelsius = Math.max(tempCelsius, -273.15f);;
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
        this.tempCelsius = Math.max(tempCelsius, -273.15f);
    }

    /**
     * Exercise 1.3 e)
     * @return float: Returns current Temperatur in Kelvin
     */
    public float getTempKelvin() {
        return this.tempCelsius + 273.15f;
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
        this.tempCelsius = Math.max(newTemp, -273.15f);
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
}
