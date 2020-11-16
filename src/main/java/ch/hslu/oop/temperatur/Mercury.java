package ch.hslu.oop.temperatur;

public class Mercury extends AElement {

    public Mercury()
    {
        super((short) 80, new Temperatur(-38),new Temperatur(356),"Hg");
    }

    @Override
    public String toString() {
        return super.toString() + "ACHTUNG: GIFTIG!!";
    }
}
