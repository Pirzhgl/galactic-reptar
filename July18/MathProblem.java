/*

	Kyle Fagan
	CS101-01
	July 18, 2013
	Classwork assignment that solves a math problem using different operators in order to demonstrate
	 the order of operators.
	
*/

public class MathProblem
{
	public static void main(String [] args)
	{
		int a = 17 - (3*2);
		int b = 4 + 6;
		int c = 8 / (3-1);
		int d = 9+5;
		int e = 7-2;
		
		int firstTerm = a/b;
		int secondTerm = c;
		int thirdTerm = d/e;
		
		int finalAnswer = firstTerm - (secondTerm * thirdTerm);
		
		System.out.println(finalAnswer);
				
	}//main
}

// Class Template