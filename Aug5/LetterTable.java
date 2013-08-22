// Kyle Fagan
// Phil Kropp
// CS101-01
// Class that prints a table of a-z
// 
public class LetterTable {
   public static void main(String [] args){
      
      for(char phil = 'a'; phil <= 'z'; phil++) {
         for(char kyle = phil; kyle <= 'z'; kyle++) {
            System.out.print(phil);
            System.out.print(kyle);
            System.out.print(" ");
         }
         System.out.println();
      }
      
   }
}