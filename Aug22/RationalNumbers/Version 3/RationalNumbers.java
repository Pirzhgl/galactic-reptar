

import java.util.*;
import java.io.*;
public class RationalNumbers {

	static PrintStream fileOutput;
	static File inFile;
	static File outFile;
	static Scanner fileInput;
	static Fraction fraction;

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

	static void processLine(String lineOfFile) {
		if (lineOfFile.toLowerCase().indexOf("rec") == -1)
			solveFraction(lineOfFile);
		else
			reciprocal(lineOfFile);
	}

	static void reciprocal(String lineOfFile) {
		Scanner fractionScanner = new Scanner(lineOfFile);
		fractionScanner.next();
		String fractionString = fractionScanner.next();
		Fraction fraction1 = stringToFraction(fractionString);
      fileOutput.println("\t" + fraction1.toString());
		fraction = fraction1.reciprocal(fraction1);
		fileOutput.println("\t the reciprocal of " + fraction1.toString() + " is " + fraction.toString());
	}

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

	static Fraction stringToFraction(String fractionString) {
		Scanner fractionScanner = new Scanner(fractionString);
		fractionScanner.useDelimiter("/");
		int numerator = fractionScanner.nextInt();
		int denominator = fractionScanner.nextInt();
		return new Fraction(numerator,denominator);
	}

}

