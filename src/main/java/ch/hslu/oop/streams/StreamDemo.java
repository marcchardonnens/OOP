package ch.hslu.oop.streams;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class StreamDemo {

    private static Logger LOG = LogManager.getLogger();

    public static void main(String args[])
    {
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("c:\\temp\\streamtest.dat"))){
            dataOutputStream.writeInt(42);
            dataOutputStream.writeUTF("hallo");
        }
        catch(IOException ioException)
        {
            LOG.error(ioException);
        }
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("c:\\temp\\streamtest.dat"))){
            int i = dataInputStream.readInt();
//            byte i = dataInputStream.readByte();
            String s = dataInputStream.readUTF();
            LOG.info(i + " " + s);

        }
        catch(IOException ioException)
        {
            LOG.error(ioException);
        }


    }


}
