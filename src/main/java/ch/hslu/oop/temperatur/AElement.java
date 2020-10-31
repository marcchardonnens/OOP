package ch.hslu.oop.temperatur;

import java.util.Objects;

public abstract class AElement {

    protected final Temperatur tempMeltingPoint;
    protected final Temperatur tempBoilingPoint;
    protected final String shortName;

    protected AElement(Temperatur tempMeltingPoint, Temperatur tempBoilingPoint, String shortName) {
        this.tempMeltingPoint = tempMeltingPoint;
        this.tempBoilingPoint = tempBoilingPoint;
        this.shortName = shortName;
    }

    public Temperatur getTempBoilingPoint() {
        return tempBoilingPoint;
    }

    public Temperatur getTempMeltingPoint() {
        return tempMeltingPoint;
    }

    public Aggregatszustand getAggregatszustand(final Temperatur temperatur)
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

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AElement)) return false;
        AElement aElement = (AElement) o;
        return Objects.equals(getTempMeltingPoint(), aElement.getTempMeltingPoint()) &&
                Objects.equals(getTempBoilingPoint(), aElement.getTempBoilingPoint()) &&
                Objects.equals(shortName, aElement.shortName);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(getTempMeltingPoint(), getTempBoilingPoint(), shortName);
    }

}
