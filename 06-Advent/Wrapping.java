import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class Wrapping {
  public static void main(String[] args) {
      int wrap = 0;
      if (Integer.parseInt(args[1]) == 1) {
        try {
          File file = new File(args[0]);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] sp = line.split("x");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            int c = Integer.parseInt(sp[2]);
            wrap += (2 * ((a * b) + (b * c) + (c * a)));// + (a * b);
            int[] wrarr = {a * b, b * c, c * a};
            Arrays.sort(wrarr);
            wrap += wrarr[0];
          }System.out.println(wrap);
          input.close();
        }catch (FileNotFoundException ex) {
            System.out.println("no valid file here");
        }
      }

      if (Integer.parseInt(args[1]) == 2) {
        try {
          File file = new File(args[0]);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] sp = line.split("x");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            int c = Integer.parseInt(sp[2]);
            wrap += (a*b*c);
            int[] wrarr = {2*a + 2*b, 2*b + 2*c, 2*c + 2*a};
            Arrays.sort(wrarr);
            wrap += wrarr[0];
          }System.out.println(wrap);
          input.close();
        }catch (FileNotFoundException ex) {
            System.out.println("no valid file here");
        }
      }
  }
}
