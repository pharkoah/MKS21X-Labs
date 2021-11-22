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
              int a = Integer.parseInt(input.nextInt());
              int b = Integer.parseInt(input.nextInt());
              int c = Integer.parseInt(input.nextInt());
              if (a + b > c) {
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
