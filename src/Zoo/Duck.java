package Zoo;

public class Duck extends AbstractAnimal implements  Fly{
    @Override
    public void fly() {
        System.out.println("Утка летает");
    }

}
