public class SwitchStatement {
   public static void main(String [] args) {
      
      // base 3 has digits 0, 1, and 2
      
      char digit = '1';
      int digitValue = -1;
      
      switch (digit) {
         case '0' : System.out.println("zero");
                    digitValue = 0;
                    
         case '1' : System.out.println("one");
                    digitValue = 1;
                    
         case '2' : System.out.println("two");
                    digitValue = 2;
                    
         default : System.out.println("not a base 3 digit");
                   digitValue = -42;
      }
   }
}