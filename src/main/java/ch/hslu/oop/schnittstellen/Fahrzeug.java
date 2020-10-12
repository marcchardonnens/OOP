package ch.hslu.oop.schnittstellen;

public class Fahrzeug extends ASwitchable {

    Motor motor = new Motor(1000);
    Licht licht = new Licht();

    public Fahrzeug()
    {
        name = "Fahrzeug" + switchCount;
        motor.switchOn();
        licht.switchOn();
    }


}
