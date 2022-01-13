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
    int[] arr = new int[4];
    if (random < 25) {
      System.out.print(Text.colorize("c", Text.RED, Text.BOLD));
    }
    if (random > 75) {
      System.out.print(Text.colorize("c", Text.BLACK, Text.BOLD));
    }
    else {
      System.out.print(Text.colorize("c", Text.WHITE, Text.BOLD));
    }
  }

  public static void main(String[] args) {
    Border(4, 5);
  }


}
