// Kyle Fagan
// Notes on the math class

public class MathStuff {
   public static void main(String [] args) {
      double pi = Math.PI;                      // Math.PI because PI is static! NO object.PI
      System.out.println(pi);
      
      int x = -7;
      double d = -17.5;
      long n = -345678L;
      float f = -2.3F;                          // literal
      System.out.println(Math.abs(x));          // all different methods because they are taking differnt types
      System.out.println(Math.abs(d));          // name of the clas must be used
      System.out.println(Math.abs(n));
      System.out.println(Math.abs(f));
      
      int max = Math.max(5, 7);
      int min = Math.min(5, 7);
      
      int max2 =Math.max(max, Math.max(4,8));
      
      System.out.println(Math.random());
      
      int randomz = (int) (Math.random()*6);    // simulates 1-6 dice
      System.out.println(randomz + 1);
      
   }
}