public class Rectangle {
   protected int length;
   protected int width;
   
   public Rectangle(int lenght, int width) {
      this.length = length;
      this.width = width;
   }
   
   // overrides toString() in Rectangle
   public String toString() {
      return "A rectangle with lenth " + length + " and width " + width;
   }
   
   public int computeArea() {
      return length * width;
   }
   
   public int getLength() {
      return this.length;
   }
   
   
}