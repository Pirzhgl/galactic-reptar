/*
   Kyle Fagan
   CS101-01
   Project 4 - Rational Numbers
   Description: Take command line arguments and
   perform operations on fractions and print out
   the results to a file.
*/
/*
             Data Table
             ==========
   Variables            Purpose
   =========            =======
   numerator            int value of the numerator
   denominator          int value of the denominator
   undefined            boolean if fraction is undefined
*/

import java.util.*;
public class Fraction {
	private int numerator;
	private int denominator;
	private boolean undefined = false;
	
   /*
      Algorithm
      this.numerator <- numerator
      this.denominator <- denominator
      checkFraciton(this.denominator)
      reduceFraction();
   */
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		checkFraction(this.denominator);
		reduceFraction();
      
	}
   
   /*
      Algorithm
      return numerator
   */
	public int getNumerator() {
		return numerator;
	}
   /*
      Algorithm
      return denominator
   */
	public int getDenominator() {
		return denominator;
	}
   /*
      Algorithm
      this.numerator <- numerator
   */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
   /*
      Algorithm
      this.denominator <- denominator
   */
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
   /*
      Algorithm
      int topAns <- anotherFraction.getDenominator()
      int botAns <- anotherFraction.getNumerator()
      if topAns == 0
         return new Fraction(topAns, 0)
      else
         return new Fraciton(topAns,botAns)
   */
	public Fraction reciprocal(Fraction anotherFraction) {
		int topAns = anotherFraction.getDenominator();
		int botAns = anotherFraction.getNumerator();
      if (topAns == 0)
         return new Fraction(topAns, 0);
      else
		   return new Fraction(topAns, botAns);
	}
   
   /*
      Algorithm
      int lcd <- denominator * anotherFraction.getDenominator()
      int xNum <- numerator * anotherFraciton.getDenominator()
      int yNum <- denominator * anotherFraction.getNumerator()
      int topAns <- xNum + yNum
      return new Fraction(topAns, lcd)
   */
	public Fraction add(Fraction anotherFraction) {
		int lcd = denominator * anotherFraction.getDenominator();
		int xNum = numerator * anotherFraction.getDenominator();
		int yNum = denominator * anotherFraction.getNumerator();
		int topAns = xNum + yNum;
		return new Fraction(topAns, lcd);
	}
   /*
      Algorithm
      int lcd <- denominator * anotherFraction.getDenominator()
      int xNum <- numerator * anotherFraciton.getDenominator()
      int yNum <- denominator * anotherFraction.getNumerator()
      int topAns <- xNum - yNum
      return new Fraction(topAns, lcd)
   */
	public Fraction subtract(Fraction anotherFraction) {
		int lcd = denominator * anotherFraction.getDenominator();
		int xNum = numerator * anotherFraction.getDenominator();
		int yNum = denominator * anotherFraction.getNumerator();
		int topAns = xNum - yNum;
		return new Fraction(topAns, lcd);
	}
   /*
      Algorithm
      int topAns <- numerator * anotherFraciton.getNumerator()
      int botAns <- denominator * anotherFraction.getDenominator()
      return new Fraction(topAns, botAns)
   */
	public Fraction multiply(Fraction anotherFraction) {
		int topAns = numerator * anotherFraction.getNumerator();
		int botAns = denominator * anotherFraction.getDenominator();
		return new Fraction(topAns, botAns);
	}
   
   /*
      Algorithm
      int topAns <- numerator * anotherFraction.getDenominator()
      int botAns <- denominator * anotherFraction.getNumerator()
      return new Fraction(topAns, botAns)
   */
	public Fraction divide(Fraction anotherFraction) {
		int topAns = numerator * anotherFraction.getDenominator();
		int botAns = denominator * anotherFraction.getNumerator();
		return new Fraction(topAns, botAns);
	}
   
   /*
      Algorithm
      if (denominator == 0)
         undefined <- true
      else
         undefined <- false
   */
	public void checkFraction(int denominator) {
		if (denominator == 0)
			undefined = true;
		else
			undefined = false;
	}
   /*
      if not undefined
         int n <- numerator
         int d <- denominator
         while d is not 0
            int t <- d
            d <- n % d
            n <- t
         int gcd <- n
         numerator /= gcd
         denominator /= gcd
         if denominator is less than zero
            numerator *= -1
            denominator *= -1
   */
	public void reduceFraction() {
		if(!undefined) {
			int n = numerator;
			int d = denominator;
			while(d != 0) {
				int t = d;
				d = n % d;
				n = t;
			}

			int gcd = n;

			numerator /= gcd;
			denominator /= gcd;
			if(denominator < 0) {
				numerator *= -1;
				denominator *= -1;
			}
		}
   }
   
   /*
      Algorithm
      if denominator equals zero
         return undefined
      else
         return numerator + "/" + denominator
   */
	public String toString() {
		if (denominator == 0)
			return("undefined");
		else
			return(numerator + "/" + denominator);
	}
}

