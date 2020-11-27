package ch.hslu.oop.temperatur;

import java.util.*;

public class TemperaturVerlauf {

    private ArrayList<Temperatur> temperaturen = new ArrayList<Temperatur>();
    private ArrayList<ITemperaturEventListener> eventListeners = new ArrayList<>();

    public boolean add(Temperatur temperatur)
    {
        if(getCount() > 0)
        {
            if(temperatur.getTempCelsius() > getMax().getTempCelsius())
            {
                fireTemperaturEvent(new TemperaturEvent(this, TemperaturEventType.NEWMAXTEMP));
            }
            if(temperatur.getTempCelsius() < getMin().getTempCelsius())
            {
                fireTemperaturEvent(new TemperaturEvent(this, TemperaturEventType.NEWMINTEMP));
            }
        }


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
            return Temperatur.createFromCelsius(0);
        }
    }

    public Temperatur getMin()
    {
        try{

            return Collections.min(temperaturen);
        }
        catch (NoSuchElementException e)
        {
            return Temperatur.createFromCelsius(0);
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

        return Temperatur.createFromCelsius((f / temperaturen.size()));

    }

    public boolean addTemperaturListener(ITemperaturEventListener listener)
    {
        return eventListeners.add(listener);
    }

    public boolean removeTemperaturListener(ITemperaturEventListener listener)
    {
        return eventListeners.remove(listener);
    }

    private  void fireTemperaturEvent(final TemperaturEvent evt)
    {
        for(final ITemperaturEventListener listener : eventListeners)
        {
            listener.temperaturEvent(evt);
        }

    }

}
