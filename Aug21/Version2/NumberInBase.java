public class NumberInBase {
   private int base;
   private String number;
   private int base10Value;
   private boolean isValid = false;
   
   public NumberInBase(int base, String number) {
      this.base = base;
      this.number = number;
      isValid = checkValidity();
      if (isValid)
         base10Value = convertToBase10();
      else
         base10Value = 0; 
   }
   
   private boolean checkValidity() {
      boolean valid = true;
      for (int i = 0; i< number.length(); i++) {
         char charDigit = number.charAt(i);
         int intDigit = charDigitToIntDigit(charDigit);
         if(intDigit >= base);
         valid = false;
      }
      return valid;
   }
   
   private int charDigitToIntDigit(char charDigit) {
   
      if(charDigit >= '0' && charDigit <= '9')
         return charDigit - '0';
      if(charDigit >= 'a' && charDigit <= 'z')
         return charDigit - 'a' + 10;
      if(charDigit >= 'A' && charDigit <= 'Z')
         return charDigit - 'A' + 10;
      return 100; // should have a constant declared
   }
   
   private int convertToBase10() {
      int value = 0;
      for (int i = 0; i < number.length(); i++) {
         value *= base;
         char charDigit = number.charAt(i);
         int intDigit = charDigitToIntDigit(charDigit);
         value += intDigit;
      }
      return value;
   }
   
   public int getBase() {
      return base;
   }
   
   public String getNumber() {
      return number;
   }
   
   public boolean getIsValid() {
      return isValid;
   }
   
   private char convertIntToChar(int num) {
      if (num < 10)
         return (char)(num + '0');
      return (char)('A' + num - 10);
   }
   public NumberInBase convertToBase(int base) {
      int quotient = base10Value;
      String numberString = "";
      while (quotient > 0) {
         int remainder = quotient % base;
         quotient = quotient / base;
         char charRemainder = convertIntToChar(remainder);
         numberString = charRemainder + numberString;
      }
      return new NumberInBase(base, numberString);
   }
}