/* Kyle Fagan
   CS 101-01
   Rational Numbers V2.0
   Due Date: Wednesday Sept 04, 2013
   Class: Fraction - contains methods for operations
   on a fraction
*/
/*
             Data Table
             ==========
   Variables            Purpose
   =========            =======
   numerator            value of the numerator
   denominator          value of the denominator
   undefined            boolean that says if the fraction
                          is undefined or not
   answer               String that has the format
                          and fraction to return
   
*/
import java.util.*;
public class Fraction {
   private int numerator = 5;
   private int denominator = -10;
   private String answer = "";
   private boolean undefined = false;


   /* Algorithm
      take entire line and break it up into fractions 
      and identify operations on the fracitons
   */
	public Fraction(String entireLine) {
      add(getNumerator(),getDenominator(),4,-5);
	}
   
   /* Algorithm
      if(den == 0)
         undefined = true
      else
         undefined = false
   */
   public void checkFraction(int den) {
      if(den == 0) {
         undefined = true;
      }
      else {
         undefined = false;
      }
   }
   
   /* Algorithm
      return numerator
   */
   public int getNumerator() {
      return numerator;
   }
   
   /* Algorithm
      return denominator
   */
   public int getDenominator() {
      return denominator;
   }
   
   /* Algorithm
      checkFraction(denominator)
      if(!undefined)
         int n <- numerator
         int d <- denominator
         int numerator1 = numerator
         int denominator1 = denominator
         while (d != 0)
            int t <- d
            d <- n % d
            n <- t
         int gcd <- n
         numerator1 /= gcd
         denominator1 /= gcd
         if(denominator1 < 0)
            numerator1 *= -1
            denominator1 *= -1
         return numerator1 + "/" + denominator1
      else
         return "undefined"
   */
	public String reduce(int numerator, int denominator) {
   checkFraction(denominator);
   if(!undefined) {
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
      if(denominator1 < 0) {
         numerator1 *= -1;
         denominator1 *= -1;
      }
   	return numerator1 + "/" + denominator1;
   }
   else
      return "undefined";
	}
   
   /* Algorithm
      int xNum <- num1 * den2
      int yNum <- num2 * den1
      int lcd <- den1 * den2
      int topAns <- xNum + yNum
      int botAns <- lcd
      answer <- reduce(topAns,botAns)
      return toString()
   */
	public String add(int num1, int den1, int num2, int den2) {
      int xNum = num1 * den2;
      int yNum = num2 * den1;
      int lcd = den1 * den2;
      int topAns = xNum + yNum;
      int botAns = lcd;
      answer = reduce(topAns,botAns);
      return toString();
      
 	}

   /* Algorithm
      int xNum <- num1 * den2
      int yNum <- num2 * den1
      int lcd <- den1 * den2
      int topAns <- xNum - yNum
      int botAns <- lcd
      answer <- reduce(topAns,botAns)
      return toString()   
   */
	public String subtract(int num1, int den1, int num2, int den2) {
		int xNum = num1 * den2;
      int yNum = num2 * den1;
      int lcd = den1 * den2;
      int topAns = xNum - yNum;
      int botAns = lcd;
      answer = reduce(topAns,botAns);
      return toString();

      
	}
   
   /* Algorithm
      int topAns <- num1 * num2
      int botAns <- den1 * den2
      answer <- reduce(topAns,botAns)
      return toString()
   */
	public String multiply(int num1, int den1, int num2, int den2) {
		int topAns = num1 * num2;
      int botAns = den1 * den2;
      answer = reduce(topAns,botAns);
      return toString();
	}

   /* Algorithm
      int topAns <- num1 * den2
      int botAns <- den1 * num2
      answer <- reduce(topAns,botAns)
      return toString()      
   */
	public String divide(int num1, int den1, int num2, int den2) {
		int topAns = num1 * den2;
      int botAns = den1 * num2;
      answer = reduce(topAns,botAns);
      return toString();
	}

   /* Algorithm
      int topAns <- den
      int botAns <- num
      answer <- reduce(topAns,botAns)
      return toString()
   */
	public String reciprocal(int num, int den) {
		int topAns = den;
      int botAns = num;
      answer = reduce(topAns,botAns);
      return toString();
	}

   /* Algorithm
      returns answer
   */
	public String toString() {
		return "equals " + answer;			
	}
}