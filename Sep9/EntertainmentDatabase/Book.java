public class Book extends Library {
   
   protected String isbn = "";
   protected String author = "";
   protected String genre = "";

   public Book(String isbn, Date date, String author, String title, String genre) {
      super(title, date);
      this.author = author;
      this.title = title;
      this.genre = genre;
   }
   
   public String getISBN() {
      return isbn;
   }
   
   public String getAuthor() {
      return author;
   }
   
   public String getGenre() {
      return genre;
   }
   
   public String toString() {
      return "";
   }
}