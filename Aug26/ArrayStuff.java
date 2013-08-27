public class ArrayStuff {
   public static void main(String [] args) {
      // Declaring arrays
      
      int [] a;
      // a is reference to a sequence of ints.
      // to begin with, that sequence does not exist, the value in a is null.
      a = new int[5];
      // instantiate array
      a = new int[7+'a'];
      int numDice = 5;
      int maxPips = 10;
      a = new int[numDice*maxPips-numDice+1];
      
      int [] b = new int[4];
      // combine declaration and instantiation
      // What are the contents of the array?
      // Each slot has the value of zero
      // (for numerical array types)
      // unless and until you do something different.
      
      
      // intialize an array.
      int [] c = {1,2,3,4,5};
      // not allowed to separate initialization from declaration
 //      int [] d;
 //      d = {1,2,3,4,5};
 
   }
}