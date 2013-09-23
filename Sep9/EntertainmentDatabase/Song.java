public class Song extends Music {
   
   protecteds String album ="";
   
   public Song(Date date, String artist, String title, String album, RunTime runTime) {
      super(title, date, artist,runTime);
   }
   
   public String getAlbum() {
      return album;
   }
    
   public String toString() {
      return "toString";
   }
}