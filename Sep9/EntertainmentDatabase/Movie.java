public class Movie extends Playable {
   
   protected String studio;
   
   public Movie(Date date, String studio, String title, String stars, RunTime runTime) {
      super(title,date,stars,runTime);
   }
   
   public String getStudio() {
      return studio;
   }
   
   public String toString() {
      return "toString";
   }
}