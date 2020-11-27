package ch.hslu.oop.schnittstellen;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor extends ASwitchable {

    private int rpm = 0;

    private  final List<PropertyChangeListener> eventListeners = new ArrayList<>();
    public Motor() {
        name = "Motor" + switchCount;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(final int rpm){
        this.rpm = rpm;
    }

    @Override
    public void switchOn() {
        super.switchOn();
        firePropertyChangedEvent(new PropertyChangeEvent(this,"MotorOn",false, true));
    }

    @Override
    public void switchOff() {
        super.switchOff();
        firePropertyChangedEvent(new PropertyChangeEvent(this,"MotorOff",true, false));
    }

    public boolean addPropertyChangeListener(PropertyChangeListener listener)
    {
        return eventListeners.add(listener);
    }

    public boolean removePropertyChangedListener(PropertyChangeListener listener)
    {
        return eventListeners.remove(listener);
    }

    private  void firePropertyChangedEvent(final PropertyChangeEvent evt)
    {
        for(final PropertyChangeListener listener : eventListeners)
        {
            listener.propertyChange(evt);
        }

    }
}
