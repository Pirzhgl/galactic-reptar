public class CallByValue {
   public static void main(String [] args) {
      int x = 1;
      addOne(x);
      System.out.println(x);
      int [] a = {1,2,3};
      addOne(a);
      makeBigger(a);
   }
   
   public static void makeBigger(int []x) {
      int [] c = new int[x.length+1];
      for(int i = 0; i < x.length; i++) {
         c[i] = x[i];
      }
      x = c; // does not affect argument
   }
   
   public static void addOne(int x) {
      x++;
   }
   
   public static void addOne(int [] x) {
      for (int i = 0; i < x.length; i++) {
         x[i]++;
      }
   }
}