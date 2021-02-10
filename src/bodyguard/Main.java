package bodyguard;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun();
        AK47 ak47 = new AK47();

        Attacker attacker = new Attacker(gun);
        BodyGuard bodyGuard = new Karate(ak47);
       bodyGuard.saveClientLife(attacker);


    }
}
