package Zoo;

public class Tiger implements Run, Climb {
    public Tiger(){
        climb();
        run();
    }
    @Override
    public void climb() {
        System.out.println("Тигр бегает");


    }

    @Override
    public void run() {
        System.out.println("Тигр бегает");

    }
}
