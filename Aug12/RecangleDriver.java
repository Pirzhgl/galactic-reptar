public class RecangleDriver {
   public static void main(String [] args) {
      Rectangle r1 = new Rectangle();
      System.out.println(Rectangle.getCount());
      Rectangle r2 = new Rectangle(7,5);
      System.out.println(Rectangle.getCount());
      System.out.println(Rectangle.DEFAULT_LENGTH);
      Rectangle r3 = new Rectangle(8,4);
      System.out.println(Rectangle.getCount());
   }
}