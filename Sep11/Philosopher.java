public class Philosopher extends Speaker {
   public Philosopher(String name) {
      super(name);
   }
   
   public String speak() {
      return name + " says: \"I think.\n Therefore I am.\n I think.\"";
   }
}