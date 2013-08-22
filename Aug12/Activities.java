public class Activities {
   public static void main(String [] args) {
      Building b = Building.AB;
      switch(b) {
         case AB: System.out.println("Do CS"); break;
         case Mott: System.out.println("Chem Lab"); break;
         case CC: System.out.println("Lunch time"); break;
         
      }
   }
}