public class Border{

  public static String Border(int row, int col) {
    Text.clear();
    Text.go(0,0);
    String[][] bord = new String[row][col];
    for (int i = 0; i < row; i++) {
      bord[i][0] = Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD);
      bord[i][col-1] = Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD);
    }

    for (int j = 0; j < col; j++) {
      bord[row - 1][j] = Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD);
      bord[row - 1][j] = Text.colorize("c", Text.BLUE, Text.WHITE + Text.BACKGROUND, Text.BOLD);
    }
  }

}
