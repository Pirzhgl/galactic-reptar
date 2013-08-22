public class RectangleDriver {
   public static void main(String [] args) {
      Rectangle r = new Rectangle(6, 3);
      System.out.println(r.toString());
      r.length = -17; // outside code should not be able to do this (set without using object)
      System.out.println(r);
      Rectangle r2 = new Rectangle( -3, -4);
      System.out.println(r2);
   }
}