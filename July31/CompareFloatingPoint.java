public class CompareFloatingPoint {
   public static void main(String [] args) {
      float f = 0.1F + 0.1F + 0.1F + 0.1F + 0.1F + 0.1F + 0.1F + 0.1F + 0.1F + 0.1F;
      float one = 1.0F;
      if (f == one)
         System.out.println("equal");
      else
         System.out.println("not equal");
      
      final float EPSILON = 0.0001F;
      if (Math.abs(f-one) < EPSILON) {
         System.out.println("equal");
      }
   }
}