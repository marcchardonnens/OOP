package ch.hslu.oop.temperatur;

public abstract class AElement {

    protected float meltingPoint;
    protected float boilingPoint;
    protected String shortName;

    public float getBoilingPoint() {
        return boilingPoint;
    }

    public float getMeltingPoint() {
        return meltingPoint;
    }

    public Aggregatszustand GetAggregatszustand(final float temperatur)
    {
        if(meltingPoint > temperatur)
        {
            return Aggregatszustand.fest;
        }
        else if(boilingPoint < temperatur)
        {
            return Aggregatszustand.gasfoermig;
        }
        return Aggregatszustand.fluessig;
    }


}
