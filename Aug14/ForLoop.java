public class ForLoop {
   public static void main(String [] args) {
      for(char c = 'B';c <= 'Z';c = (char)(c+2)) {
         System.out.print(c);
      }
      System.out.println();
      
      
      
      
      // OR
      
      for(char c = 'B'; c<= 'Z'; c+=2) {
         System.out.print(c);
      }
      System.out.println();
   }
}