package bodyguard;

public class Karate extends BodyGuard {


    public Karate(Gun gun) {
        this.gun = gun;
    }

    public Karate(AK47 ak47) {
        this.ak47 = ak47;
    }

    @Override
     void applyMartialArts(Attacker attacker) {
        System.out.println("Карате");
    }
}
