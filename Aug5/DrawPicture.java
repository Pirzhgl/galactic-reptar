// Nested for loops
import java.util.*;

public class DrawPicture {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("How many rows? ");
      int rows = in.nextInt();
      
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
         }
         for ( int stars = 1; stars <= i; stars++) {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
}