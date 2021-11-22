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
              String[] line2 = line.split(" ");
              int a = Integer.parseInt(line2[0]);
              int b = Integer.parseInt(line2[1]);
              int c = Integer.parseInt(line2[2]);
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
