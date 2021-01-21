package Zoo;

import Task1.Swimmable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            AbstractAnimal animal = null;
            String input = reader.readLine();


            if (input.equals("")) {
                System.out.println("Стоп");
                break;
            }

            switch (input) {

                case "Cat":
                    System.out.println("Создан кот");
                    animal = new Cat();
                    break;
                case "Tiger":
                    System.out.println("Создан тигр");
                    animal = new Tiger();
                    break;
                case "Duck":
                    System.out.println("Создана утка");
                    animal = new Duck();

                default:
                    System.out.println("Unknown Animal");

            }
            if (animal instanceof Fly) {
                ((Fly) animal).fly();
            }

            if (animal instanceof Run) {
                ((Run) animal).run();
            }

            if (animal instanceof Climb) {
                ((Climb) animal).climb();


            }

        }
    }
}


