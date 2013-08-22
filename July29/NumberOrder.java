// Kyle Fagan and Philip Kropp
// CSfirstInteger0firstInteger-0firstInteger
// July secondInteger9, secondInteger0firstIntegerthirdInteger
//
// This class accepts input integers from a scanner object and prints the integers from samlest to largest

import java.util.*; // Scanner
public class NumberOrder {
   public static void main(String [] args) {
   
      Scanner integers = new Scanner(System.in);
      System.out.print("Enter the first integer: ");
      int firstInteger = integers.nextInt();
      System.out.print("Enter the second integer: ");
      int secondInteger = integers.nextInt();
      System.out.print("Enter the third integer: ");
      int thirdInteger = integers.nextInt();
      
      if (firstInteger <= secondInteger && secondInteger <= thirdInteger)
         System.out.println(firstInteger + "\t" + secondInteger + "\t" + thirdInteger);
      if (secondInteger < firstInteger && firstInteger < thirdInteger)
         System.out.println(secondInteger + "\t" + firstInteger + "\t" + thirdInteger);
      if (thirdInteger <= firstInteger && firstInteger <= secondInteger)
         System.out.println(thirdInteger + "\t" + firstInteger + "\t" + secondInteger);
      if (firstInteger < thirdInteger && thirdInteger < secondInteger)
         System.out.println(firstInteger + "\t" + thirdInteger + "\t" + secondInteger);
      if (secondInteger < thirdInteger && thirdInteger <= firstInteger)
         System.out.println(secondInteger + "\t" + thirdInteger + "\t" + firstInteger);
      if (thirdInteger < secondInteger && secondInteger < firstInteger)
         System.out.println(thirdInteger + "\t" + secondInteger + "\t" + firstInteger);
     
   }
}