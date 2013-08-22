import java.util.*;
public class InputTriple {
   private int inputBase;
   private String number;
   private int conversionBase;
   private boolean isValid = true;
   
   public InputTriple(Scanner scanner) {
    System.out.print("Enter base of a number: ");
    inputBase = scanner.nextInt();
    System.out.print("Enter number: ");
    number = scanner.next();
    System.out.print("Enter base to convert to: ");
    conversionBase = scanner.nextInt();
    isValid = checkValidity();  
   }
   
   // stub
   private boolean checkValidity() {
      boolean valid = true;
      if(inputBase < 2 || inputBase > 36)
         valid = false;
      if(conversionBase < 2 || conversionBase > 36)
         valid = false;
      return valid;
   }
   
   
   public boolean getIsValid() {
      return isValid;
   }
   // stub
   public int getInputBase() {
      return inputBase;
   }
   // stub
   public String getNumber() {
      return number;
   }
   public int getConversionBase() {
      return conversionBase;
   }
}