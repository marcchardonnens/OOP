package ch.hslu.oop.schnittstellen;

public interface INamed {

    /**
     * @param name Gibt dem Objekt einen Namen
     */
    void setName(final String name);

    /**
     * @return Gibt den Namen des Objekts zurück
     */
    String getName();

}
