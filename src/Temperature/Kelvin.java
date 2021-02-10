package Temperature;

public class Kelvin implements Convert {
    @Override
    public int getConvert(int degree) {
        return (int) (degree + 273.15);
    }
}
