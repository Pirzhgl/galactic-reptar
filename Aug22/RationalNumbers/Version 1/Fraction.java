/* Kyle Fagan
   CS 101-01
   Rational Numbers V1.0
   Due Date: Monday Aug 29, 2013
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
public class Fraction {
   private int numerator;
   private int denominator;
   private boolean undefined = false;
   private String answer = "add/sub/mul/div equals x/y";
   


   /* Algorithm
      take entire line and break it up into fractions 
      and identify operations on the fracitons
   */
	public Fraction(String entireLine) {

	}
 
   /* Algorithm
      Makes sure the denominator is not zero
      if it is zero set undefiend to true
   */
   public void checkFraction() {
   }
   

   /* Algorithm
      prints a reduced fraction as a string
   */
	public String reduce() {
      return "";
     
	}
   
   /* Algorithm
      returns the addition of two fractions
   */
	public String add() {
		return "Add fractions";
	}

   /* Algorithm
      returns the subtraction of two fractions
   */
	public String subtract() {
		return "Subtract fractions";
	}

   /* Algorithm
      returns the multiplication of two
      fractions
   */
	public String multiply() {
		return "Multiply fractions";
	}

   /* Algorithm
      returns the division of two fractions
   */
   public String divide() {
		return "Divide fractions";
	}

   /* Algorithm
      returns the reciprocal of a fraction
   */
	public String reciprocal() {
		return "Reciprocal fractions";
	}


   /* Algorithm
      returns answer
   */
	public String toString() {
		return "";			
	}









}