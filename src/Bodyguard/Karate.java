package Bodyguard;

public class Karate extends BodyGuard {


    public Karate(Gun gun) {
        this.gun = gun;
    }

    @Override
     void applyMartialArts(Attacker attacker) {
        System.out.println("Карате");
    }
}
