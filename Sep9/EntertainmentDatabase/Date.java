public class Date {
   private String day = "";
   private String month = "";
   private String year = "";
   
   public Date() {
      
   }
   
   public Date(String day, String month, String year) {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public String getDay() {
      return day;
   }
   
   public String getMonth() {
      return month;
   }
   
   public String getYear() {
      return year;
   }
   
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
         }
         
      }
      return returnValue;

   }
   public String toString() {
      return day + "/" + month + "/" + year;
   }
}