import java.util.*;

public class WhileInput {
   public static void main(String [] args) {
      // write code to input integers from a user.
      // calculate the sum and average of the inputs.
      // stop whenever the input is 0 or smaller.
      
      // we use 0 as a sentinel value
      
      final int SENTINEL = 0;
      
      Scanner in = new Scanner(System.in);
      int sum = 0; // accumulator
      int count = 0;
      
      System.out.print("Enter value, 0 or smaller to stop ");
      int input = in.nextInt();
      
      while(input > SENTINEL) {
         sum = input + sum;
         count++;
         input = in.nextInt();
      }
      System.out.println("the sum is " + sum);
      double average = 0.0;
      if(count>0) {
         average = (double)sum/count;
         System.out.println("the average is " +average);
      }
      else {
         System.out.println("no values were input");
      }   
   }
}