public class SwitchStatementV3 {
   public static void main(String [] args) {
      
      // base 3 has digits 0, 1, and 2
      // use strings
      
      String digit = "seven";
      int digitValue = -1;
      // add break statements to switch otherwise we do not stop
      
      switch (digit.toLowerCase()) {
         case "one" : System.out.println("zero");
                    digitValue = 0;
                    break;
                    
         case "two" : System.out.println("one");
                    digitValue = 1;
                    break;
                    
         case "three" : System.out.println("two");
                    digitValue = 2;
                    break;
                    
         default : System.out.println("not a base 3 digit");
                   digitValue = -42;
      }
   }
}