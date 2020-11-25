package ch.hslu.oop.temperatur;

public class Mercury extends AElement {

    public Mercury()
    {
        super((short) 80, Temperatur.createFromCelsius(-38), Temperatur.createFromCelsius(356),"Hg");
    }

    @Override
    public String toString() {
        return super.toString() + "ACHTUNG: GIFTIG!!";
    }
}
