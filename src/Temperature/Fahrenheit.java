package Temperature;

public class Fahrenheit implements Convert {
    @Override
    public int getConvert(int degree) {
        return ((degree * 9 / 5) + 32);
    }
}
