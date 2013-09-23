public class Playable extends Library {
   
   protected RunTime runTime;
   protected String importantPeople;
   
   public Playable(String title, Date date, String importantPeople, RunTime runTime) {
      super(title,date);
      this.importantPeople = importantPeople;
      this.runTime = runTime;
   }
   
   public RunTime getRunTime() {
      return runTime;
   }
   
   public String getImportantPeople() {
      return importantPeople;
   }
   
   public String toString() {
      return "toString";
   }
}