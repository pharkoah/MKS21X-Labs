import java.util.Arrays;
public class tester {
  public static void main(String[] args) {
    //randomized values
    int[] arr = {9, 8, 7, 6, 1, 2, 4, 3, 10, 11};
    int[] arr2 = {0, 11, 13, 12, 19, 21, 20, 17, 14};
    System.out.println("before sort: " + Arrays.toString(arr));
    Sorts.bubbleSort(arr);
    System.out.println("after sort: " + Arrays.toString(arr));
    System.out.println("\nbefore sort: " + Arrays.toString(arr2));
    Sorts.bubbleSort(arr2);
    System.out.println("after sort: " + Arrays.toString(arr2));

    System.out.println(Sorts.bubbleCheck(arr));

    //checker and reversed values
    int[] rev = {99, 88, 77, 66, 55, 44, 33, 22, 11};
    int[] revc = {99, 88, 77, 66, 55, 44, 33, 22, 11};
    int[] revs = {99, 88, 77, 66, 55, 44, 33, 22, 11};
    System.out.println("\nbefore sort: " + Arrays.toString(rev));
    System.out.println("for rev: " + Sorts.bubbleCheck(rev));
    System.out.println("after sort: " + Arrays.toString(rev));

    //insertionSort rev values
    System.out.println("\nbefore sort: " + Arrays.toString(revc));
    Sorts.insertionSort(revc);
    System.out.println("after sort: " + Arrays.toString(revc));

    //selectionSort rev values test;
    System.out.println("\nbefore sort: " + Arrays.toString(revs));
    Sorts.selectionSort(revs);
    System.out.println("after sort: " + Arrays.toString(revs));
    //sorted values
    int[] sort = {1, 2, 3, 4, 5, 6};
    System.out.println("\nbefore sort: " + Arrays.toString(sort));
    Sorts.bubbleSort(sort);
    System.out.println("after sort: " + Arrays.toString(sort));

    //equal values
    int[] equal = {3, 3, 3, 3, 3, 3, 3};
    System.out.println("\nbefore sort: " + Arrays.toString(equal));
    Sorts.bubbleSort(equal);
    System.out.println("after sort: " + Arrays.toString(equal));

    //no values
    int[] no = {};
    System.out.println("\nbefore sort: " + Arrays.toString(no));
    Sorts.bubbleSort(no);
    System.out.println("after sort: " + Arrays.toString(no));

    //repeated values
    int[] repeat = {19, 15, 7, 8, 7, 3, 10, 21, 19, 19, 77, 3, 16, 49};
    int[] repeat2 = {19, 15, 7, 8, 7, 3, 10, 21, 19, 19, 77, 3, 16, 49};
    System.out.println("\nbefore sort: " + Arrays.toString(repeat));
    Sorts.bubbleSort(repeat);
    System.out.println("after sort: " + Arrays.toString(repeat));

    //insertionSort repeated values
    System.out.println("\nbefore sort: " + Arrays.toString(repeat2));
    Sorts.bubbleSort(repeat2);
    System.out.println("after sort: " + Arrays.toString(repeat2));
  }
}
