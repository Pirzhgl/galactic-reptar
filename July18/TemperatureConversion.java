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
			
      //***** 2.  declare temperature in Fahrenheit as an int 
	  	int temperatureFahrenheit = 100;
	  		
      //***** 3. calculate equivalent Celsius temperature
	  	double fsubtract = temperatureFahrenheit - 32;
		double fmultiply = fsubtract * 5;
		double fdivide = fmultiply / 9;
// 		System.out.println(fdivide);
	  	double temperatureCelsius = fdivide;
	  		
      //***** 4. output the temperature in Celsius
	   System.out.println(temperatureFahrenheit + " degrees Fahrenheit is equal to " + temperatureCelsius + " degrees Celcius");
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
		int outputFahrenheit = (int)(((temperatureCelsius * 9) / 5) + 32);
				
      //***** 6. output Fahrenheit temperature to check correctness 
		System.out.println( temperatureCelsius + " degrees C should be equal to " + outputFahrenheit + " degrees F.");
		
				
   }
} 