import java.util.*;
public class Fraction {
   private int numerator;
   private int denominator;
   private String answer = "";
   private boolean undefined1 = false;



	public Fraction(String entireLine) {
      
	}
   
   // complete
   public void checkFraction(int den) {
      if(den == 0) {
         undefined1 = true;
      }
      else {
         undefined1 = false;
      }
   }
   
   public void setNumeratorStr(String num) {
      
   }
   
   public void setDenominatorStr(String den) {
   
   }

	public String reduce(int numerator, int denominator) {
   checkFraction(denominator);
   if(!undefined1) {
      int n = numerator;
      int d = denominator;
      int numerator1 = numerator;
      int denominator1 = denominator;
      while (d != 0) {
         int t = d;
         d = n % d;
         n = t;
      }

      int gcd = n;

      numerator1 /= gcd;
      denominator1 /= gcd;
   	return numerator1 + "/ " + denominator1;
   }
   else
      return "undefined";
	}

	public String add(int num1, int den1, int num2, int den2) {
      int xNum = num1 * den2;
      int yNum = num2 * den1;
      int lcd = den1 * den2;
      int topAns = xNum + yNum;
      int botAns = lcd;
      answer = reduce(topAns,botAns);
      return toString();
      
 	}

	public String subtract(int num1, int den1, int num2, int den2) {
		int xNum = num1 * den2;
      int yNum = num2 * den1;
      int lcd = den1 * den2;
      int topAns = xNum - yNum;
      int botAns = lcd;
      answer = reduce(topAns,botAns);
      return toString();

      
	}

	public String multiply(int num1, int den1, int num2, int den2) {
		int topAns = num1 * num2;
      int botAns = den1 * den2;
      answer = reduce(topAns,botAns);
      return toString();
	}

	public String divide(int num1, int den1, int num2, int den2) {
		int topAns = num1 * den2;
      int botAns = den1 * num2;
      answer = reduce(topAns,botAns);
      return toString();
	}

	public String reciprocal(int num, int den) {
		int topAns = den;
      int botAns = num;
      answer = reduce(topAns,botAns);
      return toString();
	}

	public String toString() {
		return answer;			
	}









}