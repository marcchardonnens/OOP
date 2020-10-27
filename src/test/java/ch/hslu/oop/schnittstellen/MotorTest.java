package ch.hslu.oop.schnittstellen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorTest {

    private Motor motor = new Motor(1000);

    @Test
    void switchOn() {
        motor.switchOn();
        assertTrue(motor.isSwitchedOn());
    }

    @Test
    void switchOff() {
        motor.switchOff();
        assertTrue(motor.isSwitchedOff());
    }

    @Test
    void isSwitchedOn() {
        assertFalse(motor.isSwitchedOn());
    }

    @Test
    void isSwitchedOff() {
        assertTrue(motor.isSwitchedOff());
    }

    @Test
    void arbeiten() {
        motor.arbeiten();
    }
}