public class BinarySearch {
   public static void main(String [] args) {
      int [] a = MakeArray.sorted(100000,-12345,2);
      int searchValue = 26;
      
      int location = search(a,searchValue);
      System.out.println(location);
   }
public static int search( int [] a, int value) {
   int smallIndex = 0;
   int largeIndex = a.length - 1;
   while(smallIndex <= largeIndex) {
      int middleIndex = (largeIndex - smallIndex)/2 + smallIndex;
      if (a[middleIndex] == value)
         return middleIndex;
      else if (a[middleIndex] > value) {
         largeIndex = middleIndex - 1;
      }
      else {
         smallIndex = middleIndex + 1;     
      }      
   }
   return -1;
}
}