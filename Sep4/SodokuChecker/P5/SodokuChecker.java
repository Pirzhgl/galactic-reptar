/*
   Kyle Fagan
   CS101-01
   Project 5 - Sodoku Checker
   Due Date: September 12, 2013
   Class description: main method for project 5 that 
   determines the validity and completeness of a 
   sodoku-style puzzle input from a file.
*/
/*
             Data Table
             ==========
   Variables            Purpose
   =========            =======
   inFile               File that has the input data
                         for the program
   outFile              File that has code output
   fileOutput           Print Stream object that will
                         print to the outFile
   sodokuScanner        Scanner object that reads
                         lines from inFile
   sodoku                a twoDarray char array used to
                         store chars from inFile and
                         feed to Sodoku class
*/
/*
   Algorithm
   
static File inFile
static File outFile
static PrintStream fileOutput
static Scanner sodokuScanner
static char [][] sodoku = new char [9][9]   
   
main(String [] args) throws Exception
   inFile <- new File(args[0])
   outFile <- new File(args[1])
   fileOutput <- new PrintStream(outFile)
   sodokuScanner <- new Scanner(inFile)
   fileOutput.println("Identification information")
   while(sodokuScanner.hasNext())
      Sodoku puzzle1 <- new Sodoku(convertLinesToTwoDArray())
      fileOutput.println(puzzle1.toString())
      puzzle1.evaluateSodoku()
      fileOutput.println(puzzle1.conclusion())
      
static String getSodokuLine()
   String sodokuLine <- ""
   while(sodokuScanner.hasNext())
      sodokuLine <- sodokuScanner.nextLine()
      sodokuLine <- sodokuLine.trim()
      sodokuLine <- replace('0', ' ')
      break
   return sodokuLine

static char[][] convertLinesToTwoDArray()
   String sodokuLine <- getSodokuLine()
   for(int i <- 0; i < sodoku.length; i++)
      for(int j <- 0; j < sodoku[j].length; j++)
         sodoku[i][j] <- sodokuLine.charAt(j)
      sodokuLine <- getSodokuLine()
   return sodoku
*/
import java.util.*;
import java.io.*;
public class SodokuChecker {

	static File inFile;
	static File outFile;
	static PrintStream fileOutput;
	static Scanner sodokuScanner;
	static char [][]sodoku = new char [9][9];

	public static void main(String [] args) throws Exception{
		inFile = new File(args[0]);
		outFile = new File(args[1]);
		fileOutput = new PrintStream(outFile);
      sodokuScanner = new Scanner(inFile);
		fileOutput.println("Sodoku Checker\nWritten & Designed by Kyle Fagan\nCS101-01\n");
      while(sodokuScanner.hasNext()) {
         Sodoku puzzle1 = new Sodoku(convertLinesToTwoDArray());
         fileOutput.println(puzzle1.toString());
         puzzle1.evaluateSodoku();
         fileOutput.println(puzzle1.conclusion());
      }
 	}
      
	static String getSodokuLine() {
      String sodokuLine = ""; // init to empty String to avoid null
      while(sodokuScanner.hasNext()) {
         sodokuLine = sodokuScanner.nextLine();
         sodokuLine = sodokuLine.trim(); // remove whitespace on both sides
         sodokuLine = sodokuLine.replace('0', ' '); // all 0s turn to spaces
         break;
      }
      return sodokuLine;
	}

	static char[][] convertLinesToTwoDArray() {
		String sodokuLine = getSodokuLine();
		for(int i = 0; i < sodoku.length; i++) {
         for(int j = 0; j < sodoku[i].length; j++) {
            sodoku[i][j] = sodokuLine.charAt(j);
         }
         sodokuLine = getSodokuLine();
      }
      return sodoku;
	}
}