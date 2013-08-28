import java.util.*;
public class CopyArray {
   public static void main(String [] args) {
      int [] a = {1,2,3,4,5};
      
      // assignment to copy?
      // No, this makes an alias of the object;
      // that is, we have two names (a and b)
      // for the same object.
      int [] b = a;
      System.out.println(b[2]);
      b[0] = 42;
      System.out.println(a[0]);
      
      // use a for loop and make the 
      //slot assignments individually
      
      int [] c = new int[a.length]; // make sure its the right size
      for (int i = 0; i < a.length; i++) {
         c[i] = a[i];
      }
      
      // Use of arraycopy() method
      int [] d = new int [10];
      System.arraycopy(a,1,d,4,3);
      
      int [] e = Arrays.copyOf(a.length);
      int [] f = Arrays.copyOf(a, 10);
      // pad extra elements with 0
      int [] g = Arrays.copyOf(a,3);
      // reduce the array size...cut it off
      
      
   }
}