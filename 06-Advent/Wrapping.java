import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class cringe {
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
              int a = Integer.parseInt(sp[0]);
              int b = Integer.parseInt(sp[1]);
              int c = Integer.parseInt(sp[2]);
              wrap += (2 * ((a * b) + (b * c) + (c * a)));// + (a * b);
              int[] wrarr = {a * b, b * c, c * a};
              /*if (sa < sc && sa < sb) {
                wrap += sa;
              }
              if (sb < sa && sb < sc) {
                wrap += sb;
              }
              if (sc < sa && sc < sb) {
                wrap += sc;
              }*/
              Arrays.sort(wrarr);
              wrap += wrarr[0];
              System.out.println(wrap);
          }System.out.println(wrap);
          input.close();

      } catch (FileNotFoundException ex) {
          System.out.println("no valid file here");
      }
  }
}
