/*
   Kyle Fagan
   CS101-01
   Final Project
   Due September 26, 2013
   An entertainment database that sorts various media.
*/
/*
             Data Table
             ==========
    Variable             Purpose
    hours                String that holds hours
    mintues              String that holds minutes
    seconds              String that holds seconds
*/
import java.util.*;
public class RunTime {
   
   private String hours;
   private String minutes;
   private String seconds;
   
   public RunTime() {
      
   }
   
   /*
      Algorithm
      this.hours <- hours
      this.minutes <- minutes
      this.seconds <- seconds
   */
   public RunTime(String hours, String minutes, String seconds) {
      this.hours = hours;
      this.minutes = minutes;
      this.seconds = seconds;
   }
   
   /*
      Algorithm
      return hours
   */
   public String getHours() {
      return hours;
   }
   
   /*
      Algorithm
      return minutes
   */
   public String getMinutes() {
      return minutes;
   }
   /*
      Algorithm
      return seconds
   */
   public String getSeconds() {
      return seconds;
   }
   /*
      int returnValue <- 0
      String firstHourString <- getHours()
      String secondHourString <- anotherRunTime.getHours()
      Scanner hourScanenrFirst <- new Scanner(firstHourString)
      Scanner hourScannerSecond <- new Scanner(secondHourString)
      int hours1 <- hourScannerFirst.nextInt()
      int hours2 <- hourScannerSecond.nextInt()
      if(hours1>hours2)
         returnValue <- 1
      else if(hours1<hours2)
         returnValue <- -1
      else if(hours1 == hours2)
         String firstMinuteString <- getMinutes()
         String secondMinuteString <- anotherRunTime.getMinutes()
         Scanner minuteScannerFirst <- new Scanner(firstMinuteString)
         Scanner minuteScannerSecond <- new Scanner(secondMinuteString)
         int minutes1 <- minuteScannerFirst.nextInt()
         int minutes2 <- minuteScannerSecond.nextInt()
         if(minutes1 > minutes2)
            returnValue <- 1
         else if(minutes1<minutes2)
            returnValue <- -1
         else if(minutes1==minutes2)
            String firstSecondString <- getSeconds()
            String secondSecondString <- anotherRunTime.getSeconds()
            Scanner firstSecondScanner <- new Scanner(firstSecondString)
            Scanner secondSecondScanner <- new Scanenr(secondSecondString)
            int seconds1 <- firstSecondScanner.nextInt()
            int seconds2 <- secondSecondScanner.nextInt()
            if(seconds1>seconds2)
               retunValue <- 1
            else if(seconds1<seconds2)
               returnValue <- -1
      return returnValue
   */
   public int compareTo(RunTime anotherRunTime){
      int returnValue = 0;
      String firstHourString = getHours();
      String secondHourString = anotherRunTime.getHours();
      Scanner hourScannerFirst = new Scanner(firstHourString);
      Scanner hourScannerSecond = new Scanner(secondHourString);
      int hours1 = hourScannerFirst.nextInt();
      int hours2 = hourScannerSecond.nextInt();
      if(hours1 > hours2) {
         returnValue = 1;
      }
      else if(hours1 < hours2) {
         returnValue = -1;
      }
      else if(hours1 == hours2) {
         String firstMinuteString = getMinutes();
         String secondMinuteString = anotherRunTime.getMinutes();
         Scanner minuteScannerFirst = new Scanner(firstMinuteString);
         Scanner minuteScannerSecond = new Scanner(secondMinuteString);
         int minutes1 = minuteScannerFirst.nextInt();
         int minutes2 = minuteScannerSecond.nextInt();
         if(minutes1 > minutes2) {
            returnValue = 1;
         }
         else if(minutes1 < minutes2) {
            returnValue = -1;
         } 
         else if(minutes1 == minutes2) {
            String firstSecondString = getSeconds();
            String secondSecondString = anotherRunTime.getSeconds();
            Scanner firstSecondScanner = new Scanner(firstSecondString);
            Scanner secondSecondScanner = new Scanner(secondSecondString);
            int seconds1 = firstSecondScanner.nextInt();
            int seconds2 = secondSecondScanner.nextInt();
            if(seconds1 > seconds2) {
               returnValue = 1;
            }
            else if(seconds1 < seconds2) {
               returnValue = -1;
            }
         }
         
      }
      return returnValue;
   }
   
   /*
      Algorithm
      return hours + ":' + minutes + ":" + seconds
   */
   public String toString() {
      return hours + ":" + minutes + ":" + seconds;
   }
}