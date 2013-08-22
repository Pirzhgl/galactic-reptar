// Kyle Fagan
// Phillip Kropp
public class CirlceDriver {
   public static void main(String [] args) {
      
      Circle c = new Circle(4);
      System.out.println(c.toString());
      System.out.println(c.getArea());
      System.out.println(c.getCircumfrence());
      c.setRadius(-4);
      System.out.print(c.getRadius());
      
      
      
   }
}