public class PolymorphismDriver {
   public static void main(String [] args) {
      Speaker s = new Speaker("Bob");
      System.out.println(s.speak());
      // s will be polymorphic. i.e., it will have  multiple forms
      s = new President("Obama");
      System.out.println(s.speak());
      s = new Philosopher("Graeme");
      System.out.println(s.speak());
      s = new Dog("Rover");
      System.out.println("What is on a roof? " + s.speak() +".");
   }
}