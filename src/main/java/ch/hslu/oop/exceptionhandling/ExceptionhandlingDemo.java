package ch.hslu.oop.exceptionhandling;

import ch.hslu.oop.temperatur.Temperatur;

import java.util.Scanner;

public class ExceptionhandlingDemo {

    public static void main(String[] args) {
        String input;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                float value = Float.valueOf(input);
                System.out.println(new Temperatur(value).toString());
            }
            catch(NumberFormatException e)
            {
                if(input == "exit"){

                    System.out.println("Programm beendet.");
                }
                else
                {
                    System.out.println("ungültiger Wert");
                }

            }
        } while (!input.equals("exit"));


    }


}
