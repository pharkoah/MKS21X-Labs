import java.util.Arrays;
public class tester {
  public static void main(String[] args) {
    int[] arr = {9, 8, 7, 6, 1, 2, 4, 3, 10, 11};
    int[] arr2 = {0, 11, 13, 12, 19, 21, 20, 17, 14};
    System.out.println("before sort: " + arr);
    Sorts.bubbleSort(arr);
    System.out.println("after sort: " + arr);
  }
}
