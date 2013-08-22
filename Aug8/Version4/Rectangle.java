public class Rectangle {
   
   // Instance variables store data
   private int length;
   private int width;
   
   // constructors create an object and init instance vars
   
   public Rectangle(int len, int wid) {
      setLength(length);
      setWidth(width);
   }
   
   // accessor methods, or getters
   public int getLength() {
      return length;
   }
   
   public int getWidth() {
      return width;
   }
   
   // mutator methods, or setters
   // for this object, good values are nonnegative
   public void setLength(int length) {
      if (length > 0) {
         this.length = length;
      }
      else {
         this.length = 0;
      }
   }
   
   public void setWidth(int width) {
      if (width > 0) {
         this.width = width;
      }
      else {
         this.width = 0;
      }
   }
   
   // other methods
   
   public int getArea() {
      return length * width;
   }
   
   public int getPerimeter() {
      return (2*width) + (2*length);
   }
   
   
   
   
   
   public String toString() {
      return "A rectangle with length " + length + " and width " + width;
   }
}