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
    runTime              RunTime object that stores the run time of
                          playable objects
    importantPeople      String that stores the artist or stars of important media
*/
public class Playable extends Library {
   
   protected RunTime runTime;
   protected String importantPeople;
   
   /*
      Algorithm
      super(title,date)
      this.importantPeople <- importantPeople
      this.runTime <- runTime
   */
   public Playable(String title, Date date, String importantPeople, RunTime runTime) {
      super(title,date);
      this.importantPeople = importantPeople;
      this.runTime = runTime;
   }
   
   /*
      Algorithm
      return runTime
   */
   public RunTime getRunTime() {
      return runTime;
   }
   
   /*
      Algorithm
      return importantPeople
   */
   public String getImportantPeople() {
      return importantPeople;
   }
   
   /*
      Algorithm
      return "toString"
   */
   public String toString() {
      return "toString";
   }
}