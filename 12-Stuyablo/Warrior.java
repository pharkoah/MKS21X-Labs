public class Warrior extends Adventurer {
    private int  rage;
    private String warcry;
    private int rageMax;

    public Warrior() {
	     this("Joseph Joestar");
    }

    public Warrior(String name) {
	     this(name,"I know what you're going to say next", 18);
    }

    public Warrior(String name, String warcry, int rage) {
      super(name, 30 + (int)(Math.random()*10));
      setWarcry(warcry);
      setRage(rage);
      this.rageMax = 20;
    }

    //warrior methods
    public String attack(Damageable other) {
  	  int damage = (int)(Math.random()*10)+1;
	    other.applyDamage(damage);
	    setRage(getSpecial() + 1);
	    return (this +
      " attacked " + other + " for " +
      damage + " damage!");
    }

    public String specialAttack(Damageable other) {
      if(getSpecial() >= 10) {
        int damage = (int)(Math.random()*20)+1;
        other.applyDamage(damage);
        setRage(getSpecial() - 10);
        return (this + " unleashes his fury upon "
        + other + " for " + damage + " damage! "+ warcry);
	    } else {
        attack(other);
		    return ("Not enough rage! ");
	    }
    }

    //set methods
    public void setRage(int r) {
      this.rage = r;
    }

    public void setWarcry(String warcry) {
      this.warcry = warcry;
    }

    //get methods
    public String getSpecialName() {
      return "Rage";
    }
    public int getSpecialMax() {
      return rageMax;
    }
    public int getSpecial() {
      return rage;
    }

}
