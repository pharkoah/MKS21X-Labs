import java.util.Arrays;
public class tester {
  public static void main(String[] args) {
    int[] arr = {9, 8, 7, 6, 1, 2, 4, 3, 10, 11};
    int[] arr2 = {0, 11, 13, 12, 19, 21, 20, 17, 14};
    System.out.println("before sort: " + Arrays.toString(arr));
    Sorts.bubbleSort(arr);
    System.out.println("after sort: " + Arrays.toString(arr));
    System.out.println("\nbefore sort: " + Arrays.toString(arr2));
    Sorts.bubbleSort(arr2);
    System.out.println("after sort: " + Arrays.toString(arr2));
    int[] rev = {99, 88, 77, 66, 55, 44, 33, 22, 11};
    System.out.println("\nfor rev: " + Sorts.bubbleCheck(rev));

    int[] sort = {1, 2, 3, 4, 5, 6};
    System.out.println("\nbefore sort: " + Arrays.toString(sort));
    Sorts.bubbleSort(sort);
    System.out.println("after sort: " + Arrays.toString(sort));
  }
}
