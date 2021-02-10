package Temperature;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("В какие единицы перевести");
        System.out.println("F - Фаренгейты");
        System.out.println("K - Кельвины");
        String input;
        while (!(input = scanner.next()).isEmpty()) {
            System.out.println("Введите градусы");
            Convert object = null;
            switch (input) {
                case "F":
                    object = new Fahrenheit();
                    break;
                case "K":
                    object = new Kelvin();
                    break;
            }
            System.out.println(object.getConvert(scanner.nextInt()));
        }
    }
}
