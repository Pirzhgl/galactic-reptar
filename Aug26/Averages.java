import java.util.*;
public class Averages {
   public static void main(String [] args) {
      // write code to input 5 numbers, print the average of those numbers
      // and print the difference of each number with the average
      // (number - average)
      
      Scanner in = new Scanner(System.in);
      int [] a = new int [5];
      for(int i = 0;i < a.length; i++) {
         System.out.print("enter number: ");
         a[i] = in.nextInt();
      }
      // find the average. first find the sum
      int sum = 0;
      for(int i = 0;i < a.length; i++) {
         sum += a[i];
      }
      double avg = 1.0 * sum / a.length;
      System.out.println("average: " + avg);
      for(int i = 0;i < a.length; i++) {
         System.out.println("number - average: " + (a[i] - avg));
      }

   }
}