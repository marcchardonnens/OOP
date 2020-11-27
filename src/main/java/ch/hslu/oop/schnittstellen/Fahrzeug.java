package ch.hslu.oop.schnittstellen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Fahrzeug extends ASwitchable{
    private class FahrzeugPropertyListener implements PropertyChangeListener
    {

        /**
         * This method gets called when a bound property is changed.
         *
         * @param evt A PropertyChangeEvent object describing the event source
         *            and the property that has changed.
         */
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            handleMotorEvent(evt);
        }
    }


    private static final Logger LOG = LogManager.getLogger();
    private final Motor motor = new Motor();
    private final Licht lichtVorneRechts = new Licht();
    private final Licht lichtVorneLinks = new Licht();

    public Fahrzeug()
    {
        name = "Fahrzeug" + switchCount;
        motor.addPropertyChangeListener(evt -> {handleMotorEvent(evt);});
    }

    public Motor getMotor() {
        return motor;
    }

    public Licht getLichtVorneRechts() {
        return lichtVorneRechts;
    }

    public Licht getLichtVorneLinks() {
        return lichtVorneLinks;
    }

    @Override
    public void switchOn() {
        super.switchOn();
        motor.switchOn();
        lichtVorneRechts.switchOn();
        lichtVorneLinks.switchOn();
    }

    @Override
    public void switchOff() {
        super.switchOff();
        motor.switchOff();
        lichtVorneRechts.switchOff();
        lichtVorneLinks.switchOff();
    }

    public void handleMotorEvent(final PropertyChangeEvent evt)
    {
        LOG.info(evt);
    }

}
