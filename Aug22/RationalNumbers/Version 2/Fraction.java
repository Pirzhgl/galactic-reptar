public class Fraction {
	private String numerator;
	private String denominator;
   private int denominatorInteger;
   private int numeratorInteger;
   private boolean undefined;
   private String answer;



	public Fraction(String entireLine) {

	}
   
   public String properFraction(String num, String den) {
      return "Fraction in string form";
   }
   
   public void checkFraction(den:int) {
      return "set the undefined flag to true if true";
   }
   
   public void setNumeratorStr(String num) {
      
   }
   
   public void setDenominatorStr(String den) {
   
   }
   
	public boolean canBeReduced(int num, int den) {
		return true;
	}

	public String reduced() {
		return "This is a reduced fraction.";
	}

	private String add() {
		return "Add fractions";
	}

	private String subtract() {
		return "Subtract fractions";
	}

	private String multiply() {
		return "Multiply fractions";
	}

	private String divide() {
		return "Divide fractions";
	}

	private String reciprocal() {
		return "Reciprocal fractions";
	}

	public String solved() {
		return "Solved line of input.";
	}

	public String toString() {
		return numerator +"/"+ denominator;			
	}









}