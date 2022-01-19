public class EnemyStand extends Adventurer {
  private int STANDOHpowah;
  private int STANDOHpowahMAX;
  private String stand;

  public EnemyStand() {
     this("DIO");
  }

  public EnemyStand(String name) {
     this(name, 100);
  }

  public EnemyStand(String name, int STANDOHpowah) {
    this(name, STANDOHpowah, 50 + (int)(Math.random()*100), "ZA WARUDO");
    this.stand = "ZA WARUDO";
  }

  public EnemyStand(String name, int STANDOHpowah, int HP, String stand) {
    super(name, HP);
    this.STANDOHpowah = STANDOHpowah;
    this.STANDOHpowahMAX = STANDOHpowah;
    this.stand = stand;
  }

  //wizard methods
  public String attack(Damageable other) {
    int damage = (int)(Math.random()*10)+1;
    other.applyDamage(damage);
    if (STANDOHpowah < STANDOHpowahMAX) {
      this.STANDOHpowah = (getSpecial() + 1);
    }
    return (this +
    " attacked " + other + " for " +
    damage + " damage!");
  }

  public String specialAttack(Damageable other) {
    if(getSpecial() >= 10) {
      int damage = (int)(Math.random()*20)+1;
      other.applyDamage(damage);
      this.STANDOHpowah = (getSpecial() - 10);
      return (this + " unleashes his stand " + stand + " upon "
      + other + " for " + damage + " damage! ");
    } else {
      attack(other);
      return ("B-b-bAKANA...");
    }
  }


  //set methods
  public void setMagic(int r) {
    this.STANDOHpowah = r;
  }

  //get methods
  public String getSpecialName() {
    return "Standoh Powah";
  }
  public int getSpecialMax() {
    return STANDOHpowahMAX;
  }
  public int getSpecial() {
    return STANDOHpowah;
  }

}
