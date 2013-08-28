public class ArrayInClass {
   // Arrays can be instance variables
   private int [] x;
   private int maxValue;//larget value in x
   public ArrayInClass( int[] y) {
      x = y; // this is dangerous.
      // should realy copy y into x
      maxValue = findMax(x);
   }
   
   private int findMax(int [] z) {
      int big = z[0];
      for (int i = 1; i < z.length; i++) {
         if (big < z[i]) {
            big = z[i];
         }
      }
      return big;
   }
   
   public int getMaxValue() {
      return maxValue; 
   }
   
   public int [] doubleX() {
      int [] c = new int[x.length];
      for(int i = 0; i < x.length; i++) {
         c[i] = 2 * x[i];
      }
      return c;
   }
}