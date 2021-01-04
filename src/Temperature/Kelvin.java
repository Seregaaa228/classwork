package Temperature;

public class Kelvin implements Convert {

    @Override
    public int convert(int degree) {

        return (int) (degree + 273.15);



    }
}
