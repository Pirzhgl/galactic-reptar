public class Album extends Music {
   
   protected int numberOfTracks;
   
   public Album(Date date, String artist, String title, int numberOfTracks, RunTime runTime) {
      super(title,date,artist,runTime);
      this.numberOfTracks = numberOfTracks;
   }
   
   public int getNumberOfTracks() {
      return numberOfTracks;
   }
   
   public String toString() {
      return "";
   }
}