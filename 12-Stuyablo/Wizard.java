public class Wizard extends Adventurer {
  private int magic;
  private int magicMax;

  public Wizard() {
     this("Muhammad Avdol");
  }

  public Wizard(String name) {
     this(name, 30 + (int)(Math.random()*5));
  }

  public Wizard(String name, int magic) {
    this(name, magic, 75);
  }

  public Wizard(String name, int magic, int HP) {
    super(name, HP);
    this.magic = magic;
    this.magicMax = magic;
  }

  //wizard methods
  public String attack(Damageable other) {
    int damage = (int)(Math.random()*10)+1;
    other.applyDamage(damage);
    if (magic < magicMax) {
      this.magic = (getSpecial() + 1);
    }
    return (this +
    " attacked " + other + " for " +
    damage + " damage!");
  }

  public String specialAttack(Damageable other) {
    if(getSpecial() >= 10) {
      int damage = (int)(Math.random()*20)+1;
      other.applyDamage(damage);
      this.magic = (getSpecial() - 10);
      return (this + " unleashes his magic upon "
      + other + " for " + damage + " damage! ");
    } else {
      attack(other);
      return ("Not enough magic! ");
    }
  }

  //set methods
  public void setMagic(int r) {
    this.magic = r;
  }

  //get methods
  public String getSpecialName() {
    return "Magic";
  }
  public int getSpecialMax() {
    return magicMax;
  }
  public int getSpecial() {
    return magic;
  }

}
