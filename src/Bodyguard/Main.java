package Bodyguard;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();

        Attacker attacker = new Attacker(gun);
        BodyGuard bodyGuard = new Karate(gun);
       bodyGuard.saveClientLife(attacker);


    }
}
