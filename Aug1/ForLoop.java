public class ForLoop {
   public static void main(String [] args) {
      // count from 1 to 5
      
      
      // init index: int i = 1
      // test index variable: i <= 5
      // update index variable: i++
      for (int i = 1; i <= 5; i++)
         System.out.println(i);
       for (int i = 2; i <= 6; i += 2)
         System.out.println(i);
      // System.out.println(i); // error here because variable is declared inside the for loop
      
      // i is local for statement
      
      int n = 100;
      int sum = 0; // start the additive accumulator at zero
      for (int i = 0; i<=n; i++)
         sum = i + sum;
      System.out.println(sum);// 
   }
}