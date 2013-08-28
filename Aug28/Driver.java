public class Driver {
   public static void main(String [] args) {
      int [] a = {2,4,6,8,10};
      ArrayInClass r = new ArrayInClass(a);
      System.out.println(r.getMaxValue());
      int [] b = r.doubleX();
   }
}