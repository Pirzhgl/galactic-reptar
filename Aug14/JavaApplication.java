import java.util.*;
public class JavaApplication {
   public static void main(String [] args){
   Scanner userInput = new Scanner(System.in);
   System.out.print("Enter an integer value");
   int integer = userInput.nextInt();
   System.out.print("Enter a double");
   double doubleValue = userInput.nextDouble();
   System.out.print("Enter a string");
   String string = userInput.next();
   if(integer == 0) {
      System.out.println(string);
   }
   else if (integer > 0) {
      System.out.println(integer);
   }
   else if (integer < 0) {
      System.out.println(doubleValue);
   }
   }
}