public class Driver {
   public static void main(String [] ars) {
      Overloading o = new Overloading();
      Overloading p = new Overloading(7, 6);
      System.out.println(p.sum());
      System.out.println(p.sum(5));
      System.out.println(p.sum(0.0));
      System.out.println(p.sum(17L));
      System.out.println(p.sum('a'));
      
   }
}