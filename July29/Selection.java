public class Selection {
   public static void main(String [] args) {
      // I want to add one to b and c if a is the middle value. This code fails becuase we add one to c always;
      // the logical expression and the if select only the b++ satement.
      int a = 1, b = 2, c = 3;
      if (((a > b) && (a < c)) || ((a > c) && (a < b)))
         b++;
         ++c;
      System.out.println(a + "\t" + b + "\t" + c);
      
      
   }
}