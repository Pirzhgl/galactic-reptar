public class President extends Speaker {
   public President (String name) {
      super(name);
   }
   
   public String speak() {
      return name + " says: \"No troop boots on ground\"";
   }
}