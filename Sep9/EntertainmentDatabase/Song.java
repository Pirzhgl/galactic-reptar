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
    album                String that holds the name of the song's album
*/
public class Song extends Music {
   
   protected String album ="";
   
   /*
      Algorithm
      super(title,date,artist,runTime)
      this.album <- album
   */
   public Song(Date date, String artist, String title, String album, RunTime runTime) {
      super(title, date, artist,runTime);
      this.album = album;
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
      return album
   */
   public String getAlbum() {
      return album;
   }
    
   /*
      Algorithm
      return "Title: " + getTitle() + " Artist: " + getImportantPeople() +
      " Album: " + getAlbum() + " Date: " + getDate() + " Run time: " +
      getRunTime()
   */
   public String toString() {
      return "Title: " +getTitle() + " Artist: " + getImportantPeople() + " Album: " + getAlbum() +
         " Date: " + getDate() + " Run Time: " + getRunTime();
   }
}