package ch.hslu.oop.Kontrollstruckturen;

public class Demo {

    public int max(int a, int b)
    {
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public int min(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }

    public int max(int a, int b, int c){
        int max = 0;
        int max_bc = max(b,c);
        if(a > max_bc){
            return a;
        }
        else{
            return max_bc;
        }

    }

}
