import java.util.*;

public class Sort3V2 {

   public static void main(String [] args) {
   
      Scanner in = new Scanner(System.in);
      System.out.print("Enter 3 ints. ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      
      // print a, b, c from smallest to largest
      if (a <= b && b<=c) {
         System.out.println(a + "\t" + b + "\t" + c);
      }
      else if (a <= c && c <= b) {
         System.out.println(a + "\t" + c + "\t" + b);
      }
      else if (b <= a && a <= c) {
         System.out.println(b + "\t" + a + "\t" + c);
      }
      else if (b <= c && c <= a) {
         System.out.println(b + "\t" + c + "\t" + a);
      }
      else if (c <= a && a <= b) {
         System.out.println(c + "\t" + a + "\t" + b);
      }
      else if (c <= b && b <= a) {
         System.out.println(c + "\t" + b + "\t" + a);
      }
   }
}