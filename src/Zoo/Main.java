package Zoo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {

        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Object object = null;
           String input = reader.readLine();


            if (input.equals("")){
                System.out.println("Стоп");
                break;
            }

            switch (input) {

                case "Cat":
                    System.out.println("Создан кот");
                    object = new Cat();
                    break;
                case "Tiger":
                    System.out.println("Создан тигр");
                    object = new Tiger();
                    break;
                case "Duck":
                    System.out.println("Создана утка");
                    object = new Duck();
            }





        }

    }

}
