public class RecursionMakeWords {
  public static void makeWords(int n, String str) {
    if (n > 0) {
      for (char c = 'a'; c <= 'z'; c++) {
        System.out.print(c);
      }
    }
  }

  public static void main(String[] args) {
      makeWords(3,"")
  }
}
