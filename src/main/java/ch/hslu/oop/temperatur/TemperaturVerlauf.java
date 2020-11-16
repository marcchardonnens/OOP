package ch.hslu.oop.temperatur;

import java.util.*;

public class TemperaturVerlauf {

    private ArrayList<Temperatur> temperaturen = new ArrayList<Temperatur>();

    public boolean add(Temperatur temperatur)
    {
        return temperaturen.add(temperatur);
    }

    public void clear()
    {
        temperaturen.clear();
    }

    public int getCount()
    {
        return temperaturen.size();
    }

    public Temperatur getMax()
    {
        try{

            return Collections.max(temperaturen);
        }
        catch (NoSuchElementException e)
        {
            return new Temperatur(0);
        }
    }

    public Temperatur getMin()
    {
        try{

            return Collections.min(temperaturen);
        }
        catch (NoSuchElementException e)
        {
            return new Temperatur(0);
        }
    }

    public Temperatur getAverage()
    {
        float f = 0;
        Iterator<Temperatur> iter = temperaturen.iterator();
        while (iter.hasNext())
        {
            f += iter.next().getTempCelsius();
        }

        return new Temperatur((f / temperaturen.size()));

    }



}
