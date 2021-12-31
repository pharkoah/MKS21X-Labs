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
      b.set(0, 1);
      //b.set(3, "hi");
      //b.set(2, "u suck");
      System.out.println(b);
      alist.add(null);

   }
}
