import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  private int seed;


  public static void main(String[] args) {
    WordSearch main;
    int row = Integer.parseInt(args[0]);
    int col = Integer.parseInt(args[1]);
    String fileName = args[2];
    int mode = Integer.parseInt(args[3]);
    if (args.length == 5) {
      int seed = Integer.parseInt(args[4]);
      main = new WordSearch(row, col, fileName, mode, seed);
    } else {
      main = new WordSearch(row, col, fileName, mode);
    }
    main.addAllWords(fileName);
    if (mode == 0) {
      main.fillInRandomLetters();
    }
    System.out.println(main.toString());
  }

  //assume a rectangular grid
  private void addAllWords(String fileName){
    ArrayList<String> wordsToAdd = loadWordsFromFile(fileName);
    //You are writing this
    boolean word = false;
    for (int i = 0; i < wordsToAdd.size(); i++) {
      int index = rng.nextInt(wordsToAdd.size());
      String res = wordsToAdd.get(index);
      for (int x = 0; word == true && x < 100; x++) {
        int row = rng.nextInt(grid.length);
        int col = rng.nextInt(grid[0].length);
        int incR = rng.nextInt(3) - 1;
        int incC = rng.nextInt(3) - 1;
        if (addWord(res, rng.nextInt(grid.length), rng.nextInt(grid[0].length), rng.nextInt(3) - 1, rng.nextInt(3) - 1) == true) {
          word = true;
          wordsAdded.add(res);
        }
      }
    }
  }

  private void fillInRandomLetters() {
    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[r].length; c++) {
        if (grid[r][c] == '_') {
          grid[r][c] = (char) (rng.nextInt(26) + 'A');
        }
      }
    }
  }

  public WordSearch(int rows,int cols, String fileName, int mode){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int mode, int s){
    seed = s;
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c] = '_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString() {
    String res = "";
    for (int i = 0; i < grid.length; i++) {
      for (int x = 0; x < grid[i].length; x++) {
        res += grid[i][x] + " ";
      }
      res += "\n";
    }
    res += "Words: ";
    for (int x = 0; x < wordsAdded.size(); x++) {
      res += wordsAdded.get(x) + " ";
    }
    res += "\nSeed: " + seed;
    return res;
  }

}
