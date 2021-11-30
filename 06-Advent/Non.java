import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
public class Non {
  public static void main(String[] args) {
    if (Integer.parseInt(args[1]) == 1) {
      try {
        File file = new File(args[0]);
        Scanner input = new Scanner(file);
        int vowelC = 0;
        boolean repeat = false;
        boolean contain = false;
        int nice = 0;
        while (input.hasNextLine()) {
          String line = input.nextLine();
          String[] sp = line.split("");
          for (int i = 0; i < line.length()-1; i++) {
            if ((sp[i]).equals("a") || (sp[i]).equals("e") || (sp[i]).equals("i") || (sp[i]).equals("o") || (sp[i]).equals("u")) {
              vowelC++;
            }
            if (sp[i].equals(sp[i+1])) {
              repeat = true;
            }
          }
          for (int j = 2; j < line.length()-1; j++) {
            if ( (line.substring(j-2, j) == "ab") || (line.substring(j-2, j) == "cd") || (line.substring(j-2, j) == "pq") || (line.substring(j-2, j) == "xy") ) {
              contain = true;
            }
          }
          if (vowelC >= 3 && repeat == true && contain == false) {
            nice++;
          }
        }
        System.out.println(nice);
        input.close();
    }
      catch (FileNotFoundException ex) {
          System.out.println("no valid file here");
      }
    }
  }
}
