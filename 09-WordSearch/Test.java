import java.util.Arrays;
public class Test{
  public static void main (String[] args) {
    WordSearch x = new WordSearch(4, 5);
    x.toString();
    System.out.println(x.addWordHorizontal("woo", 3, 0));
    x.toString();
    System.out.println(x.addWordVertical("hiii", 0, 2));
    x.toString();
  }
}
