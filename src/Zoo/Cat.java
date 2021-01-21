package Zoo;

public class Cat extends AbstractAnimal implements Run, Climb{
    @Override
    public void run() {
        System.out.println("Кот бегает");


    }

    @Override
    public void climb() {
        System.out.println("Кот лазает");

    }

}
