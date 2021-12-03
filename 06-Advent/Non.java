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
          char now;
          char past = '.';
          for (int i = 0; i < line.length(); i++) {
            now = line.charAt(i);
            if (now == ('a') || now == ('e') || now == ('i') || now == ('o') || now == ('u')) {
              vowelC++;
            }
            if (now == past) {
              repeat = true;
            }
            if (past == 'a' && now == 'b' || past == 'c' && now == 'd' || past == 'x' && now == 'q' || past == 'x' && now == 'y') {
              contain = true;
            }
            past = now;
          }
          /*for (int j = 2; j < line.length(); j++) {
            if ( (line.substring(j-2, j) == "ab") || (line.substring(j-2, j) == "cd") || (line.substring(j-2, j) == "pq") || (line.substring(j-2, j) == "xy") ) {
              contain = true;
            }
          }*/
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
    if (Integer.parseInt(args[1]) == 2) {
      try {
        File file = new File(args[0]);
        Scanner input = new Scanner(file);
        boolean overlapping = true;
        boolean between = false;
        int nice = 0;
        while (input.hasNextLine()) {
          String line = input.nextLine();
          char now, future, past;
          String[] arr = new String[line.length()];
          int j = 0;
          for (int i = 1; i < line.length()-1; i++) {
            now = line.charAt(i);
            past = line.charAt(i-1);
            future = line.charAt(i+1);
            if (past == future) {
              between = true;
            }
          }
          if (line.length() % 2 == 0){
            for (int l = 0; l < line.length()-1; l+=2) {
              arr[j] = line.substring(l, l+2);
              j++;
              //l++;
            }
          } else {
            for (int h = 0; h < line.length()-1; h++) {
              arr[j] = line.substring(h, h+2);
              j++;
              //l++;
            }
          }
          System.out.println(Arrays.toString(arr));
          for (int x = 0; x < arr.length-1; x++) {
            if (arr[x+1] == null) {
              x = arr.length-1;
            }
            for (int k = x; x < arr.length-1; k++) {
              if (arr[x] == arr[k]) {
                overlapping = false;
              }
              if (overlapping == false) {
                x = arr.length-1;
              }
            }
          }
          if (overlapping == false) {
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
