public class array{
   public static void main(String[]args){
        int[] anArray;
        anArray = new int[10];
        System.out.println("part 1:");
        for (int i = 0; i < anArray.length; i++) {
          anArray[i] = 100 + (i*10);
        }
        System.out.println("part 2:");
        String res = "";
        for (int j = 0; j < anArray.length; j++) {
          res += anArray[j];
        }
        System.out.println(res);
   }
}
