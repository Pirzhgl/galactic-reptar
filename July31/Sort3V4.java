import java.util.*;

public class Sort3V4 {

   public static void main(String [] args) {
   
      Scanner in = new Scanner(System.in);
      System.out.print("Enter 3 ints. ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      
      // Take the minimum value
      System.out.print(Math.min(a, Math.min(b,c)));
      System.out.print("\t" + (a + b + c - Math.min(a, Math.min(b,c)) - Math.max(a, Math.max(b,c))));
      System.out.print("\t" + Math.max(a, Math.max(b,c)));

      
      
   }
}