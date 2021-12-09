import java.util.Arrays;
public class Test{
  public static void main (String[] args) {
    WordSearch x = new WordSearch(4, 5);
    System.out.println(x.toString());
    System.out.println(x.addWordHorizontal("woo", 3, 0));
    System.out.println(x.toString());

  }
}
