package ch.hslu.oop.temperatur;

import java.util.EventListener;

public interface ITemperaturEventListener extends EventListener {
    void temperaturEvent(final TemperaturEvent evt);
}
