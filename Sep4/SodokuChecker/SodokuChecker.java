import java.util.*;
import java.io.*;
public class SodokuChecker {

	static File inFile;
	static File outFile;
	static PrintStream fileOutput;
	static Scanner sodokuScanner;
	static char [][]array = new char [9][9];

	public static void main(String [] args) throws Exception{
		inFile = new File(args[0]);
		outFile = new File(args[1]);
		fileOutput = new PrintStream(outFile);
      sodokuScanner = new Scanner(inFile);
		fileOutput.println("Sodoku Checker\nKyle Fagan\nCS101-01\n");
      for(int i = 0; i < 2; i++) {
         Sodoku puzzle1 = new Sodoku(convertLinesToTwoDArray());
         fileOutput.println(puzzle1.toString());
         puzzle1.evaluateSodoku();
         fileOutput.println(puzzle1.conclusion());
      }
 	}
      
	static String getSodokuLine() {
      String sodokuLine = sodokuScanner.nextLine();
      sodokuLine = sodokuLine.trim();
      sodokuLine = sodokuLine.replace('0', ' ');
      return sodokuLine;
	}

	static char[][] convertLinesToTwoDArray() {
		String sodokuLine = getSodokuLine();
		for(int i = 0; i < array.length; i++) {
         for(int j = 0; j < array[i].length; j++) {
            array[i][j] = sodokuLine.charAt(j);
         }
         sodokuLine = getSodokuLine();
      }
      return array;
	}
}