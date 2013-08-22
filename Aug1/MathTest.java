import java.util.*;
import java.text.*;
public class MathTest {
   public static void main(String [] args) {
      DecimalFormat d1 = new DecimalFormat("###,##0.");
      DecimalFormat d2 = new DecimalFormat("#0");
      int i = 123456;
      int b = 12;
      System.out.println(d1.format(i)+(d2.format(b)));
   }
}