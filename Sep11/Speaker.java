// Demonstrate polymorphism

public class Speaker {
   protected String name;
   public Speaker(String name) {
      this.name = name;
   }
   
   public String speak() {
      return name + " says: \"hello\"";
   }
}