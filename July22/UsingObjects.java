// Object examples 
// Using BigInteger
//
//
import java.math.*; // BigInteger is in the java.math package.
public class UsingObjects {
	public static void main (String [] args) {
		
		BigInteger b = new BigInteger("17"); // This constructs an object of type BigInteger. The variable b refers to it.
		BigInteger c = new BigInteger("732", 8);
		String s = b.toString();
		System.out.println(s);
		s = c.toString();
		System.out.println(s);
		
		BigInteger d = new BigInteger("12");
		BigInteger e = b.add(d);
		System.out.println(e.toString()); // Specifiy toString
		e = b.subtract(d);
		System.out.println(e); // Java will typecast as string for you
		e = d.subtract(b);
		System.out.println(e);
		System.out.println(e.abs());
		BigInteger f = null;
		System.out.println(f);
		e = b.add(f);
		
		
		
		
		
		
		
		
		
		
	}
}
