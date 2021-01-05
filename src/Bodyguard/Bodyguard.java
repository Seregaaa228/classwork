package Bodyguard;

abstract class BodyGuard   {
    Gun gun;

  public BodyGuard(Gun gun){
      this.gun = gun;

  }
  public BodyGuard(){

  }

    abstract void applyMartialArts(Attacker attacker);

    void shoot(Attacker attacker) {
        gun.shoot(attacker);
    }



    void saveClientLife(Attacker attacker) {
        if (attacker.gun == null)
            applyMartialArts(attacker);
        else
            shoot(attacker);
    }
}
