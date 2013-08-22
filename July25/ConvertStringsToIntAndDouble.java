// Kyle Fagan
// CS101-01
// July 25, 2013
// Class that uses JOptionPane for all I/O, asks the user for age and prints the age 5 years and 13 years.
// Also asks for a dollar amount and prints the amount in a pretty format, also divides the amount by 3 and prints
// the result.

import javax.swing.*; // JOptionPane
import java.text.*;   // Formatting

public class ConvertStringsToIntAndDouble {
   public static void main(String [] args){
      // Age Section
       String age = JOptionPane.showInputDialog(null, "Please enter your age");
       int agePlusFive = (Integer.parseInt(age)) + 5;
       int agePlusThirteen = (Integer.parseInt(age)) +13;
       JOptionPane.showMessageDialog(null, "Your age in 5 years is " + agePlusFive);
       JOptionPane.showMessageDialog(null, "Your age in 13 years is " + agePlusThirteen);
      
      // Money section
      DecimalFormat cashFormat = new DecimalFormat("$###,###,##0.00");
      String cash = JOptionPane.showInputDialog(null, "Please enter an amount of money");
      double cashDouble = (Double.parseDouble(cash));
      JOptionPane.showMessageDialog(null, "The amount of money you entered divided by three is: " + cashFormat.format(cashDouble/3.0));      
      
      
      
      
      
      
      
      
      
   }   
}