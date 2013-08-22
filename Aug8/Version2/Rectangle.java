public class Rectangle {
   
   // Instance variables store data
   private int length;
   private int width;
   
   // constructors create an object and init instance vars
   
   public Rectangle(int len, int wid) {
      length = len;
      width = wid;
   }
   
   // accessor methods, or getters
   public int getLength() {
      return length;
   }
   
   public int getWidth() {
      return width;
   }
   
   // mutator methods, or setters
   public void setLength(int len) {
      length = len;
   }
   
   public void setWidth(int wid) {
      width = wid;
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