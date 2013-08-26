/* Kyle Fagan
   CS 101-01
   Rational Numbers V1.0
   Due Date: Monday Aug 26, 2013
   Class: Fraction - contains methods for operations
   on a fraction
*/
/*
             Data Table
             ==========
   Variables            Purpose
   =========            =======
   numerator            represents the numerator of
                         the fraction as a String
   denominator          represents the denominator
                          of the fraction as a 
                          String
   denominatorInteger   represents the denominator
                          of a fraction as an int
   numeratorInteger     represents the numerator of
                          a fraction as an int
   undefined            boolean value that tells if
                          a fraction is undefined
   answer               String that contains the 
                          answer of the line
*/
public class Fraction {
	private String numerator;
	private String denominator;
   private int denominatorInteger;
   private int numeratorInteger;
   private boolean undefined;
   private String answer;


   /* Algorithm
      take entire line and break it up into fractions 
      and identify operations on the fracitons
   */
	public Fraction(String entireLine) {

	}
   
   /* Algorithm
      Returns a fraction that has the "#/#" notation as
      a String
   */
   public String properFraction(String num, String den) {
      return "Fraction in string form";
   }
   
   /* Algorithm
      Makes sure the denominator is not zero
      if it is zero set undefiend to true
   */
   public void checkFraction(den:int) {
      return "set the undefined flag to true if true";
   }
   
   /* Algorithm
      sets the numerator, used in creating a proper
      fraction    
   */
   public void setNumeratorStr(String num) {
      
   }
   
   /* Algorithm
      sets the denominator, used in creating a 
      proper fraction
   */
   public void setDenominatorStr(String den) {
   
   }
   
   /* Algorithm
      returns true if the fraction is able to be
      reduced
   */
	public boolean canBeReduced(int num, int den) {
		return true;
	}

   /* Algorithm
      prints a reduced fraction as a string
   */
	public String reduced() {
		return "This is a reduced fraction.";
	}
   
   /* Algorithm
      returns the addition of two fractions
   */
	private String add() {
		return "Add fractions";
	}

   /* Algorithm
      returns the subtraction of two fractions
   */
	private String subtract() {
		return "Subtract fractions";
	}

   /* Algorithm
      returns the multiplication of two
      fractions
   */
	private String multiply() {
		return "Multiply fractions";
	}

   /* Algorithm
      returns the division of two fractions
   */
	private String divide() {
		return "Divide fractions";
	}

   /* Algorithm
      returns the reciprocal of a fraction
   */
	private String reciprocal() {
		return "Reciprocal fractions";
	}

   /* Algorithm
      Solved line of input      
   */
	public String solved() {
		return "Solved line of input.";
	}

   /* Algorithm
      returns the fraction in string form
      "#/#" 
   */
	public String toString() {
		return numerator +"/"+ denominator;			
	}









}