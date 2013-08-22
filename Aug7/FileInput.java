import java.util.*;
import java.io.*;

public class FileInput {
   public static void main(String [] args) throws Exception {
      // read intergers froma  file. 
      // echoprint all the inputs.
      // print the sum.
      
      // speicify the name of the file as a command line argument - use args
      
      Scanner in = new Scanner(new File(args[0]));
      
      int sum = 0;
      while (in.hasNextInt()) {
         int value = in.nextInt();
         System.out.println(value);
         sum += value;
      }
      System.out.println("sum is " + sum);
   }
}