public class Nonfiction extends Book{
   
   protected int readingLevel;
   
   public Nonfiction(String isbn, Date date, String author, String title, String genre, 
                     int readingLevel) {
       super(isbn, date, author, title, genre);
       this.readingLevel = readingLevel;     
   }
   
   public int getReadingLevel() {
      return readingLevel;
   }
   
   public String toString() {
      return "";
   }
}