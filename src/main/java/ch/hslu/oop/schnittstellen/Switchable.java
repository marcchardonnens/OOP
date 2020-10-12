package ch.hslu.oop.schnittstellen;


/**
 * Interface für KLassen die an und ausgeschaltet werden können.
 */
public interface Switchable {

    /**
     * Schaltet das Objekt an.
     */
    void switchOn();

    /**
     * Schaltet das Objekt aus.
     */
    void switchOff();

    /**
     * @return Gibt true zurück wenn das Objekt an ist.
     */
    boolean isSwitchedOn();

    /**
     * @return Gibt true zurück wenn das Objekt aus ist.
     */
    boolean isSwitchedOff();

}
