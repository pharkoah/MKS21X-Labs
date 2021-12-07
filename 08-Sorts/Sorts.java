import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int save;
    for (int i = 0; i < data.length-1; i++) {
      if (data[i] > data[i+1]) {
        save = data[i+1];
        data[i+1] = data[i];
        data[i] = save;
        i = 0;
      }
    }
    for (int j = 0; j < data.length-1; j++) {   //checker to make sure the first loop didnt make any mistakes
      if (data[j] > data[j+1]) {
        save = data[j+1];
        data[j+1] = data[j];
        data[j] = save;
        j = 0;
      }
    }
  }

  public static String bubbleCheck(int[] arr) {
    int[] arr2 = arr;
    int check = 0;
    Arrays.sort(arr2);
    Sorts.bubbleSort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == arr2[i]) {
        check++;
      }
    }
    if (check == arr.length) {
      return ("sort and bubbleSort work the same way");
    }
    else {
      return ("sort and bubbleSort do NOT work the same way");
    }
  }

  public static void selectionSort(int [] ary) {
    int save = ary[0];
    int saveI = 0;
    for (int i = 0; i < ary.length; i++) {
      for (int j = 1; j < ary.length; j++) {
        if (ary[i] > ary[j] ) {
          save = ary[j];
          saveI = j;
        }
        //if (saveI != 0 && save > ary[j]) {
          //save = ary[j];
          //saveI = j;
        //}
      }
      ary[saveI] = ary[i];
      ary[i] = save;
      System.out.println(Arrays.toString(ary));
    }
  }

  public static void insertionSort(int[] data) {
    int save;
    for (int x = 0; x < data.length; x++) {
      for (int i = 1; i < data.length; i++) {
        if (data[i] < data[i-1]) {
          for (int j = 0; j < i; j++) {
            if (data[i] < data[j]) {
              save = data[i-1];
              data[i-1] = data[i];
              data[i] = save;
            }
          }
        }
      }
    }
  }

}
