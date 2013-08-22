import java.util.*;
import java.io.*;
public class FileIO {
   public static void main(String [] args) throws Exception {
      // read froma  file and write to a file
      // where the file names are command line
      // arguments.
      
      // Read line sform the input file.
      // For each line input, read each String and
      // write that String on a separate line of output.
      // Separate output for the lines by and empty line.
      // Stop when an input line starts with 
      // "stop"
            
      File inFile = new File(args[0]);
      Scanner lineScan = new Scanner(inFile);
      File outFile = new File(args[1]);
      PrintStream writer = new PrintStream(outFile);
      
      // pumping methodology for input
      
      String line = lineScan.nextLine();
      while(!(line.startsWith("stop"))) {
         // process
         Scanner stringScan = new Scanner(line);
         while(stringScan.hasNext()) {
            String word = stringScan.next();
            writer.println(word);
         }
         writer.println();         
         // pump input
         line = lineScan.nextLine();
      }
      
      
   }
}