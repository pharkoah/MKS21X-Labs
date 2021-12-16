import java.util.Arrays;
public class Test{
  public static void main (String[] args) {
    WordSearch x = new WordSearch(4, 5);
    x.toString();
    x.addWordHorizontal("woo", 3, 0);
    x.toString(); // initial horizontal test
    x.addWordVertical("hiii", 0, 2);
    x.toString(); // overlap test horizontal
    x.addWordVertical("hiii", 0, 4);
    x.toString(); // initial vertical test
    x.addWordHorizontal("cring", 2, 0);
    x.toString();
    WordSearch y = new WordSearch(10, 10);
    y.addWordDiagonal("cringe", 1, 1);
    y.toString();
    x.addWordDiagonal("wooo", 0, 0);
    x.toString();
    y.addWordHorizontal("crine", 3, 4);
    y.toString();
    y.addWordDiagonal("beryl", 4, 0);
    y.toString();
  }
}
