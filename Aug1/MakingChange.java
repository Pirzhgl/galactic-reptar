/*
	Kyle Fagan
	CS101-01
	Due Date: August 8, 2013
	Class Description:
   This class will accept an input of a purchase amount in integers, 
   then read the number of bills used to pay.
	After this, the class will calculate if the user did not give 
   enough money, exact change, or requires change.
*/
/*
								Data Table
								==========
		Variable or Constant					Description
		====================					===========
		args									Parameter for main method, not actually used
		DOLLARS_TO_CENTS						Used to go between dollars and cents
		QUARTERS_VALUE							Multiply the user input by the value of a quarter 
		DIME_VALUE								Multiply the user input by the value of a dime
		NICKEL_VALUE							Multiply the user input by the value of a nickel
		PENNY_VALUE								Multiply the user input by the value of a penny
		VALUE_OF_TWENTY							Multiply the user input by the value of a $20 bill
		VALUE_OF_TWENTY							Multiply the user input by the value of a $10 bill
		VALUE_OF_FIVE							Multiply the user input by the value of a $5 bill
		VALUE_OF_ONE							Multiply the user input by the value of a $1 bill
		userInput								Scanner object used to gather user input
		dollars 								User input for dollar amount of purchase
		cents 									User input for cents amount of purchase
		twenties 								User input for number of $20 bills
		tens 									User input for number of $10 bills
		fives 									User input for number of $5 bills
		ones 									User input for number of $1 bills
		quarters 								User input for number of quarters
		dimes 									User input for number of dimes
		nickels 								User input for number of nickels
		pennies 								User input for number of pennies
		cashFormatDollars 						DecimalFormat object that displays the purchase amount
												  and tender amount
		cashFormatCents							DecimalFormat object that displays the purchase amount
												  and tender amount
		convertedTwenties						Value of 'twenties' converted to change
		convertedTens 							Value of 'tens' converted to change
		convertedFives 							Value of 'fives' converted to change
		convertedOnes 							Value of 'ones' converted to change
		convertedQuarters 						Value of 'quarters' converted to true value
		convertedDimes 							Value of 'dimes' converted to true value
		converedNickels 						Value of 'nickels' converted to true value
		convertedPennies 						Value of 'pennies' converted to true value
		inputTotal								User's inputted dollars plus cents, converted to change
		tenderTotal 							User's inputted bill and coin values summed together after
												  being converted
		totalDifference 						Difference between 'tenderTotal' and 'inputTotal'
		loopTwenties							Used inside for loop to calculate how many 20s should be
												  returned
		loopTens 								Used inside for loop to calculate how many 10s should be
												  returned
		loopFives 								Used inside for loop to calculate how many 5s should be
												  returned
		loopOnes 								Used inside for loop to calculate how many 1s should be
												  returned
		loopQuarters							Used inside for loop to calculate how many quarters
												  should be returned
		loopDimes								Used inside for loop to calculate how many dimes
												  should be returned
		loopNickels 							Used inside for loop to calculate how many nickels
												  should be returned
		loopPennies 							Used inside for loop to calculate how many pennies
												  should be returned

*/
/*
	Algorithm
main (args)
	final int DOLLARS_TO_CENTS = 100
	final int QUARTERS_VALUE = 25
	final int DIME_VALUE = 10
	final int NICKEL_VALUE = 5
	final int PENNY_VALUE = 1
	final int VALUE_OF_TWENTY = 20
	final int VALUE_OF_TEN = 10
	final int VALUE_OF_FIVE = 5
	final int VALUE_OF_ONE = 1
	Scanner userInput = new Scanner from standard input
	initialize dollars to 0
	initialize cents to 0
	initialize twenties to 0
	initialize tens to 0
	initialize fives to 0
	initialize ones to 0
	initialize quarters to 0
	initialize dimes to 0
	initialize nickels to 0
	initialize pennies to 0
	DecimalFormat cashFormatDollars = new DecimalFormat "999,999."
	DecimalFormat cashFormatCents = new DecimalFormat "00"
	Ask for amount of purchase (dollars)
	dollars = nextInt()
	Ask for amount of purchase (cents)
	cents = nextInt()
	Ask for amount of $20 bills
	twenties = nextInt()
	Ask for amount of $10 bills
	tens = nextInt()
	Ask for amount of $5 bills
	fives = nextInt()
	Ask for amount of $1 bills
	ones = nextInt()
	Ask for amount of quarters
	quarters = nextInt()
	Ask for amount of dimes
	dimes = nextInt()
	Ask for amount of nickels
	nickels = nextInt()
	Ask for amount of pennies
 	pennies = nextInt()
 	int convertedTwenties = twenties * DOLLARS_TO_CENTS * VALUE_OF_TWENTY
 	int convertedTens = tens * DOLLARS_TO_CENTS * VALUE_OF_TEN
 	int convertedFives = fives * DOLLARS_TO_CENTS * VALUE_OF_FIVE
 	int convertedOnes = ones * DOLLARS_TO_CENTS * VALUE_OF_ONE
 	int convertedQuarters = quarters * QUARTERS_VALUE
 	int convertedDimes = dimes * DIME_VALUE
 	int convertedNickels = nickels * NICKEL_VALUE
 	int convertedPennies = pennies * PENNY_VALUE
 	int inputTotal = dolllars * DOLLARS_TO_CENTS + cents
 	int tenderTotal = all converted values added together
 	int totalDifference = tenderTotal - inputTotal
 	Print out name
 	Print out section number
 	Print formatted inputTotal
 	Print formatted tenderTotal
 	if (difference between input and tender is zero)
 		print no change to be given
 	else if (difference between input and tender is > zero)
 		int loopTwenties = 0
 		int loopTens = 0
 		int loopFives = 0
 		int loopOnes = 0
 		int loopQuarters = 0
 		int loopDimes = 0
 		int loopNickels = 0
 		int loopPennies = 0
 		Print message saying there is change to be returned
 		for (i = totalDifference; i >=  $20; subtract $20 from i)
 			increment loopTwenties
 			calculate new totalDifference by subtracting $20
 		for (i = totalDifference; i >= $10; subtract $10 from i)
 			increment loopTens
 			calculate new totalDifference by subtracting $10
 		for (i = totalDifference; i >= $5; subtract $5 from i)
 			increment loopFives
 			calculate new totalDifference by subtracting $5
 		for (i = totalDifference; i >= $1; subtract $1 from i)
 			increment loopOnes
 			calculate new totalDifference by subtracting $1
 		for (i = totalDifference; i >= $0.25; subtract $0.25 from i)
 			increment loopQuarters
 			calculate new totalDifference by subtracting $0.25
 		for (i = totalDifference; i >= $0.10; subtract $0.10 from i)
 			increment loopDimes
 			calculate new totalDifference by subtracting $0.10
 		for (i = totalDifference; i >= $0.05; subtract $0.05 from i)
 			increment loopNickels
 			calculate new totalDifference by subtracting $0.05
 		for (i = totalDifference; i >= $0.01; subtract $0.01 from i)
 			increment loopOnes
 			calculate new totalDifference by subtracting $0.01
 		if (loopTwenties > 0)
 			print loopTwenties
 		if (loopTens > 0)
 			print loopTens
 		if (loopFives > 0)
 			print loopFives
 		if (loopOnes > 0)
 			print loopOnes
 		if (loopQuarters > 0)
 			print loopQuarters
 		if (loopDimes > 0)
 			print loopDimes
 		if (loopNickels > 0)
 			print loopNickels
 		if (loopPennies > 0)
 			print loopPennies
 	elseif (totalDifference < 0)
 		print formatted dollar value of totalDifference
 		print more money is required

*/


