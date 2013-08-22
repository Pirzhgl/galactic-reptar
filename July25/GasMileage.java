// Compute Gas Mileage given input of number of gallons and miles travelled
// Kyle Fagan
// CS101-01
// July 25, 2013
// ACTUALLY NOTES ON HOW TO DO THE DATA TABLE AND HOW TO DO THE ALGORITHM

import java.util.*;

public class GasMileage {
/*
                                             Data Table
                                             ==========
                                             
               Variable or Constant                               Purpose
               ____________________                               _______
               args                                               parameter for main method, not actually used
               numberOfGallons                                    gasoline used in gallons
               numberOfMiles                                      miles travelled
               milesPerGallon                                     gas milage
               keyboard                                           Scanner object for input

*/
/*
   Algorithm
main(args)
   keyboard = new Scanner(System.in)
   ask user to input number of gallons
   numberOfGallons = keyboard.nextDouble()
   ask user to input number of miles
   numberOfMiles = keyboard.nextDouble()
   milesPergallon = numberOfMiles / numberOfGallons
   display milesPerGallon
   
*/
   public static void main(String [] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter number of gallons used ");
      double numberOfGallons = keyboard.nextDouble();
      System.out.print("Enter miles driven ");
      double numberOfMiles = keyboard.nextDouble();
      double milesPerGallon = numberOfMiles / numberOfGallons;
      System.out.println("Miles per gallon is " + milesPerGallon);
   }
}