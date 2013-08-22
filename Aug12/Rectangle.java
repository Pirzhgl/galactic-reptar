public class Rectangle {

   private static int count = 0;
   
   // count the number of Rectangle objects
   public static final int DEFAULT_WIDTH = 0;
   public static final int DEFAULT_LENGTH = 0;
   
   // instance vars
   private int width;
   private int length;
   
   public Rectangle () {
      this(DEFAULT_LENGTH, DEFAULT_WIDTH);
   }
   
   public Rectangle(int length, int width) {
      this.length = length;
      this.width = width;
      count++; // every time a Rectangle object is created count increases for us to see
   }
   
   // belongs to the class becuase of the static reserved word
   public static int getCount() {
      return count;
   }
}