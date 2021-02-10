package bodyguard;

public class Box extends BodyGuard {


    @Override
    void applyMartialArts(Attacker attacker) {
        System.out.println("Бокс");
    }
}
