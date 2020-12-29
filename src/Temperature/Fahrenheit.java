package Temperature;

public class Fahrenheit implements Convert {
    static int degree;



    @Override
    public  void convert() {
        System.out.println((degree * 9/5) + 32);


    }
}
