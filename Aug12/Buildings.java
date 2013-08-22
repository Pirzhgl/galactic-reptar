public class Buildings {
   enum Building {
      Mott,
      AB,
      CC
   }
   
   public static void main(String [] args) {
      Building a = Building.AB;
      Building b = Building.Mott;
      Building c = Building.CC;
      
      switch (b) {
         case AB:System.out.println("Do CS");break;
         case Mott:System.out.println("Chem Lab");break;
         case CC: System.out.println("Lunch time"); break;
      }
      System.out.println(a.compareTo(b));
      System.out.println(a.compareTo(a));
      System.out.println(a.compareTo(c));
      
      Building d = Building.AB;
      System.out.println(a.equals(d));
      System.out.println(a.compareTo(b));
      
      System.out.println(c.ordinal());
      System.out.println(c.toString());
      
      Building e = Building.valueOf("CC");
      System.out.println(e.toString());
   }
}