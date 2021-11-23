import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
  public static void main(String[] args) {
      int TriC = 0;
      try {
          File file = new File("data.txt");
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
              String line = input.nextLine();
              Scanner line2 = new Scanner(line);
              int a = line2.nextInt();
              int b = line2.nextInt();
              int c = line2.nextInt();
              if ( (a + b > c) && (b + c > a) && (a + c > b) ) {
                TriC++;
              }
          }
          input.close();

      } catch (FileNotFoundException ex) {
          System.out.println("no valid file here");
      }
      System.out.println(TriC);
  }
}
