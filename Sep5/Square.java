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
}