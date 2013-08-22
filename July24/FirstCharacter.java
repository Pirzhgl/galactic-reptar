// Phillip Kropp
// Kyle Fagan
// CS-101-01
// July 24, 2013

import java.util.*;
public class FirstCharacter {
   public static void main(String [] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Type what you want and I will amaze you: ");
      String firstCharacter = s.next();
      System.out.println(firstCharacter.charAt(0));
   }
}