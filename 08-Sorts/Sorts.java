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
}
