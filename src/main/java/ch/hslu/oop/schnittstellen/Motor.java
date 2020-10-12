package ch.hslu.oop.schnittstellen;

public class Motor implements Switchable {

    private boolean isOn = false;
    private final int rpm;

    public Motor(int rpm) {
        this.rpm = rpm;
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
