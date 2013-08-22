import java.util.*;

public class Sort3 {

   public static void main(String [] args) {
   
      Scanner in = new Scanner(System.in);
      System.out.print("Enter 3 ints. ");
      int a = in.nextInt();
      int b = in.nextInt();
      int c = in.nextInt();
      
      // either a is smallest or c is smallest
      if (a <= b){
         // a is the smallest
         if (a <= c) {
            // b is middle, c is largest
            if (b <= c) {
               System.out.println(a + "\t" + b + "\t" + c);
            }
            // c is middle, b is largest
            else {
               System.out.println(a + "\t" + c + "\t" + b);
            }
        }
        // c is smallest
        else {
         System.out.println(a + "\t" + c + "\t" + b);
        }
      } // if (a <= b)
      // a is bigger than b
      else  {
         // b is smallest
         if (b <= c) {
            // order is b a c
            if (a <= c) {
               System.out.println(b + "\t" + a + "\t" + c);
            }
            // order is b c a
            else {
               System.out.println(b + "\t" + c + "\t" + a);

            }
         }
         // order is c b a
         else {
            System.out.println(c + "\t" + b + "\t" + a);

         }     
      }
      
   }
}