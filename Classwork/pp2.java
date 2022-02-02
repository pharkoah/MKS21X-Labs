public class pp2{
  public static boolean equalIsNot(String str) {
    int isC = 0;
    int notC = 0;
    for (int i = 1; i < str.length()-1; i++) {
      if (str.substring(i-1, i+1) == "is") {
        isC+=1;
      }}
  for (int x = 1; x < str.length()-1; x++) {
      if (str.substring(x-1, x+2) == "not") {
        notC+=1;
      }
    }return (isC == notC);

  }

 public static void main(String[] args) {
    System.out.println(equalIsNot("This is not ")); //test case
    System.out.println(equalIsNot("This is notnot")); //test case
    System.out.println(equalIsNot("noisxxnotyynotxisi")); //test case
    System.out.println(equalIsNot("isnot is not this is notnot a string")); //test case
    System.out.println(equalIsNot("misusing my help is not an option??")); //test case
  }

}
