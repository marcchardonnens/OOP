package ch.hslu.oop.schnittstellen;

public interface ICountingSwitchable extends ISwitchable {

    /**
     * @return Gibt die Anzahl von an und ausschaltungen zurück
     */
    long getSwitchCount();

}