import java.util.*;
import java.math.*;
import java.text.*;

public class MakingChange {
	public static void main(String [] args) {

		// Dollars to cents conversion
		final int DOLLARS_TO_CENTS = 100;
		final int QUARTERS_VALUE = 25;
		final int DIME_VALUE = 10;
		final int NICKEL_VALUE = 5;
		final int PENNY_VALUE = 1; // Because I have OCD

		// Values of bills in terms of dollars
		final int VALUE_OF_TWENTY = 20;
		final int VALUE_OF_TEN = 10;
		final int VALUE_OF_FIVE = 5;
		final int VALUE_OF_ONE = 1; // Because I have OCD

		// User input variables
		Scanner userInput = new Scanner(System.in);

		int dollars = 0;
		int cents = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;

		// Format
		DecimalFormat cashFormatDollars = new DecimalFormat("###,##0.");
		DecimalFormat cashFormatCents = new DecimalFormat("00");

		/*--------INPUT-----------*/

		System.out.print("Enter dollar amount of purchase: ");
		dollars = userInput.nextInt();
		System.out.print("Enter cent amount of purchase: ");
		cents = userInput.nextInt();
		System.out.print("Enter the amount of $20 bills: ");
		twenties = userInput.nextInt();
		System.out.print("Enter the amount of $10 bills: ");
		tens = userInput.nextInt();
		System.out.print("Enter the amount of $5 bills: ");
		fives = userInput.nextInt();
		System.out.print("Enter the amount of $1 bills: ");
		ones = userInput.nextInt();
		System.out.print("Enter the amount of quarters: ");
		quarters = userInput.nextInt();
		System.out.print("Enter the amount of dimes: ");
		dimes = userInput.nextInt();
		System.out.print("Enter the amount of nickels: ");
		nickels = userInput.nextInt();
		System.out.print("Enter the amount of pennies: ");
		pennies = userInput.nextInt();

		// Convert input in terms of cents
		int convertedTwenties = twenties*DOLLARS_TO_CENTS*VALUE_OF_TWENTY;
		int convertedTens = tens*DOLLARS_TO_CENTS*VALUE_OF_TEN;
		int convertedFives = fives*DOLLARS_TO_CENTS*VALUE_OF_FIVE;
		int convertedOnes = ones*DOLLARS_TO_CENTS*VALUE_OF_ONE;
		int convertedQuarters = quarters*QUARTERS_VALUE;
		int convertedDimes = dimes*DIME_VALUE;
		int convertedNickels = nickels*NICKEL_VALUE;
		int convertedPennies = pennies*PENNY_VALUE;

		// Sum user input for a total
		int inputTotal = (dollars*DOLLARS_TO_CENTS) + cents;
		int tenderTotal = convertedTwenties + convertedTens + convertedFives + convertedOnes + convertedQuarters + convertedDimes + convertedNickels + convertedPennies;
		int totalDifference = tenderTotal - inputTotal;

		/* -------OUTPUT---------*/

      // Print out name and section number
      System.out.println("Change making program");
      System.out.println("Kyle Fagan. CS101-01.");

		// Print amount of purchase
		System.out.println("The amount of the purchase is: $" + cashFormatDollars.format(dollars) + cashFormatCents.format(cents));


		// Print amount tendered
		System.out.println("The amount tendered is: $" + cashFormatDollars.format((tenderTotal/DOLLARS_TO_CENTS)) + cashFormatCents.format((tenderTotal%DOLLARS_TO_CENTS)));

		// Exact change
		if (totalDifference == 0) {
			System.out.println("Exact change given. No change to be returned.");
		}
		// Change required
		else if (totalDifference > 0) {

			// Init Loop variables
			int loopTwenties = 0;
			int loopTens = 0;
			int loopFives = 0;
			int loopOnes = 0;
			int loopQuarters = 0;
			int loopDimes = 0;
			int loopNickels = 0;
			int loopPennies = 0;

			// Print message that states change is returned, then follow with denominations...
			System.out.println("Change Returned: ");
			
			// Calculate the number of twenties
			for(int i = totalDifference; i >= VALUE_OF_TWENTY*DOLLARS_TO_CENTS; i = i - VALUE_OF_TWENTY*DOLLARS_TO_CENTS) {
				loopTwenties++;
				totalDifference = totalDifference - VALUE_OF_TWENTY*DOLLARS_TO_CENTS;
			}
			// 10s
			for(int i = totalDifference; i >= VALUE_OF_TEN*DOLLARS_TO_CENTS; i = i - VALUE_OF_TEN*DOLLARS_TO_CENTS) {
				loopTens++;
				totalDifference = totalDifference - VALUE_OF_TEN*DOLLARS_TO_CENTS;
			}
			// 5s
			for(int i = totalDifference; i >= VALUE_OF_FIVE*DOLLARS_TO_CENTS; i = i - VALUE_OF_FIVE*DOLLARS_TO_CENTS) {
				loopFives++;
				totalDifference = totalDifference - VALUE_OF_FIVE*DOLLARS_TO_CENTS;
			}
			// 1s
			for(int i = totalDifference; i >= VALUE_OF_ONE*DOLLARS_TO_CENTS; i = i - VALUE_OF_ONE*DOLLARS_TO_CENTS) {
				loopOnes++;
				totalDifference = totalDifference - VALUE_OF_ONE*DOLLARS_TO_CENTS;
			}
			// .25s
			for(int i = totalDifference; i >= QUARTERS_VALUE; i = i - QUARTERS_VALUE) {
				loopQuarters++;
				totalDifference = totalDifference - QUARTERS_VALUE;
			}
			// .1s
			for(int i = totalDifference; i >= DIME_VALUE; i = i - DIME_VALUE) {
				loopDimes++;
				totalDifference = totalDifference - DIME_VALUE;
			}
			// .05s
			for(int i = totalDifference; i >= NICKEL_VALUE; i = i - NICKEL_VALUE) {
				loopNickels++;
				totalDifference = totalDifference - NICKEL_VALUE;
			}
			// .01s
			for(int i = totalDifference; i >= PENNY_VALUE; i = i - PENNY_VALUE) {
				loopPennies++;
				totalDifference = totalDifference - PENNY_VALUE;
			}

			// Print how many of each denomination to return
			// if zero do not print denomination
			if (loopTwenties > 0) {
				System.out.println(loopTwenties + " twenty(ies) back.");
			}

			if (loopTens > 0) {
				System.out.println(loopTens + " ten(s) back.");
			}

			if (loopFives > 0) {
				System.out.println(loopFives + " five(s) back.");
			}

			if (loopOnes > 0) {
				System.out.println(loopOnes + " one(s) back.");
			}

			if (loopQuarters > 0) {
				System.out.println(loopQuarters + " quarter(s) back.");
			}

			if (loopDimes > 0) {
				System.out.println(loopDimes + " dime(s) back.");
			}

			if (loopNickels > 0) {
				System.out.println(loopNickels + " nickel(s) back.");
			}

			if (loopPennies > 0) {
				System.out.println(loopPennies + " penny(ies) back.");
			}

		}
		// Require more money
		else if (totalDifference < 0) {
			System.out.println((Math.abs(totalDifference/100)) + "." + (Math.abs(totalDifference%100)) + " more money is required to complete transaction.");
		}


	}
}