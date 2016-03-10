/* Temperature Conversion
   Anderson, Franceschi
	
	Student: Kyle Fagan
	CS-101-01
	July 18, 2013
	Class description: converts a Fahrenheit temp. to a Celsius temp., prints the result then converts
	back to Fahrenheit and prints the result.
*/

public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
		final double FREEZING_POINT = 32.0;
      //***** 2.  declare temperature in Fahrenheit as an int 
	  	int temperatureFahrenheit = 100;
	  		
      //***** 3. calculate equivalent Celsius temperature
	  	double c = (temperatureFahrenheit - FREEZING_POINT) * ((double) 5 / 9);
// 		System.out.println(fdivide);
	  	//double temperatureCelsius = fdivide;
	  		
      //***** 4. output the temperature in Celsius
	   System.out.println("Celsius: " + c);
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
		temperatureFahrenheit = (int)(((double) 9 / 5) * c + FREEZING_POINT);
				
      //***** 6. output Fahrenheit temperature to check correctness 
		System.out.print("Fahrenheit " + temperatureFahrenheit);
   }
} 
