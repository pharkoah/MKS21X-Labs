import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping {
  public static void main(String[] args) {
      int wrap = 0;
      try {
          File file = new File(args[0]);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
              String line = input.nextLine();
              //Scanner line2 = new Scanner(line);
              //int a = line2.nextInt();
              //int b = line2.nextInt();
              //int c = line2.nextInt();
              String[] sp = line.split("x");
              int l = Integer.parseInt(sp[0]);
              int w = Integer.parseInt(sp[1]);
              int h = Integer.parseInt(sp[2]);
              wrap += ( (2 * l * w) + (2 * w * h) + (2 * h * l) );
              if (l < h && w < h) {
                wrap += l * w;
              }
              if (w < l && h < l) {
                wrap += w * h;
              }
              if (h < w && l < w) {
                wrap += h * l;
              }
          }System.out.println(wrap);
          input.close();

      } catch (FileNotFoundException ex) {
          System.out.println("no valid file here");
      }
  }
}
