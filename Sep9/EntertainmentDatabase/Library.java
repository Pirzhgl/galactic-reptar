public abstract class Library {
   
   protected String title;
   protected Date date;
   
   public Library(String title, Date date) {
      this.title = title;
      this.date = date;
   }
   
   public String getTitle() {
      return title;
   }
   
   public Date getDate() {
      return date;
   }
   
   public String toString() {
      return "Nope";
   }
   
   public String getISBN() {
      return "";
   }
   
   public String getAlbum() {
      return "";
   }
   
   public int getNumberOfTracks() {
      return -1;
   }
   
   public RunTime getRunTime() {
      RunTime runTime;
      return runTime = new RunTime();
   }
}