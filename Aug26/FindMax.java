// Kyle Fagan
// Phillip Kropp

public class FindMax {
   public static void main(String [] args) {
      final int ARRAY_SIZE = 10;
      int [] a = new int [ARRAY_SIZE];
      for ( int i = 0; i < a.length; i++) {
         a[i] = (int)(Math.random() * 100) + 1; // gives values between zero and 100
      }
      // write the code to find the maximum value and the index of that maximum
      // value in the array
      int max = 0;
      int index = 0;
      for (int i = 0; i < a.length; i++) {
         if ( a[i] > max ) {
            max = a[i];
            index = i;
         }
      }
         
      }
      System.out.println(max);
   }
}