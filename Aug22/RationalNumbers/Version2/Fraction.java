public class Fraction {
   private int num;
   private int den;
   private boolean undefined = false;
   
   
   // Constructor
   // Check if not undef before constructing fraction.
   public Fraction(int num, int den) {
      checkFraction(den);
      if (!undefined) {
         setNumerator(num);
         setDenominator(den);
      }
      else {
         checkFraction(den);
      }
   }
   
   // Calling this method checks the fraction
   // for undefined.
   // Want to do this before performing any
   // operations.
   private String checkFraction(int den) {
      if (den != 0)
         undefined = false;
      else
         undefined = true;
         return "undefined";
   }
   
   // Numerator does not matter
   // just set it.
   private void setNumerator(int num) {
      this.num = num;
   }
   
   // If not undefined, set the denominator
   // to the input.
   // If it is undefined, do nothing..
   // checkFraction will handle and
   // return a string
   private void setDenominator(int den) {
      if(!undefined) {
         this.den = den;
      }
      else {
         // does nothing
      }
         
   }
   
   // USE Integer.toString()!!!!!!!!!
   
   public String reduce() {
      return "101";
   }
   
   public String perform() {
      return "100";
      // stub
   }
   
   public String toString() {
      return num + "/" + den;
   }
   
}