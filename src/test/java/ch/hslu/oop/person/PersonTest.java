package ch.hslu.oop.person;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person(1,"vorname","nachname");
    }

    @Test
    void getId() {
        assertEquals(1,person.getId());
    }

    @Test
    void getVorname() {
        assertEquals("vorname",person.getVorname());
    }

    @Test
    void setVorname() {
        person.setVorname("neuername");
        assertEquals("neuername", person.getVorname());
    }

    @Test
    void getNachname() {
        assertEquals("nachname",person.getNachname());
    }

    @Test
    void setNachname() {
        person.setNachname("neuer nachname");
        assertEquals("neuer nachname",person.getNachname());
    }

    @Test
    void testToString() {
        assertEquals("Person{" +
                "id=" + 1 +
                ", vorname='" + "vorname" + '\'' +
                ", nachname='" + "nachname" + '\'' +
                '}', person.toString());
    }

    @Test
    void testEquals() {
        assertTrue(person.equals(new Person(1,"vorname","nachname")));
        assertFalse(person.equals(new Person(1,"vorname","nachnam")));
        assertFalse(person.equals(new Person(2,"vorname","nachname")));
    }

    @Test
    void testHashCode() {
        assertEquals(person.hashCode(), new Person(1,"vorname","nachname").hashCode());
        assertNotEquals(person.hashCode(), new Person(2,"vorname","nachname").hashCode());
        assertNotEquals(person.hashCode(), new Person(1,"voname","nachname").hashCode());
    }

    @Test
    void testEqualsContract(){
        EqualsVerifier.simple().forClass(Person.class).verify();
    }
}