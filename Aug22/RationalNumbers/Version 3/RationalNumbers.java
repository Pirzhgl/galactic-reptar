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
   args                 not used
   inFile               File that has the input text
   outFile              File that stores code output
   fileInput            Scanner that reads the inFile
   fileOut              PrintStream that prints to fileOutput
   lineOfFile           next line of fileInput
   fraction             Fraction object storing previous fraction
                          values
*/
import java.util.*;
import java.io.*;
public class RationalNumbers {

	static PrintStream fileOutput;
	static File inFile;
	static File outFile;
	static Scanner fileInput;
	static Fraction fraction;
   
   /*
      Algorithm
      inFile <- new File(args[0])
      outFile <- new File(args[1])
      fileInput <- new Scanner(inFile)
      fileOutput <- new PrintStream(outFile)
      fileOutput.println("Name, project, section")
      String lineOfFile <- fileInput.nextLine()
      while(lineOfFile.toLowerCase().indexOf("quit") == -1)
         fileOutput.println(lineOfFile)
         processLine(lineOfFile)
         lineOfFile = fileInput.nextLine()   
   */
	public static void main(String [] args) throws Exception {
		inFile = new File(args[0]);
		outFile = new File(args[1]);
		fileInput = new Scanner(inFile);
		fileOutput = new PrintStream(outFile);
		fileOutput.println("Project 4, RationalNumbers\nKyle Fagan\nCS101-01\n");
		String lineOfFile = fileInput.nextLine();
		while(lineOfFile.toLowerCase().indexOf("quit")== -1) {
			fileOutput.println(lineOfFile);
			processLine(lineOfFile);
			lineOfFile = fileInput.nextLine();
		}
	}
   
   /*
      Algorithm
      if(lineOfFile.toLowerCase().indexOf("rec") == -1)
         solveFraction(lineOfFile)
      else
         reciprocal(lineOfFile)
   */
	static void processLine(String lineOfFile) {
		if (lineOfFile.toLowerCase().indexOf("rec") == -1)
			solveFraction(lineOfFile);
		else
			reciprocal(lineOfFile);
	}
   
   /*
      Algorithm
      Scanner fractionScanner <- new Scanner(lineOfFile)
      fractionScanner.next()
      String fractionString <- fractionScanner.next()
      Fraction fraction1 <- stringToFraction(fractionString)
      fileOutput.println(fraction1.toString())
      fraction <- fraciotn1.reciprocal(fraction1)
      fileOutput.println(formatted answer)
   */
	static void reciprocal(String lineOfFile) {
		Scanner fractionScanner = new Scanner(lineOfFile);
		fractionScanner.next();
		String fractionString = fractionScanner.next();
		Fraction fraction1 = stringToFraction(fractionString);
      fileOutput.println("\t" + fraction1.toString());
		fraction = fraction1.reciprocal(fraction1);
		fileOutput.println("\t the reciprocal of " + fraction1.toString() + " is " + fraction.toString());
	}
   
   /*
      Algorithm
      Scanner fractionScanner <- new Scanner(lineOfFile)
      int operatorNumber <- 0
      fraction <- stringToFraction9fractionScanner.next())
      operatorNumber <- getOperatorNumber(fractionScanner.next().toLowerCase()
      Fraction fraction2 <- stringToFraction(fracitonScanner.next())
      fileOutput.println(reduced fraction)
      fileOutput.println(formatted answer)
      while(fractionScanner.hasNext()
         operatornumber <- getOperatorNumber(fractionScanner.next().toLowerCase())
         fraction2 <- stringToFraction(fractionScanner.next())
         fileOutput.println(formatted answer)
   */
	static void solveFraction(String lineOfFile) {
		Scanner fractionScanner = new Scanner(lineOfFile);
      int operatorNumber = 0;
      fraction = stringToFraction(fractionScanner.next());
      operatorNumber = getOperatorNumber(fractionScanner.next().toLowerCase());
      Fraction fraction2 = stringToFraction(fractionScanner.next());
      fileOutput.println("\t" + fraction.toString());
      fileOutput.println(compute(operatorNumber, fraction, fraction2));
		while (fractionScanner.hasNext()) {
         operatorNumber = getOperatorNumber(fractionScanner.next().toLowerCase());
         fraction2 = stringToFraction(fractionScanner.next());
         fileOutput.println(compute(operatorNumber, fraction, fraction2));         
		}
	}
   
   /*
      Algorithm
      switch(operatorNumber)
         case 2: add previous fractiont to current fraction and print
                  formatted results
         case 3: subtract current fraction from previous fraction
                  and print formatted results
         case 4: multiply previous fraction by current fraction
                  and print formatted results
         case 5: divide previous fraciton by current fraction and
                  print formatted results
         default: return "no operation"
   */
	static String compute(int operatorNumber, Fraction previousFraction, Fraction nextFraction) {
		switch(operatorNumber) {
			// add 
			case 2:
				fraction = previousFraction.add(nextFraction);
				return "\t add " + nextFraction.toString() + " equals " + fraction.toString();
			// sub
			case 3:
				fraction = previousFraction.subtract(nextFraction);
				return "\t subtract " + nextFraction.toString() + " equals " + fraction.toString();
 			// mul
			case 4:
				fraction = previousFraction.multiply(nextFraction);
				return "\t multiply " + nextFraction.toString() + " equals " + fraction.toString();
			// div
			case 5:
				fraction = previousFraction.divide(nextFraction);
				return "\t divide " + nextFraction.toString() + " equals " + fraction.toString();
			// no op
			default: return "\t no operation";
		}
	}
   
   /*
      Algorithm
      operator.toLowerCase()
      switch(operator)
         case "rec": return 1
         case "add": return 2
         case "sub": return 3
         case "mul": return 4
         case "div": return 5
         default: return 0
         
   */
	static int getOperatorNumber(String operator) {
		operator.toLowerCase();
		switch(operator) {
			case "rec": return 1;
			case "add": return 2;
			case "sub":	return 3;
			case "mul": return 4;
			case "div": return 5;
			default: return 0;
		}
	}
   
   /*
      Algorithm
      Scanner fractionScanner <- new Scanner(fractionString)
      fracitonScanner.useDelimiter("/")
      int numerator <- fracitonScanner.nextInt()
      int denominator <- fracitonScanner.nextInt()
      return new Fraction(numerator,denominator)
   */
	static Fraction stringToFraction(String fractionString) {
		Scanner fractionScanner = new Scanner(fractionString);
		fractionScanner.useDelimiter("/");
		int numerator = fractionScanner.nextInt();
		int denominator = fractionScanner.nextInt();
		return new Fraction(numerator,denominator);
	}

}

