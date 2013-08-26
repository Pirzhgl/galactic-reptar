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
			if(fraction.canBeReduced()) {
				fileOutput.println(fraction.reduced());
			}
			fileOutput.println(fraction.solved());
			lineOfFile = fileInput.nextLine();
		}
	}
}