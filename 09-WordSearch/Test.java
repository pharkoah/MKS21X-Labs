import java.util.Arrays;
public class Test{
  public static void main (String[] args) {
    WordSearch x = new WordSearch(4, 5);
    x.toString();
    x.addWordHorizontal("woo", 3, 0);
    x.toString(); // initial horizontal test
    x.addWordVertical("hiii", 0, 2);
    x.toString(); // overlap test
    x.addWordVertical("hiii", 0, 4);
    x.toString(); // initial vertical test
  }
}
