public class Sort {
   
   
   
      public static void Improved2Bubble(int[] a) {
      boolean sorted = false;
      int bottomIndex = a.length; // acutally one too big
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(a[i] > a[i+1])
               swap(a, i, i+1);
               sorted = false; 
         }
      }
   }

   
   public static void selection(int [] a) {
      for (int select = 0; select < a.length - 1; select++) {
         int smallIndex = findMin(a, select);
         swap(a, select, smallIndex);
      }
   }
   
   public static void Improved1Bubble(int[] a) {
      int bottomIndex = a.length; // acutally one too big
      for(int pass = 0; pass < a.length - 1; pass++) {
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(a[i] > a[i+1])
               swap(a, i, i+1);  
         }
      }
   }
   
   public static void swap(int [] a, int ind1, int ind2) {
      int temp = a[ind1];
      a[ind1] = a[ind2];
      a[ind2] = temp;
   }
   
   public static int findMin(int [] a, int start) {
      int smallIndex = start;
      for (int i = start + 1; i < a.length; i++) {
         if( a[i] < a[smallIndex])
            smallIndex = i;
      }
      return smallIndex;
   }
}