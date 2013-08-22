public class NumberInBase {
   private int base;
   private String number;
   private int base10Value;
   private boolean isValid = false;
   
   public NumberInBase(int base, String number) {
   
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
   
   // stub
   public NumberInBase convertToBase(int base) {
      return new NumberInBase(10, "1");
   }
}