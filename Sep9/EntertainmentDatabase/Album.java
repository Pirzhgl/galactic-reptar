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
    numberOfTracks       holds the number of tracks in an album
*/
public class Album extends Music {
   
   protected int numberOfTracks;
   
   /*
      Algorithm
      super(title,date,artist,runTime)
      this.numberOfTracks <- numberOfTracks;
   */ 
   public Album(Date date, String artist, String title, int numberOfTracks, RunTime runTime) {
      super(title,date,artist,runTime);
      this.numberOfTracks = numberOfTracks;
   }
   
   /*
      Algorithm
      return title;
   */
   public String getTitle() {
      return title;
   }
   
   /*
      Algorithm
      return numberOfTracks
   */
   public int getNumberOfTracks() {
      return numberOfTracks;
   }
   
   /*
      return "Title: " + getTitle() + " Artist: " + getImportantPeople() + " Date: " + getDate()
             + " Number of Tracks: " + getNumberOfTracks() + " Run Time: " + " " + getRunTime()
   */
   public String toString() {
      return "Title: " + getTitle() + " Artist: " + getImportantPeople() + " Date: " + getDate()
             + " Number of Tracks: " + getNumberOfTracks() + " Run Time: " + " " + getRunTime();
   }
}