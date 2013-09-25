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
    day                  String to hold the two didgit day
    month                String to hold the two digit month
    year                 String to hold the four digit year
*/
public class Date {
   private String day = "";
   private String month = "";
   private String year = "";
   
   public Date() {
      
   }
   
   /*
      this.day <- day
      this.month <- month
      this.year <- year
   */
   public Date(String day, String month, String year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   /*
      Algorithm
      return day
   */
   public String getDay() {
      return day;
   }
   
   /*
      Algorithm
      return month
   */
   public String getMonth() {
      return month;
   }
   
   /*
      Algorithm
      return year
   */
   public String getYear() {
      return year;
   }
   
   /*
      int returnValue <- 0
      String year1 <- getYear()
      String year2 <- anotherDate.getYear()
      if(year1.compareTo(year2) > 0)
         returnValue <- 1
      else if(year1.compareTo(year2) < 0)
         returnValue <- -1
      else if(year1.compareTo(year2) == 0)
         String month1 <- getMonth()
         String month2 <- anotherDate.getMonth()
         if(month1.compareTo(month2) > 0)
            returnValue <- 1
         else if(month1.compareTo(month20 < 0)
            returnValue <- -1
         else if(month1.compareTo(month2) == 0)
            String day1 <- getDay()
            String day2 <- anotherDate.getDay()
            if(day1.compareTo(day2) > 0)
               returnValue <- 1
            else if(day1.compareTo(day2) < 0)
               returnValue <- -1
            else if(day1.compareTo(day2) == 0)
               returnValue <- 0
      return returnValue
   */
   public int compareTo(Date anotherDate) {
      int returnValue = 0;
      String year1 = getYear();
      String year2 = anotherDate.getYear();
      if(year1.compareTo(year2) > 0) {
         returnValue = 1;
      }
      else if(year1.compareTo(year2) < 0) {
         returnValue = -1;
      }
      else if(year1.compareTo(year2) == 0) {
         String month1 = getMonth();
         String month2 = anotherDate.getMonth();
         if(month1.compareTo(month2) > 0) {
            returnValue = 1;
         }
         else if(month1.compareTo(month2) < 0) {
            returnValue = -1;
         } 
         else if(month1.compareTo(month2) == 0) {
            String day1 = getDay();
            String day2 = anotherDate.getDay();
            if(day1.compareTo(day2) > 0) {
               returnValue = 1;
            }
            else if(day1.compareTo(day2) < 0) {
               returnValue = -1;
            }
            else if(day1.compareTo(day2) == 0) {
               returnValue = 0;
            }
         }
         
      }
      return returnValue;

   }
   
   /*
      Algorithm
      return month + "/" + day + "/" + year
   */
   public String toString() {
      return month + "/" + day + "/" + year;
   }
}