package ch.hslu.oop.exceptionhandling;

import ch.hslu.oop.temperatur.ITemperaturEventListener;
import ch.hslu.oop.temperatur.Temperatur;

import java.util.Scanner;

import ch.hslu.oop.temperatur.TemperaturEvent;
import ch.hslu.oop.temperatur.TemperaturVerlauf;
import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;

public class ExceptionhandlingDemo {

    private class TemperaturEventListener implements ITemperaturEventListener{

        @Override
        public void temperaturEvent(TemperaturEvent evt) {
            LOG.info(evt);
        }
    }

    private  static final Logger LOG = LogManager.getLogger(ExceptionhandlingDemo.class);

    public static void main(String[] args) {
        String input;

        TemperaturVerlauf tempVerlauf = new TemperaturVerlauf();
        tempVerlauf.addTemperaturListener(evt -> {LOG.info(evt);});

        Scanner scanner = new Scanner(System.in);
        do {
            LOG.info("Bitte Temperatur eingeben ('exit' zum Beenden): ");
            input = scanner.next();
            try {
                float value = Float.valueOf(input);
                Temperatur temp = Temperatur.createFromCelsius(value);
                LOG.info(temp.toString());
                tempVerlauf.add(temp);

            }
            catch(NumberFormatException e)
            {
                if(input.equals("exit")){

                    LOG.info(tempVerlauf.getCount());
                    LOG.info(tempVerlauf.getAverage());
                    LOG.info(tempVerlauf.getMin());
                    LOG.info(tempVerlauf.getMax());
                    LOG.info("Programm beendet.");

                }
                else
                {
                    LOG.error("ungültiger Wert");
                }

            }
        } while (!input.equals("exit"));


    }


}
