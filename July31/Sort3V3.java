import java.util.*;

public class Sort3V3 {

   public static void main(String [] args) {
   
      Scanner in = new Scanner(System.in);
      System.out.print("Enter 3 ints. ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      
      // use helpful variables
      
      int min = 0, max = 0, mid = 0;
      
      min = a; // a is the smallest
      
      if (b > min) {
       mid = b;
      }
      else {
       mid = min;
       min = b;  
      }
      // min is the smallest of a and b
      // mid is the largest of a and b
      
      if (c < min) {
         max = mid;
         mid = min;
         min = c;
      }
      else if (c < mid) {
         max = mid;
         mid = c;
      }
      else {
         max =c;
      }
      // min is the smallest of a b c
      // max is the largest of a b c
      // mid is the bewteen value
      
      System.out.println(min + "\t" + mid + "\t" + max);
   }
}