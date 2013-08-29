public class SortedLineSearch {

   public static void main(String [] args) {
      final int SEARCH_VALUE = 26;
      int [] a = MakeArray.unsorted(10,1,100);
      int location = MakeArray.search(a, SEARCH_VALUE);
      System.out.println(location);
      // call search method to return the location of the first occurance of value 26 returns -1 if not found
   }
   // search a sorted array???????????????????
   public static int search(int [] a, int value) {
      int index = 0;
      while( index < a.length && a[index] < value) {
         index++;
      }
      if (index == a.length) {
         return -1;
      }
      if (a[index] != value) {
         return -1;
      }
      return index;
  }
}