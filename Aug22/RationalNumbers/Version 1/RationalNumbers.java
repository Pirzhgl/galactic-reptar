/* Kyle Fagan
   CS 101-01
   Rational Numbers V1.0
   Due Date: Monday Aug 26, 2013
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
   while(next line does not say quit)
      fileOutput.println(lineOfFile)
      Fraction fraction <- Fraction(lineOfFile)
      if(fraction can be reduced)
         fileOutput.println(reduced fraction)
      fileOutput.println(fraction.solved())
      lineOfFile <- fileInput.nextLine()
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