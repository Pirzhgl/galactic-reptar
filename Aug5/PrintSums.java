public class PrintSums {
   public static void main(String [] args) {
      
      // print the sumes of odd integres as long as the sum is less than or equal to 999
      int n = 1;
      int sum = n;
      while (sum <= 999) {
         System.out.println(n + "\t" + sum);
         n++;
         sum = sum + 2*n-1;
      }
      
      
      
      
      
      
   }
}