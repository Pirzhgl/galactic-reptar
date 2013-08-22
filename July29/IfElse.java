public class IfElse {
   // I want to add one to b and c if a is the middle value. Add 1 to a otherwise
   public static void main(String [] args) {
      int a = 1, b = 2, c = 3;
      if (((a > b) && ( a < c)) || (( a < c) && (a < b))) {
       b++;
         c++;
       }
      else
         a++;
      System.out.println(a + "\t" + b + "\t" + c);
   }
}