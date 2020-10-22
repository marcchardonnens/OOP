package ch.hslu.oop.temperatur;

public abstract class AElement {

    protected Temperatur tempMeltingPoint;
    protected Temperatur tempBoilingPoint;
    protected String shortName;

    public Temperatur getTempBoilingPoint() {
        return tempBoilingPoint;
    }

    public Temperatur getTempMeltingPoint() {
        return tempMeltingPoint;
    }

    public Aggregatszustand GetAggregatszustand(final Temperatur temperatur)
    {
        if(tempMeltingPoint.isHigherThan(temperatur))
        {
            return Aggregatszustand.fest;
        }
        else if(tempBoilingPoint.isLowerThan(temperatur))
        {
            return Aggregatszustand.gasfoermig;
        }
        return Aggregatszustand.fluessig;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "tempMeltingPoint=" + tempMeltingPoint.getTempCelsius() +
                ", tempBoilingPoint=" + tempBoilingPoint.getTempCelsius() +
                ", shortName='" + shortName + '\'' +
                '}';
    }
}
