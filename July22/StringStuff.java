// Kyle Fagan
// Java API

public class StringStuff {
	public static void main(String [] args) {
		String s = new String(); // s is the empty string.
		String t = "abc"; // Shorthand notation. "abc" is a String object.
		String u = new String(t);
		System.out.println(t.charAt(0));
		System.out.println(u.charAt(2));
		System.out.println(u.concat(t)); // Also use the + sign
		String v = "Programming is fun."; // aww yiss
		int x = v.indexOf("ram");
		System.out.println(x); // To variable then print
		System.out.println(v.indexOf("ram")); // Alternate print right away
		System.out.println(v.length());
		System.out.println(v.charAt(v.length() -1));
		System.out.println(t.toUpperCase()); // converts string to upper case
		System.out.println(v.substring(4,7)); // Certian portion of the string
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}