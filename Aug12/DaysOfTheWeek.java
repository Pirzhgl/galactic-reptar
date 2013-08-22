// Enumerate the days of the week
// Ask user to input two days as strings
// print the number of days in between
// for each of these two days print a message. Example Wednesday is something

// Kyle Fagan
// Phillip Kropp
import java.util.*;
public class DaysOfTheWeek{
   enum Days {
      Sunday,
      Monday,
      Tuesday,
      Wednesday,
      Thursday,
      Friday,
      Saturday     
   }
   
   public static void main(String [] args) {
   
      Days sun = Days.Sunday;
      Days mon = Days.Monday;
      Days tue = Days.Tuesday;
      Days wed = Days.Wednesday;
      Days thu = Days.Thursday;
      Days fri = Days.Friday;
      Days sat = Days.Saturday;
      
      
      
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter the first day of the week");
      Days firstDay = Days.valueOf(userInput.next());
      System.out.print("Enter the second day of the week");
      Days secondDay = Days.valueOf(userInput.next());
      
      System.out.println("Difference between days: " + Math.abs(firstDay.compareTo(secondDay)));
      
      switch (firstDay) {
         case Sunday: System.out.println("Sunday funday"); break;
         case Monday: System.out.println("Monday is also funday"); break;
         case Tuesday: System.out.println("Tuesday "); break;
         case Wednesday: System.out.println("Wednesday is funday"); break;
         case Thursday: System.out.println("Thursday is less than friday"); break;
         case Friday: System.out.println("Thank god its Friday"); break;
         case Saturday: System.out.println("Saturday caturday"); break;
      }
      
      switch(secondDay) {
         case Sunday: System.out.println("Sunday funday"); break;
         case Monday: System.out.println("Monday is also funday"); break;
         case Tuesday: System.out.println("Tuesday "); break;
         case Wednesday: System.out.println("Wednesday is funday"); break;
         case Thursday: System.out.println("Thursday is less than friday"); break;
         case Friday: System.out.println("Thank god its Friday"); break;
         case Saturday: System.out.println("Saturday caturday"); break;
      }
   }
}