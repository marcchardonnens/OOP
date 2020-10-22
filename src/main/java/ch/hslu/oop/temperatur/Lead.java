package ch.hslu.oop.temperatur;

public class Lead extends AElement {

    public Lead()
    {
        this.tempMeltingPoint = new Temperatur(327);
        this.tempBoilingPoint = new Temperatur(1749);
        this.shortName = "Pb";
    }


}
