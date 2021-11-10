public class TesterForSA {
  public static void main(String args[]){
    SuperArray alist = new SuperArray();
    alist.add("Mario");
    //displaying elements
    System.out.println(alist.toString());
    System.out.println(alist.toStringDebug());

    alist.add("Samus");
    //displaying elements
    System.out.println(alist.toString());
    System.out.println(alist.toStringDebug());

    alist.add("Ash");
    alist.add("Link");
    alist.add("Kirby");
    //displaying elements
    System.out.println(alist.toString());
    System.out.println(alist.toStringDebug());
    System.out.println("test for size: " + alist.size());

    // loops
    SuperArray blist = alist;
// loop 1
    System.out.println("Tests for loop 1:");
    for (int i = 0; i < alist.size(); i++) {
      System.out.println("Value " + i + " for loop 1: " + alist.get(i));
    }

// loop 2
    System.out.println("Tests for loop 2:");
    for (int i = 0; i < alist.size(); i++) {
      alist.set(i, "cringe");
    }
    for (int i = 0; i < alist.size(); i++) {
      System.out.println("Value " + i + " for loop 2: " + alist.get(i));
    }

// loop 3
    System.out.println("Tests for loop 3:");
    for (int i = 0; i < blist.size(); i++) {
      if (!(i == alist.size()-1)) {
        blist.set(i, blist.get(i+1));
      } else {
        blist.set(i, "NOPE!");
      }
    }
    for (int i = 0; i < blist.size(); i++) {
      System.out.println("Value " + i + " for loop 3: " + blist.get(i));
    }

  }
}
