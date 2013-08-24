public class Fraction {
   private int num;
   private int den;
   private boolean undefined = false;
   
   
   // first check if undefined before setting...double check may not be good...
   public Fraction(int num, int den) {
      if (!undefined) {
         setNumerator(num);
         setDenominator(den);
      }
   }
   
   // call this first with denominator before constructor?????
   public void checkFraction(int den) {
      if (den != 0)
         undefined = false;
      else
         undefined = true;
   }
   
   // don't care what num is just set it
   public void setNumerator(int num) {
      this.num = num;
   }
   
   // if not undefined (den not 0) set denominator
   public void setDenominator(int den) {
      if(!undefined) {
         this.den = den;
      }
      else {
         // show it is undefined somehow
      }
         
     
   }
   
   public String reduce() {
      return "101";
     // stub
   }
   
   public String perform() {
      return "100";
   }
   
   public String toString() {
      return num + "/" + den;
   }
   
}