public class Rectangle {
   private int length;
   private int width;
   
   public Rectangle(int lenght, int width) {
      this.length = length;
      this.width = width;
   }
   
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