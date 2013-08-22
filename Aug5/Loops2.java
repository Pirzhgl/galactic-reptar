public class Loops2 {
   public static void main(String [] args) {
      
      // nested loops
      // print 00 01 02 ... 09
      //       10 11 12 ... 19
      //    ...
      //       90 92 92 ... 99
      
      for (int row = 0; row < 10; row++) {
         for (int col = 0; col <10; col++) {
            System.out.print(row);
            System.out.print(col);
            System.out.print(" ");
         }
         System.out.println();
      }
   }
}