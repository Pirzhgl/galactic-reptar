public class CharLoops {
   public static void main(String [] args){
      
      for (char c = 'a'; c <= 'z'; c++) {
         System.out.print(c + "" + (char) (c - 'a' + 'A'));
      }
      
   } 
}