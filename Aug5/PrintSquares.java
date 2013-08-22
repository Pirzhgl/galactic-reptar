public class PrintSquares {
   public static void main(String [] args) {
      
      int n = 1;
      int square = n*n;
      while(square <= 999) {
         System.out.println(n + "\t" + square);
         n++;
         square = n*n;
      }
      System.out.println(n);
      
      
      
      
      
   }
}