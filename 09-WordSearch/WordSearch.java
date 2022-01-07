import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
public class WordSearch{
    private char[][]data;

    //the random seed used to produce this WordSearch
    private int seed;

    //a random Object to unify your random calls
    private Random randgen;

    //all words that were successfully added get moved into wordsAdded.
    private ArrayList<String>wordsAdded;

    /*New Constructors:  Both will read in the word text file, then run addAllWords().
     *Do not fill in random letters after.*/

    public WordSearch(int rows, int cols, String fileName){
        randgen = new Random();
        seed = randgen.nextInt();
        randgen = new Random(seed);
        data = new char[rows][cols];
        clear();
        wordsAdded = new ArrayList<String>();
        addAllWords(fileName);
    }

    public WordSearch( int rows, int cols, String fileName, int randSeed){
        //Use the random seed specified.
        seed = s;
        randgen = new Random(seed);
        data = new char[rows][cols];
        clear();
        wordsAdded = new ArrayList<String>();
        addAllWords(fileName);
    }

    private void clear() {
      data = new char[Prows][Pcols];
      for (int i = 0; i < Prows; i++) {
        for (int x = 0; x < Pcols; x++) {
          data[i][x] = '_';
        }
      }
    }

    public String toString() {
      String res = "";
      for (int i = 0; i < Prows; i++) {
        for (int x = 0; x < Pcols; x++) {
          res += data[i][x] + " ";
        }
        res += "\n";
      }
      res += "Words: "
      for (int x = 0; x < wordsAdded.size(); x++) {
        if (x == wordsAdded.size()-1) {
          res += wordsAdded.get(i);
        } else {
          res += wordsAdded.get(i) + ", ";
        }
      }
      res += "\n Seed: " + seed;
      return res;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
    *The word is added in the direction rowIncrement,colIncrement
    *Words must have a corresponding letter to match any letters that it overlaps.
    *
    *@param word is any text to be added to the word grid.
    *@param row is the vertical locaiton of where you want the word to start.
    *@param col is the horizontal location of where you want the word to start.
    *@param rowInc is -1,0, or 1 and represents the displacement of each letter in the row direction
    *@param colInc is -1,0, or 1 and represents the displacement of each letter in the col direction
    *@return true when: the word is added successfully.
    *        false (and do not change the board at all) when any of the following happen:
    *        a) rowInc and colInc are both 0,
    *        b) the word doesn't fit,
    *        c) there are overlapping letters that do not match
    */
    public boolean addWord(String word,int row, int col, int rowInc, int colInc) {
      if (rowInc == 0 && colInc == 0) {
        return false;
      }
      int barrierR = 0;
      int barrierC = 0;
      for (int i = 0; i < word.length(); i++) {
        barrierR = rowInc * i + row;
        barrierC = colInc * i + col;
        if (data[barrierR][barrierC] == '_' || word.charAt(i) == data[barrierR][barrierC]) {
          data[barrierR][barrierC] = word.charAt(i);
        } else {
          int incR = 0;
          int incC = 0;
          for (int x = 0; incR != barrierR && incC != barrierC; x++) {
            incR = rowInc * x + row;
            incC = colInc * x + col;
            data[incR][incC] = '_';
          }
          return false;
        }
      }
      wordsAdded.word(word);
      return true;
    }

    // THE REST IS OLD CODE

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch


    public WordSearch(int rows,int cols) {
      data = new char[rows][cols];
      Prows = rows;
      Pcols = cols;
      for (int i = 0; i < rows; i++) {
        for (int x = 0; x < cols; x++) {
          data[i][x] = '_' +;
        }
      }
    }

    /**Set all values in the WordSearch to underscores'_'
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

    public String toString() {
      String res = "";
      for (int i = 0; i < Prows; i++) {
        for (int x = 0; x < Pcols; x++) {
          res += data[i][x] + " ";
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

    public boolean addWordHorizontal(String word, int row, int col) {
      int wordIndex = 0;
      for (int i = row; i < row+1; i++) {
        for (int x = col; x < col+word.length(); x++) {
          if (data[i][x] == '_' || word.charAt(wordIndex) == data[i][x]) {
            data[i][x] = word.charAt(wordIndex);
            wordIndex++;
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
    }*/

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

    public boolean addWordVertical(String word, int row, int col) {
      int wordIndex = 0;
      for (int i = col; i < col+1; i++) {
        for (int x = row; x < row+word.length(); x++) {
          if (data[x][i] == '_' || word.charAt(wordIndex) == data[x][i]) {
            data[x][i] = word.charAt(wordIndex);
            wordIndex++;
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
    }*/

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

    public boolean addWordDiagonal(String word, int row, int col) {
      int wordIndex = 0;
      int x = col;
      for (int i = row; i < row + word.length(); i++) {
        if (data[i][x] == '_' || word.charAt(wordIndex) == data[i][x]) {
          data[i][x] = word.charAt(wordIndex);
          wordIndex++;
        }
        else {
          while (row < i && col < x) {
            data[row][col] = '_';
            row++;
            col++;
          }
          return false;
        }
        x++;
      }
      return true;
    }*/


}
