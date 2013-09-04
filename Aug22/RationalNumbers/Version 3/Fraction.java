

import java.util.*;
public class Fraction {
	private int numerator;
	private int denominator;
	private boolean undefined = false;
	

	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		checkFraction(this.denominator);
		reduceFraction();
      
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public Fraction reciprocal(Fraction anotherFraction) {
		int topAns = anotherFraction.getDenominator();
		int botAns = anotherFraction.getNumerator();
      if (topAns == 0)
         return new Fraction(topAns, 0);
      else
		   return new Fraction(topAns, botAns);
	}

	public Fraction add(Fraction anotherFraction) {
		int lcd = denominator * anotherFraction.getDenominator();
		int xNum = numerator * anotherFraction.getDenominator();
		int yNum = denominator * anotherFraction.getNumerator();
		int topAns = xNum + yNum;
		return new Fraction(topAns, lcd);
	}

	public Fraction subtract(Fraction anotherFraction) {
		int lcd = denominator * anotherFraction.getDenominator();
		int xNum = numerator * anotherFraction.getDenominator();
		int yNum = denominator * anotherFraction.getNumerator();
		int topAns = xNum - yNum;
		return new Fraction(topAns, lcd);
	}

	public Fraction multiply(Fraction anotherFraction) {
		int topAns = numerator * anotherFraction.getNumerator();
		int botAns = denominator * anotherFraction.getDenominator();
		return new Fraction(topAns, botAns);
	}

	public Fraction divide(Fraction anotherFraction) {
		int topAns = numerator * anotherFraction.getDenominator();
		int botAns = denominator * anotherFraction.getNumerator();
		return new Fraction(topAns, botAns);
	}

	public void checkFraction(int denominator) {
		if (denominator == 0)
			undefined = true;
		else
			undefined = false;
	}

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

	public String toString() {
		if (denominator == 0)
			return("undefined");
		else
			return(numerator + "/" + denominator);
	}
}

