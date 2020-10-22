package ch.hslu.oop.vererbung;

import ch.hslu.oop.schnittstellen.Fahrzeug;
import ch.hslu.oop.schnittstellen.INamed;
import ch.hslu.oop.schnittstellen.Motor;

public class Demo {

    public void demostrate()
    {
        //Aufgabe h
        Shape shape1 = new Circle(1,1,12);
        Shape shape2 = new Rectangle(2,2,4,6);

        //Aufgabe i
        shape1.move(2,2);
        shape2.move(1,1);


        //Aufgabe j
        ((Circle)shape1).getDiameter();


        //Aufgabe k
        /*
        Shape ist statisch
        Circle und Rectangle sind in diesem Fall dynamisch
         */

        //Aufgabe l
        INamed namedClass = new Fahrzeug();



    }
}
