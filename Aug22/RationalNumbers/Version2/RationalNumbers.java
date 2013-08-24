/*
   Kyle Fagan
   CS101-01
   VERSION 1.0
   Due Date: August 26, 2013
   Class Description: main method for the RationalNumbers project
*/
/*
               Data Table
               ==========
     Variables             Purpose
     =========             =======
     args                  not actually used
*/
/*
   Algorithm
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
      while(!(lineOfFile.regionMatches(true, 0, "quit", 0, 3))) {
         // need a new fraction each iteration
         GetFraction getFraction = new GetFraction();
         Fraction fraction = new Fraction(getFraction.getNumerator(), 
         getFraction.getDenominator());
         
                         
         fileOutput.println(lineOfFile);
         fileOutput.println(fraction.reduce());
         fileOutput.println(fraction.perform());
         lineOfFile = fileInput.nextLine();
      }
 
   
   }
}