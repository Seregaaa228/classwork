package bodyguard;

abstract class BodyGuard   {
    Gun gun;
    AK47 ak47;

  public BodyGuard(Gun gun){
      this.gun = gun;

  }

    public BodyGuard(AK47 ak47) {
        this.ak47 = ak47;
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
