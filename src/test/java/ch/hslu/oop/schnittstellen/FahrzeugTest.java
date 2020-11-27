package ch.hslu.oop.schnittstellen;

import org.junit.jupiter.api.Test;

import java.beans.PropertyChangeEvent;

import static org.junit.jupiter.api.Assertions.*;

class FahrzeugTest {

    @Test
    void switchOn() {
        Fahrzeug fahrzeug = new Fahrzeug();
        fahrzeug.switchOn();
        assertTrue(fahrzeug.isSwitchedOn());
    }

    @Test
    void switchOff() {
        Fahrzeug fahrzeug = new Fahrzeug();
        fahrzeug.switchOff();
        assertTrue(fahrzeug.isSwitchedOff());
    }

}