/*Timothy Haskins
	Kyle Fagan
*/

public class SwitchStatementPartners
{
	public static void main(String [] args)
	{
		//base 3 has digits 0, 1, and 2
		//Use Strings
		String digit = "One";
		int digitValue = -1;
		//add break statements to switch
		//otherwise we do not stop
		if(digit.equalsIgnoreCase("zero"))
		{
			System.out.println("zero");
			digitValue = 0;
		}
		else if(digit.equalsIgnoreCase("one"))
		{
			System.out.println("one");
			digitValue = 1;
		}
		else if(digit.equalsIgnoreCase("two"))
		{
			System.out.println("two");
			digitValue = 2;
		}
		else 
		{
			System.out.println("not a base 3 digit");
			digitValue = -42;
		}
		/*
		switch (digit.toLowerCase())
		{
			case "zero": System.out.println("zero");
						 digitValue = 0;
						 break;
			case "one": System.out.println("one");
						 digitValue = 1;
						 break;
			case "two": System.out.println("two");
						 digitValue = 2;
						 break;
			default: System.out.println("not a base 3 digit");
						 digitValue = -42;
		}
		*/
	}
}