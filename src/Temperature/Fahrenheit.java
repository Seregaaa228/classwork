package Temperature;

public class Fahrenheit implements Convert {


    @Override
    public int convert(int degree) {
        return ((degree * 9 / 5) + 32);
    }
}
