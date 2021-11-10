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

    // phase 2 tests
    SuperArray blist = new SuperArray(5);
    blist.add("Alif");
    blist.add("Lucas");
    blist.add("Maggie");
// loop 1
    System.out.println("Test for loop 1:");
    for (int i = 0; i < alist.size(); i++) {
      System.out.println("Value " + i + " for alist loop 1: " + alist.get(i));
    }
    System.out.println("");
    for (int i = 0; i < blist.size(); i++) {
      System.out.println("Value " + i + " for blist loop 1: " + blist.get(i));
    }

// loop 2
    System.out.println("Tests for loop 2:");
    for (int i = 0; i < blist.size(); i++) {
      blist.set(i, "cringe");
    }
    System.out.println("Test for Loop 2: " + blist.toString());
    System.out.println("Test for Loop 2: " + blist.toStringDebug());
// loop 3
    System.out.println("Tests for loop 3:");
    for (int i = 0; i < alist.size(); i++) {
      if (!(i == alist.size()-1)) {
        alist.set(i, alist.get(i+1));
      } else {
        alist.set(i, "NOPE!");
      }
    }
    System.out.println("Test for alist Loop 3: " + alist.toString());
    System.out.println("Test for alist Loop 3: " + alist.toStringDebug());

    for (int i = 0; i < blist.size(); i++) {
      if (!(i == blist.size()-1)) {
        blist.set(i, blist.get(i+1));
      } else {
        blist.set(i, "NOPE!");
      }
    }
    System.out.println("Test for blist Loop 3: " + blist.toString());
    System.out.println("Test for blist Loop 3: " + blist.toStringDebug());
//phase 3 tests
    System.out.println("Tests for phase 4 (resizing via add):");
    SuperArray clist = new SuperArray(3);
    clist.add("Ber");
    clist.add("Ark");
    clist.add("Maya");
    System.out.println(clist.toString());
    System.out.println(clist.toStringDebug());
    clist.add("Bell Pepper");
    System.out.println(clist.toString());
    System.out.println(clist.toStringDebug());
  }
}
