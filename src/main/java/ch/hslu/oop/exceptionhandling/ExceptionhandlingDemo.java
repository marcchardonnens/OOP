package ch.hslu.oop.exceptionhandling;

import ch.hslu.oop.temperatur.Temperatur;

import java.util.Scanner;

import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;

public class ExceptionhandlingDemo {

    private  static final Logger LOG = LogManager.getLogger(ExceptionhandlingDemo.class);

    public static void main(String[] args) {
        String input;

        Scanner scanner = new Scanner(System.in);
        do {
            LOG.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
//            System.out.println("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                float value = Float.valueOf(input);
//                System.out.println(Temperatur.createFromCelsius(value).toString());
                LOG.info(Temperatur.createFromCelsius(value).toString());
            }
            catch(NumberFormatException e)
            {
                if(input.equals("exit")){

//                    System.out.println("Programm beendet.");
                    LOG.info("Programm beendet.");
                }
                else
                {
//                    System.out.println("ungültiger Wert");
                    LOG.error("ungültiger Wert");
                }

            }
        } while (!input.equals("exit"));


    }


}
