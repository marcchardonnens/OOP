package ch.hslu.oop.temperatur;

public class Mercury extends AElement {

    public Mercury()
    {
        this.tempMeltingPoint = new Temperatur(-38);
        this.tempBoilingPoint = new Temperatur(356);
        this.shortName = "Hg";
    }

    @Override
    public String toString() {
        return super.toString() + "ACHTUNG: GIFTIG!!";
    }
}
