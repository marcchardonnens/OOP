package ch.hslu.oop.Iterationen;

public class Demo {


    public void AufgabeA ()
    {
        for (int i = 0; i > 11; i++)
        {
            System.out.println(i);
        }
        int i = 0;
        while(i < 11)
        {
            System.out.println(i);
            i++;
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i > 11);
    }


    public void AufgabeC ()
    {
        float i = 0.9f;
        int j = 0;
        while (i > 1.0f){
            j++;
            i += 0.000025f;
            System.out.println(i);
        }
    }

    public void AufgabeE() {
        for (int i = 0; i < 4000; i++){
            System.out.println(i);
        }
    }


    public void printBox(final int height, final int width){

        for (int i = 0; i < width; i++)
        {
            System.out.println("#");
        }

    }


}
