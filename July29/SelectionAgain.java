public class SelectionAgain {
   public static void main(String [] args) {
      // I want to add one to b and c if a is the middle value. This code succeeds becuase we use a block
      
      int a = 1, b = 2, c = 3;
      if (((a > b) && (a < c)) || ((a > c) && (a < b))) {
         b++;
         ++c;
      }
      System.out.println(a + "\t" + b + "\t" + c);
      
      
   }
}