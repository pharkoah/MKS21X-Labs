import java.util.*;
@SuppressWarnings("unchecked")
public class Test{
   public static void main(String args[]){
      NoNullArrayList alist = new NoNullArrayList();
      alist.add("Steve");
      alist.add("Tim");
      alist.add("Lucy");
      alist.add("Pat");
      alist.add("Angela");
      alist.set(1, "Cringe");
      System.out.println(alist);
      alist.add(null);

      //displaying elements
      System.out.println(alist);

      //Adding "Steve" at the fourth position
      alist.add(3, "Steve");

      //displaying elements
      System.out.println(alist);
   }
}
