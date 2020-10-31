package ch.hslu.oop.person;

import java.util.Objects;

public class Person {

    private final long id;
    private String vorname,nachname;

    public Person(long id, String vorname, String nachname) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public long getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(vorname, person.vorname) &&
                Objects.equals(nachname, person.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, vorname, nachname);
    }


}
