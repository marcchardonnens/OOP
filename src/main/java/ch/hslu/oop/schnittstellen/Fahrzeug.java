package ch.hslu.oop.schnittstellen;

public class Fahrzeug extends AbstractSwitchable {

    Motor motor = new Motor(1000);
    Licht licht = new Licht();

    public Fahrzeug()
    {
        motor.switchOn();
        licht.switchOn();
    }


}
