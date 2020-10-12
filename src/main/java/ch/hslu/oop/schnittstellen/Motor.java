package ch.hslu.oop.schnittstellen;

public class Motor extends ASwitchable {

    private boolean isOn = false;
    private final int rpm;

    public Motor(int rpm) {
        name = "Motor" + switchCount;
        this.rpm = rpm;
    }

    public void arbeiten()
    {

    }


    @Override
    public void switchOn() {
        isOn = true;
    }

    @Override
    public void switchOff() {
        isOn = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return isOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isOn;
    }
}
