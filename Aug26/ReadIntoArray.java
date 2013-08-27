import java.util.*;
public class ReadIntoArray {
   public static void main(String [] args) {
      int [] a = new int [4];
      Scanner in = new Scanner(System.in);
      for(int i = 0; i < a.length; i++) {
         System.out.print("enter next number: ");
         a[i] = in.nextInt();
      }
      for(int i = 0; i < a.length; i++) {
         System.out.print(a[i]);
      }
      for(int i=a.length-1;i>=0;i--) {
         System.out.print(a[i]);
      }
   }
}