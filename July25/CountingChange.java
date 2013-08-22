/*
   Kyle Fagan
   CS101-01
   Project 1 - Counting Change
   August 1, 2013
   
   This class has the user input values for change (quaters, dimes, etc.) and adds the change and outputs a
   final total for the amount of money the user has.
*/
import javax.swing.*; // JOptionPane
import java.text.*;   // Convert strings to primtive types

public class CountingChange {

/*
                                       Data Table
                                       ==========
                                               
                  Variable or Constant              Purpose
                  ====================              =======
                  args                              parameter for main method, not actually used
                  valueOfQuarter                    constant double value that represents the value of a quarter
                  valueOfDime                       constant double value that represents the value of a dime
                  valueOfNickel                     constant double value that represents the value of a nickel
                  valueOfPenny                      constant double value that represents the value of a penny
                  quarters                          holds a string value for the number of quarters
                  numberOfQuarters                  used for converting string number of quarters to an int value
                                                      for integer math
                  dimes                             holds a string value for the number of dimes
                  numberOfDimes                     used for converting string number of dimes to an int value
                                                      for integer math
                  nickels                           holds a string value for the number of nickels
                  numberOfNickels                   used for converting string number of nickels to an int value
                                                      for integer math
                  pennies                           holds a string value for the number of penneis
                  numberOfPennies                   used for converting string number of nickels to an int value 
                                                      for integer math
                  calculatedQuarters                double value of a quarter in terms of dollars
                  calculatedDimes                   double value of a dime in terms of dollars
                  calculatedNickels                 double value of a nickel in terms of dollars
                  calculatedPennies                 double value of a penny in terms of dollars
                  totalCash                         sum of all the calculated values for quarters, nickels,
                                                       dimes, and pennies
                        
                        
                        
*/

/*
   Algorithm
main (args)
   double valueOfQuarter = .25
   double valueOfDime = 0.1
   double valueOfNickel = .05
   double valueOfPenny = .01
   String quarters = JOptionPane user input of number of quarters
   int numberOfQuarters = parseInt(quarters)
   String dimes = JOptionPane user input of number of dimes
   int numberOfDimes = parseInt(dimes)
   String nickels = JOptionPane user input of number of dimes
   int numberofNickels = parseInt(nickels)
   String pennies = JOptionPane user input of number of pennies
   int numberOfPennies = parseInt(pennies)
   double calculatedQuarters = numberOfQuarters * valueOfQuarter
   double calculatedDimes = numberOfDimes * valueOfDime
   double calculatedNickels = numberOfNickels * valueOfNickel
   double calculatedPennies = numberOfPennies * valueOfPenny
   double totalCash = addition of all calculated change values
   DecimalFormat cashFormat = $#,##0.00
   Output totaCash in cashFormat in a JOptionPane
*/
   public static void main(String [] args) {
      
      // Declare constant multipliers that are equal to the value of quarter, dimes, etc.
      final double valueOfQuarter = 0.25;
      final double valueOfDime = 0.10;
      final double valueOfNickel = 0.05;
      final double valueOfPenny = 0.01;
      
      // User input for quarters, dimes, nickels, pennies
      String quarters = JOptionPane.showInputDialog(null, "Enter the number of quarters you have.");
      int numberOfQuarters = Integer.parseInt(quarters);
      String dimes = JOptionPane.showInputDialog(null, "Enter the number of dimes you have.");
      int numberOfDimes = Integer.parseInt(dimes);
      String nickels = JOptionPane.showInputDialog(null, "Enter the number of nickels you have.");
      int numberOfNickels = Integer.parseInt(nickels);
      String pennies = JOptionPane.showInputDialog(null, "Enter the number of pennies you have.");
      int numberOfPennies = Integer.parseInt(pennies);
      
      // Calculate the money value of quarters, dimes, nickels, pennies
      double calculatedQuarters = numberOfQuarters*valueOfQuarter;
      double calculatedDimes = numberOfDimes*valueOfDime;
      double calculatedNickels = numberOfNickels*valueOfNickel;
      double calculatedPennies = numberOfPennies*valueOfPenny;
      
      // Total the results
      double totalCash = calculatedQuarters + calculatedDimes + calculatedNickels + calculatedPennies;
      
      // Output results
      DecimalFormat cashFormat = new DecimalFormat("$#,##0.00"); // format
      JOptionPane.showMessageDialog(null, "All your change is worth " + cashFormat.format(totalCash) + " !");
         
   }
}