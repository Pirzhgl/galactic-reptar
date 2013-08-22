public class Loops {
   public static void main(String [] args){
      double d = 0.0;
      int c = 0;
      for (d = 0.0; d <= 1.0; d = d + 0.01) {
         c++;
         System.out.println(d);
      }
      System.out.println("count: " + c + "\tindex: " + d);
   }
}