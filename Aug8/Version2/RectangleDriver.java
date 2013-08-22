public class RectangleDriver {
   public static void main(String [] args) {
      Rectangle r = new Rectangle(6, 3);
      System.out.println(r.toString());
      r.setLength(-17); 
      System.out.println(r);
      Rectangle r2 = new Rectangle( -3, -4);
      System.out.println(r2);
      System.out.println(r2.getWidth());
      int area = r.getArea();
      int perim = r.getPerimeter();
      System.out.println(area);
      System.out.println(perim);
   }
}