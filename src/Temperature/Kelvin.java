package Temperature;

public class Kelvin implements Convert {
    static int degree;
    @Override
    public  void convert() {
        System.out.println(degree + 273.15);



    }
}
