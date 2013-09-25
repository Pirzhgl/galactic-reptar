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
    readingLevel         int that represents the reading level of the book
*/
public class Nonfiction extends Book{
   
   protected int readingLevel;
   
   /*
      Algorithm
      super(isbn,date,author,title,genre)
      this.readingLevel <- readingLevel
   */
   public Nonfiction(String isbn, Date date, String author, String title, String genre, 
                     int readingLevel) {
       super(isbn, date, author, title, genre);
       this.readingLevel = readingLevel;     
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
      return reading level
   */
   public int getReadingLevel() {
      return readingLevel;
   }
   
   /*
      Algorithm
      return "Title: " + getTitle() + "Author: " + getAuthor() + " Genre: "
      + getGenre() + " Reading Level: " + getReadingLevel() + " ISBN: " + getISBN()
   */
   public String toString() {
      return "Title: " + getTitle() + " Author: " + getAuthor() + " Genre: " + getGenre() + 
               " Reading Level: " + getReadingLevel() + " ISBN: " + getISBN();
   }
}