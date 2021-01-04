package Zoo;

public class Duck implements  Fly{
    public Duck(){
        fly();
    }
    @Override
    public void fly() {
        System.out.println("Утка летает");
    }
}
