public class Overloading {
   
   private int instVar1;
   private int instVar2;
   
   public Overloading() {
      // Assign a default value of 1 to the instance variables.
     //  instVar1 = 1;
     //  instVar2 = 1;
     // The above code works fine. 
     // More oftehn, code calls an already exisiting constructor
     this(1, 1);
   }
   public Overloading(int v1, int v2) {
      instVar1 = v1;
      instVar2 = v2;
   }
   
   public int sum() {
      return instVar1 + instVar2;
   }
   
   public int sum(int a) {
      return a + instVar1 + instVar2;
   }
   
   public double sum(double a) {
      return a + instVar1+ instVar2;
   }
   // public Overloading(int a, int b) {
   //    instVar1 = a;
   //     instVar2 = b;
   //  }
}