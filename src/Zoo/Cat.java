package Zoo;

public class Cat implements Run, Climb{
    public Cat(){
        run();
        climb();
    }
    @Override
    public void run() {
        System.out.println("Кот бегает");


    }

    @Override
    public void climb() {
        System.out.println("Кот лазает");

    }
}
