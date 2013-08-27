public class UsingArrays {
   public static void main(String [] args) {
      int [] a = new int [10];
      a[7] = 42;
      a[3] = a[7] - 4*4;
      System.out.println(a.length);
      System.out.println(a[a.length-1]);
      int [] b = new int [0];
      System.out.println(b[b.length-1]);
   }
}