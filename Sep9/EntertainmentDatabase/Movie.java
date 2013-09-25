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
    studio               String that holds the studio that produced the movie
*/
public class Movie extends Playable {
   
   protected String studio;
   
   /* 
      Algorithm
      super(title,date,stars,runTime)
      this.studio <- studio
   */
   public Movie(Date date, String studio, String title, String stars, RunTime runTime) {
      super(title,date,stars,runTime);
      this.studio = studio;
   }
   
   /*
      Algorithm
      return title
   */
   public String getTitle() {
      return title;
   }
   /*
      Algorithm
      return studio
   */
   public String getStudio() {
      return studio;
   }
   
   /*
      Algorithm
      return "Title: " + getTitle() + " Studio: " + getStudio() + " Starring: " + get ImportantPeople()
      + " Date: " + getDate() + " RunTime: " + getRunTime()
   */
   public String toString() {
      return "Title: " +getTitle() + " Studio: " + getStudio() + " Starring: " + getImportantPeople() +
             " Date: " + getDate() + " Run Time: " + getRunTime();
   }
}