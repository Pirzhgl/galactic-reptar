public class RunTime {
   
   private String hours;
   private String minutes;
   private String seconds;
   
   public RunTime() {
      
   }
   
   public RunTime(String hours, String minutes, String seconds) {
      this.hours = hours;
      this.minutes = minutes;
      this.seconds = seconds;
   }
   
   public String getHours() {
      return hours;
   }
   
   public String getMinutes() {
      return minutes;
   }
   
   public String getSeconds() {
      return seconds;
   }
   
   public int compareTo(RunTime anotherRunTime){
      int returnValue = 0;
      String hours1 = getHours();
      String hours2 = anotherRunTime.getHours();
      if(hours1.compareTo(hours2) > 0) {
         returnValue = 1;
      }
      else if(hours1.compareTo(hours2) < 0) {
         returnValue = -1;
      }
      else if(hours1.compareTo(hours2) == 0) {
         String minutes1 = getMinutes();
         String minutes2 = anotherRunTime.getMinutes();
         if(minutes1.compareTo(minutes2) > 0) {
            returnValue = 1;
         }
         else if(minutes1.compareTo(minutes2) < 0) {
            returnValue = -1;
         } 
         else if(minutes1.compareTo(minutes2) == 0) {
            String seconds1 = getSeconds();
            String seconds2 = anotherRunTime.getSeconds();
            if(seconds1.compareTo(minutes2) > 0) {
               returnValue = 1;
            }
            else if(seconds1.compareTo(minutes2) < 0) {
               returnValue = -1;
            }
         }
         
      }
      return returnValue;
   }
   
   public String toString() {
      return "The run time is " + hours + ":" + minutes + ":" + seconds;
   }
}