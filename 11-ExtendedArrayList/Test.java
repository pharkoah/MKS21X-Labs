import java.util.*;
@SuppressWarnings("unchecked")
public class Test{
   public static void main(String args[]){
      NoNullArrayList alist = new NoNullArrayList();
      alist.add("Steve");
      alist.add("0");
      alist.add(0);
      alist.add("Pat");
      alist.add("Angela");
      alist.set(1, "Cringe");
      System.out.println(alist);
      NoNullArrayList b = new NoNullArrayList();
      //b.set(1, "emilay");
      b.add("woo");
      b.add("amogus");
      b.add("fortnite");
      b.add("cringe");
      b.set(0, 1);
      b.set(3, "hi");
      b.set(2, "u suck");
      System.out.println(b);
      //alist.add(null);      null was not added exception went into action

      OrderedArrayList c = new OrderedArrayList(4);
      c.add(1);
      c.add(4);
      System.out.println(c);
      c.add(1, 5);
      System.out.println(c);
      c.add(0);
      System.out.println(c);
      c.add(6);
      System.out.println(c);
      //c.set(2, null);       null was not added exception went into action
   }
}
