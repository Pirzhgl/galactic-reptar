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
    pageNumbers          int that holds number of pages in a fiction book
*/
public class Fiction extends Book {
   
   protected int pageNumbers;
   
   /*
      Algorithm
      super(isbn,date,author,title,genre)
      this.pageNubmers <- pageNubmers
   */
   public Fiction(String isbn, Date date, String author, String title, String genre ,int pageNumbers) {
      super(isbn, date, author, title, genre);
      this.pageNumbers = pageNumbers;
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
      return pageNumbers
   */
   public int getPageNumbers() {
      return pageNumbers;
   }
   
   /*
      Algorithm
      return "Title: " + getTitle() + " Author: " + getAuthor() + " Genre " +
      getGenre() + " Page Numbers: " + getPageNumbers() + " ISBN " + getISBN() + 
      " Date: " + getDate()
   */
   public String toString() {
      return "Title: " + getTitle() + " Author: " + getAuthor() + " Genre " + getGenre() + 
              " Page Numbers: " + getPageNumbers()+ " ISBN: " + getISBN() + 
              " Date: " + getDate();   
   }
}