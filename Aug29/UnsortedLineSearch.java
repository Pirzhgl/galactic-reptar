public class UnsortedLineSearch {
   public static void main(String [] args) {
      final int SEARCH_VALUE = 26;
      int [] a = MakeArray.unsorted(10,1,100);
      int location = MakeArray.search(a, SEARCH_VALUE);
      System.out.println(location);
      // call search method to return the location of the first occurance of value 26 returns -1 if not found
   }
   // create a sorted array. specify a starting value, array size, and a gap range.
   
   public static int[] sorted(int size, int start, int gap) {
      int [] a = new int[size];
      current = start -1;
      for(int i = 0; i < a.length; i++) {
         int current = current + (int)(Math.random()*gap) + 1;
         a[i] = current;
      }
      return a;
   }
}