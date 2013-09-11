public class Dog extends Philosopher {
   //"All dogs are good philosophers"
   
   public Dog(String name) {
      super(name);
   }
   
   public String speak() {
      return "woof";
   }
}