import java.util.*;
import java.io.*;
public class RationalNumbers {

	public static void main(String [] args) throws Exception {

		File inFile = new File(args[0]);
		File outFile = new File(args[1]);
		Scanner fileInput = new Scanner(inFile);
		PrintStream fileOutput = new PrintStream(outFile);
		String lineOfFile = fileInput.nextLine();
		while(!(lineOfFile.regionMatches(true,0,"quit",0,3))) {
			fileOutput.println(lineOfFile);
			Fraction fraction = new Fraction(lineOfFile);
			fileOutput.println(fraction.reduce(5,5));
			fileOutput.println(fraction.toString());
			lineOfFile = fileInput.nextLine();
         // testing some stuff
         System.out.println(fraction.reciprocal(1,3));
		}
	}
}