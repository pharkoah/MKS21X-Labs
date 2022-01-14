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
    rArr(row, col);
    System.out.println();
  }

  public static void rArr(int row, int col) {
    int random = (int)(Math.random()*100);
    int[] arr = new int[4];

    /*if (random < 25) {
      System.out.print(Text.colorize("c", Text.RED, Text.BOLD));
    }
    if (random > 75) {
      System.out.print(Text.colorize("c", Text.BLACK, Text.BOLD));
    }
    else {
      System.out.print(Text.colorize("c", Text.WHITE, Text.BOLD));
    }*/
    Text.go(2, ((col-2)/4)-2);
    String space = "";
    for (int x = 0; x < ((col-2)/4)-2; x++) {
      space += " ";
    }
    for (int i = 0; i < arr.length; i++) {
      String res = "";
      arr[i] = (int)(Math.random()*100);
      res += arr[i];
      if (arr[i] < 25) {
        System.out.print(Text.colorize(res, Text.RED, Text.BOLD));
      }
      if (arr[i] > 75) {
        System.out.print(Text.colorize(res, Text.BLACK, Text.BOLD));
      }
      else {
        System.out.print(Text.colorize(res, Text.WHITE, Text.BOLD));
      }
      if (i != arr.length-1) {
        System.out.print(space);
      }
    }
  }

  public static void main(String[] args) {
    Border(30, 80);
    //rArr(30, 80);
  }


}
