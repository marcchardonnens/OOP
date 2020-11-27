package ch.hslu.oop.temperatur;

import java.util.EventObject;

public class TemperaturEvent extends EventObject {

    private TemperaturEventType type;

    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @throws IllegalArgumentException if source is null
     */
    public TemperaturEvent(Object source, TemperaturEventType type) {
        super(source);
        this.type = type;
    }

    public TemperaturEventType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "TemperaturEvent{" +
                "type=" + type +
                '}';
    }
}
