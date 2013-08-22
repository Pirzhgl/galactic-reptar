import java.text.*;

public class Formatting {
   public static void main (String [] args) {
      DecimalFormat p1 = new DecimalFormat("$##,##0.00");
      double d = 1234567.2/7;
      System.out.println(p1.format(d)); // Prints in the predetermined format defined in DecimalFormat
      System.out.println(d);            // Prints just the numbers, no format.
      double e = .2345678;
      System.out.println(p1.format(e));
      System.out.println(e);
      DecimalFormat p2 = new DecimalFormat("###%");
      System.out.println(p2.format(d));
      System.out.println(p2.format(e));
      System.out.println(p2.format(0.0));
      DecimalFormat p3 = new DecimalFormat("000%");
      System.out.println(p3.format(d));
      System.out.println(p3.format(e));
      System.out.println(p3.format(0.0));
      
   }
}