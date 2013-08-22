import java.util.*;
public class BaseConversion {
   public static void main(String [] args) {
      Scanner scanner = new Scanner(System.in);
      InputTriple inputTriple = new InputTriple(scanner);
      while(inputTriple.getIsValid()) {
         NumberInBase inputNumber = new NumberInBase(inputTriple.getInputBase(),inputTriple.getNumber());
         if(inputNumber.getIsValid()) {
            NumberInBase convertedNumber = inputNumber.convertToBase(inputTriple.getConversionBase());
            print(inputNumber, convertedNumber);
            
         }
         else {
            print(inputTriple);
         }
         inputTriple = new InputTriple(scanner);
      }
   }
   
   private static void print(NumberInBase input, NumberInBase convertedBase) {
      System.out.println("is good output code");
   }

   private static void print(InputTriple triple){
      System.out.println("is bad output code");
   }
}

