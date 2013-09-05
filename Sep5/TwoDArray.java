public class TwoDArray {
   public static void main(String [] args) {
      // int [] [] [] [] [] [] [] []a;
      int [] [] a;
      a = new int [3] [4];
      a[1] [2] = 7;
      a[2] [3] = 19;
//       System.out.println(a[1][2]);
//       System.out.println(a[1][3]);
      
      int [][] b = new int [4] [];
      b[0] = new int [5];
      b[1] = new int [6];
      b[2] = new int [7];
      b[3] = new int [8];
      
      int [] [] c = {{1,2,3},
                     {4,5,6,7},
                     {8,9,},
                     {10,11,12,13,14}};
      for(int i = 0; i < c.length; i++) { // normal for loop w/ arrays
         for(int j = 0; j < c[i].length; j++){ // becuase c[i] is the array we are in now
            System.out.print(c[i] [j] + "\t");
         }
         System.out.println();
      }
      
      
      
         }
}