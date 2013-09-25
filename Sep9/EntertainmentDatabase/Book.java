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
    isbn                 String that stores the ISBN for a book
    author               String that stores the author for a book
    genre                String that stores the genre for a book
*/
public class Book extends Library {
   
   protected String isbn = "";
   protected String author = "";
   protected String genre = "";

   /*
      Algorithm
      super(title,date)
      this.author <- author
      this.title <- title
      this.genre <- genre
      this.isbn <- isbn
   */
   public Book(String isbn, Date date, String author, String title, String genre) {
      super(title, date);
      this.author = author;
      this.title = title;
      this.genre = genre;
      this.isbn = isbn;
   }
   
   /*
      Algorithm
      return isbn
   */
   public String getISBN() {
      return isbn;
   }
   
   /*
      Algorithm
      return author
   */
   public String getAuthor() {
      return author;
   }
   
   /*
      Algorithm
      return genre
   */
   public String getGenre() {
      return genre;
   }
   
   /*
      Algorithm
      return ""
   */
   public String toString() {
      return "";
   }
}