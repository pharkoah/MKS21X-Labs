import java.util.*;
public class Border{
  //private String[][]bord;
  public static void Border(int row, int col) {
    Text.clear();
    Text.go(0,0);
    //bord = new String[row][col];
    for (int i = 0; i < row; i++) {
      Text.go(i, 0);
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
      Text.go(i+1, col);
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
    }

    for (int j = 0; j < col; j++) {
      Text.go(0, j);
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
      Text.go(row, j+1);
      System.out.print(Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD));
    }
    System.out.println();
  }

  public static void rArr(int row, int col) {
    int random = (int)(Math.random()*100);
    //for (int i = 0; i < 5)
    //System.out.print(Text.colorize(random, Text.BLUE, Text.BOLD));
  }

  public static void main(String[] args) {
    Border(4, 5);
  }


}
