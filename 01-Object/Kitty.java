public class Kitty {
  //private variables
  private String name;
  private int age;
  //2 constructors
  public Kitty() {
    name = "Mittens";
    age = 2;
  }

  public Kitty(String startName, int startAge) {
    name = startName;
    age = startAge;
  }
  //accessor methods
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
  //mutator methods
  public void changeName(String newName) {
    name = newName;
  }

  public void makeOlder() {
    age++;
  }
  
}
