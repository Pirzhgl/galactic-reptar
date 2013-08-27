public class ArrayStuf2 {
   public static void main(String [] args) {
      double [] d = new double[20];
      // put values in the array then print the array
      
      // template to look at all array elements
      // in index order
      
      double oneHalf = 0.5;
      d[0] = 1;
      for (int i = 1; i < d.length; i++) {
         d[i] = d[i-1] * oneHalf;
      }
      for (int i = 0; i < d.length; i++) { // template
         System.out.println(d[i]);
      }
   }
}