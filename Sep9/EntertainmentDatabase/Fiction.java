public class Fiction extends Book {
   
   protected int pageNumbers;
   
   public Fiction(String isbn, Date date, String author, String title, String genre ,int pageNumbers) {
      super(isbn, date, author, title, genre);
      this.pageNumbers = pageNumbers;
   }
   
   public int getPageNumbers() {
      return pageNumbers;
   }
   
   public String toString() {
      return "";   
   }
}