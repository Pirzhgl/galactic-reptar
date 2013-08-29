public class MakeArray {
   // create an int array that is unsored
   // the array size, the largets possible and smallest possible
   // values are parameters.
   public static int[] unsorted(int size, int smallest, int largest) {
      int[] a = new int[size];
      int range = largest - smallest + 1;
      for (int i = 0; i < a.length; i++) {
         a[i] = (int)(Math.random() * range) + smallest;
      }
      return a;
   }
   
   public static int search(int [] a, int value) {
         for( int i = 0; i < a.length; i++) {
            if(a[i] == value)
               return i;
         }
         return -1;
   }
}