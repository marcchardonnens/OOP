package ch.hslu.oop.exceptionhandling;

import ch.hslu.oop.temperatur.ITemperaturEventListener;
import ch.hslu.oop.temperatur.Temperatur;

import java.io.*;
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

        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("c:\\temp\\temperaturwerte.dat"))){

            int count = dataInputStream.readInt();
            for(int i = 0; i < count; i++)
            {
                tempVerlauf.add(Temperatur.createFromCelsius(dataInputStream.readFloat()));
            }

            LOG.info("gelesene Werte " + tempVerlauf.getCount() + " " + tempVerlauf.getTemperaturen().toString());
        }
        catch(IOException ioException)
        {
            LOG.error(ioException);
        }

        
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

                    try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("c:\\temp\\temperaturwerte.dat"))){
                        dataOutputStream.writeInt(tempVerlauf.getCount());
                        for(Temperatur t : tempVerlauf.getTemperaturen())
                        {
                            dataOutputStream.writeFloat(t.getTempCelsius());
                        }

                    }
                    catch(IOException ioException)
                    {
                        LOG.error(ioException);
                    }


                }
                else
                {
                    LOG.error("ungültiger Wert");
                }

            }
        } while (!input.equals("exit"));


    }


}
