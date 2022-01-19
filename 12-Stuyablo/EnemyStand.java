public class EnemyStand extends Adventurer {
  private int STANDOHpowah;
  private int STANDOHpowahMAX;

  public EnemyStand() {
     this("DIO");
  }

  public EnemyStand(String name) {
     this(name, 100);
  }

  public EnemyStand(String name, int STANDOHpowah) {
    this(name, STANDOHpowah, 30 + (int)(Math.random()*5));
  }

  public EnemyStand(String name, int STANDOHpowah, int HP) {
    super(name, HP);
    this.STANDOHpowah = STANDOHpowah;
    this.STANDOHpowahMAX = STANDOHpowah;
  }

  //wizard methods
  public String attack(Damageable other) {
    int damage = (int)(Math.random()*10)+1;
    other.applyDamage(damage);
    this.STANDOHpowah = (getSpecial() + 1);
    return (this +
    " attacked " + other + " for " +
    damage + " damage!");
  }

  public String specialAttack(Damageable other) {
    if(getSpecial() >= 10) {
      int damage = (int)(Math.random()*20)+1;
      other.applyDamage(damage);
      this.STANDOHpowah = (getSpecial() - 10);
      return (this + " unleashes his stand ZA WARUDO upon "
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
    return "Magic";
  }
  public int getSpecialMax() {
    return STANDOHpowahMAX;
  }
  public int getSpecial() {
    return STANDOHpowah;
  }

}
