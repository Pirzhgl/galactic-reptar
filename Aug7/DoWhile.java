import java.util.*;
public class DoWhile {
   public static void main(String [] args) {
      
      // ask the user if s/he wants to continue
      // read response, if the response begins with y or n, exit the asking loop
      // otherwise, ask the user again and again.
      
      Scanner in = new Scanner(System.in);
      char answer = 'm';
      do {
         System.out.println("Do you want to continue? (y/n)");
         String response = in.nextLine().toLowerCase();
         System.out.println("in loop, answer == " + answer);
      }
      while (answer != 'n' || answer != 'y');
   }
}