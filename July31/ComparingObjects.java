public class ComparingObjects {
   public static void main(String [] args) {
   
      // works
      String s = "cat";
      String r = "c" + "at";
      if (s == r)
         System.out.println("equal");
         
      // does not work, compares the contents of the 3 variables
      String d = "dog";
      String o = "d";
      o = o + "og";
      if (d == o)
         System.out.println("equal");
      else
         System.out.println("not equal");
         
         // use equals to compare strings, returns true
      System.out.println(d.equals(o)); // works, equal strings
      System.out.println(d.equals("Dog")); // no work becuase caps
      System.out.println(d.equalsIgnoreCase("Dog")); // works becuase 'ignore case'
      System.out.println(d.compareTo(o)); // returns 0 for exaclty equals
      System.out.println(s.compareTo("bat")); // 1 char diff (c to b) earlier
      System.out.println(s.compareTo("cdt")); // negative becuase comes later
      
      // conditional operator
      // ?: is a ternary operator
      // ugly - do not use in this class
      
      // write code for abs using ? :
      
      // first, use if else
      
      int x = -17;
      int absx = 0;
      
      if (x < 0)
         absx = -x;
      else
         absx = x;
      System.out.println(absx);
      
      
      // use the ugly ternary operator for the last and only time (in other words not using it again)
      int y = -17;
      int absy = 0;
      
      absy = (y < 0) ? -y : y;
      System.out.println(absy);
   }
}