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
    title                String that stores the title of the
                          Library object
    date                 Date object that stores the date
*/
public abstract class Library {
   
   protected String title;
   protected Date date;

   /*
      Algorithm
      this.title <- title
      this.date <- date
   */
   public Library(String title, Date date) {
      this.title = title;
      this.date = date;
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
      return date
   */
   public Date getDate() {
      return date;
   }
   
   /*
      Algorithm
      return "nope"
   */
   public String toString() {
      return "Nope";
   }
   
   /*
      Algorithm
      return ""
   */
   public String getISBN() {
      return "";
   }
   
   /*
      Algorithm
      return ""
   */
   public String getAlbum() {
      return "";
   }
   
   /*
      Algorithm
      return -1
   */
   public int getNumberOfTracks() {
      return -1;
   }
   
   /*
      Algorithm
      RunTime runTime
      return runTime <- new RunTime("0", "0", "0")
   */
   public RunTime getRunTime() {
      RunTime runTime;
      return runTime = new RunTime("0", "0", "0");
   }
}