// extends means is a sublcass of
public class Square extends Rectangle {
   // no instance variables needed, inherit
   // length and width from Rectangle
   
   public Square(int side) {
      super(side, side); // calls Rectangle constructor
   }
   
   public int getSide() {
      return width;
   }
   
   public String toString() { // string in the subclass overrides the toString in the super
      return "A square with side " + width;
   }
}