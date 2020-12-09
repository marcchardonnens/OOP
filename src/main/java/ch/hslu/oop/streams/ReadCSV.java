package ch.hslu.oop.streams;

import ch.hslu.oop.temperatur.Temperatur;
import ch.hslu.oop.temperatur.TemperaturVerlauf;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class ReadCSV {

    private static Logger LOG = LogManager.getLogger();


    public static void main(String args[])
    {
        File file = new File("c:\\temp\\netatmo-export-201801-201804.csv");
        TemperaturVerlauf verlauf = new TemperaturVerlauf();
        if(file.exists())
        {
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file)))
            {
                String strCurrentLine = "";
                while((strCurrentLine = bufferedReader.readLine()) != null)
                {
                    double d = Double.valueOf(strCurrentLine.split(";")[2]);
                    verlauf.add(Temperatur.createFromCelsius((float)d));
                    LocalDateTime dateTime = LocalDateTime.parse(strCurrentLine.split(";")[1], DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
                    LOG.info(dateTime + " " + d);
                }
            }
            catch (IOException exception)
            {
                LOG.error(exception);
            }

            LOG.info(verlauf.getMin());
            LOG.info(verlauf.getMax());
            LOG.info(verlauf.getAverage());
            LOG.info(verlauf.getCount());


        }
    }
}
