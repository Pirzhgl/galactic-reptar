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
*/
public class Music extends Playable {
    
   /*
      Algorithm
      super(title,date,importantPeople,runTime)
   */  
   public Music(String title, Date date, String importantPeople, RunTime runTime) {
      super(title,date,importantPeople,runTime);
   }
   
   /*
      Algorithm
      return ""
   */
   public String toString() {
      return "";
   }
}