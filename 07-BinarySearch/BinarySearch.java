public class BinarySearch {
  /*Precondition: data is sorted (increasing order)
   *@param data: the numbers to search through
   *@param target: the number you want to find
   *@return the index of data that contains the target value. Return -1 if the value is not in the array.
   *If there are multiple copies return the one you find first using
   *(min+max)/2 method described.
   */
  public static int binarySearch(int[]data,int target){
    int middle = (data.length / 2);
    int start, end;
    int middleI = data[middle];
    if (middleI == target) {
      return middle;
    }
    if (middleI < target) {
      start = middle + 1;
      end = data.length - 1;
      middle = (end + start) / 2
    }
    return 0;
  }
}
