/*Lab9: Word Search generator
*/
public class WordSearch{
    private char[][]data;
    private int Prows, Pcols;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols) {
      data = new char[rows][cols];
      Prows = rows;
      Pcols = cols;
      for (int i = 0; i < rows; i++) {
        for (int x = 0; x < cols; x++) {
          data[i][x] = '_';
        }
      }
    }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear() {
      data = new char[Prows][Pcols];
      for (int i = 0; i < Prows; i++) {
        for (int x = 0; x < Pcols; x++) {
          data[i][x] = '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString() {
      String res = "";
      for (int i = 0; i < Prows; i++) {
        for (int x = 0; x < Pcols; x++) {
          res += data[i][x];
        }
        res += "\n";
      }
      System.out.println(res);
      return "res";
    }


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
    public boolean addWordHorizontal(String word, int row, int col) {
      for (int i = row; i < row+1; i++) {
        for (int x = col; x < col+word.length(); x++) {
          if (data[i][x] == '_' || word.charAt(x) == data[i][x]) {
            data[i][x] = word.charAt(x);
          }
          else {
            for (int j = x-1; j > col-1; j--) {
              data[i][j] = '_';
            }
            return false;
          }
        }
      }
      return true;
    }


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
    public boolean addWordVertical(String word, int row, int col) {
      for (int i = col; i < col+1; i++) {
        for (int x = row; x < row+word.length(); x++) {
          if (data[x][i] == '_' || word.charAt(x) == data[x][i]) {
            data[x][i] = word.charAt(x);
          }
          else {
            for (int j = x-1; j > row-1; j--) {
              data[j][i] = '_';
            }
            return false;
          }
        }
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned
     *and the board is not modified.
     */
    public boolean addWordDiagonal(String word, int row, int col) {
      int wordIndex = 0;
      int x = col;
      for (int i = row; i < row + word.length(); i++) {
        if (data[i][x] == '_' || word.charAt(wordIndex) == data[i][x]) {
          data[i][x] = word.charAt(wordIndex);
          wordIndex++;
        }
        else {
          int k = i - 1;
          for (int j = x-1; j > col - 1 && k > row - 1; j--) {
            data[k][j] = '_';
            k--;            
          }
          return false;
        }
        x++;
      }
      return true;
    }
}
