// Strings Examples
// Playing with types and strings together

public class StringExample {
	public static void main(String [] args) {
		System.out.println("5 plus 3" + " = " + (5 + 3)); // 5+3 must be in parentheses so that operation happens before
																		  // 5 and 3 are converted into strings
		
		System.out.println("5 times 3 = " + 5 * 3); // Works becuase multiply operator comes before the int gets converted
																  // into a string
																  
		System.out.println("5 minus 3 = " + (5 - 3)); // Will error without parenthesis around 5-3 becuase minus is not an
																  	 // operator for strings
																	 
																	 
		System.out.println(5 - 3 + " is the result of 5 minus 3"); // No parenthesis needed because order of operator
	}
}