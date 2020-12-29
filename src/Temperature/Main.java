package Temperature;


import Task1.Duck;
import Task1.Flyable;
import Task1.Human;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Temperature.Convert.scanner;
import static Temperature.Fahrenheit.degree;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("В какие единицы перевести");
        System.out.println("F - Фаренгейты");
        System.out.println("K - Кельвины");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        while (!(input = reader.readLine()).isEmpty()) {

            Object object = null;
            switch (input) {
                case "F":
                    object = new Fahrenheit();
                    break;
                case "K":
                    object = new Kelvin();
                    break;




            }
            System.out.println("Введите градусы");
            degree = scanner.nextInt();
            if (object instanceof Fahrenheit) {
                ((Convert) object).convert();
            }

            if (object instanceof Kelvin) {
                ((Convert) object).convert();
            }
        }
    }
}
