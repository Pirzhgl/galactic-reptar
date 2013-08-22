public class Rectangle {
   
   // Instance variables store data
   public int length;
   public int width;
   
   // constructors create an object and init instance vars
   
   public Rectangle(int len, int wid) {
      length = len;
      width = wid;
   }
   
   public String toString() {
      return "A rectangle with length " + length + " and width " + width;
   }
}