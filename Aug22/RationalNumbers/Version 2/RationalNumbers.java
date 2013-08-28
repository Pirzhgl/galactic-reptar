/* Kyle Fagan
   CS 101-01
   Rational Numbers V1.0
   Due Date: Thursday Aug 29, 2013
*/

/*
             Data Table
             ==========
   Variables            Purpose
   =========            =======
   args                 not used
   inFile               File that has the input text
   outFile              File that produces code output
   fileInput            Scanner that reads inFile
   fileOut              Print Stream that prints to fileOut
   lineOfFile           Next line of fileInput
   fraction             Fraction object reading lineOfFile
*/
/*
   Algorithm
main(args)
   File inFile <- File(args[0])
   File outFile <- File(args[1])
   Scanner fileInput <- Scanner(inFile)
   PrintStream fileOutput <- PrintStream(outFile)
   String lineOfFile <- fileInput.nextLine()
   while(lineOfFile.toLowerCase().indexOf("quit" == -1)
      fileOutput.println(lineOfFile)
      Fraction fraction = new Fraction(lineOfFile)
      fileOutput.println("\t" + fraction.reduce())
      fileOutput.println("\t" + fraction.toString())
      lineOfFile = fileInput.nextLine()
*/
import java.util.*;
import java.io.*;
public class RationalNumbers {

	public static void main(String [] args) throws Exception {

		File inFile = new File(args[0]);
		File outFile = new File(args[1]);
		Scanner fileInput = new Scanner(inFile);
		PrintStream fileOutput = new PrintStream(outFile);
		String lineOfFile = fileInput.nextLine();
		while(lineOfFile.toLowerCase().indexOf("quit") == -1) {
			fileOutput.println(lineOfFile);
			Fraction fraction = new Fraction(lineOfFile);
			fileOutput.println("\t" + fraction.reduce(fraction.getNumerator(),fraction.getDenominator()));
			fileOutput.println("\t" + fraction.toString());
			lineOfFile = fileInput.nextLine();
		}
	}
}