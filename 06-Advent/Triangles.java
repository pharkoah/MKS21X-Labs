import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
  public static void main(String[] args) {
    if (args[1] == 1) {
      int TriC = 0;
      try {
          File file = new File(args[0]);
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
          }return(TriC);
          input.close();

      } catch (FileNotFoundException ex) {
          System.out.println("no valid file here");
      }
    }

//part 2
    if (args[1] == 2) {
      int TriC2 = 0;
      try {

          File file = new File(args[0]);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
              String line01 = input.nextLine();
              Scanner line02 = new Scanner(line01);
              String line03 = input.nextLine();
              Scanner line04 = new Scanner(line03);
              String line05 = input.nextLine();
              Scanner line06 = new Scanner(line05);
              //String[] sp = line.split(" ");
              //int a = Integer.parseInt(sp[0]);
              int a = line02.nextInt();
              int b = line02.nextInt();
              int c = line02.nextInt();
              int d = line04.nextInt();
              int e = line04.nextInt();
              int f = line04.nextInt();
              int g = line06.nextInt();
              int h = line06.nextInt();
              int i = line06.nextInt();
              if ( (a + d > g) && (g + d > a) && (a + g > d) ) {
                TriC2++;
                //System.out.println(a);
              }
              if ( (b + e > h) && (e + h > b) && (b + h > e) ) {
                TriC2++;
                //System.out.println(a);
              }
              if ( (c + f > i) && (i + f > c) && (c + i > f) ) {
                TriC2++;
                //System.out.println(a);
              }
          }return TriC2;
          input.close();

      } catch (FileNotFoundException ex) {
          System.out.println("no valid file here");
      }

    }
  }
}
