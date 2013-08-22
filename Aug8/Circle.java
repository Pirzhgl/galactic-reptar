// Write a class for circle
   // constructor, toString, mutator and accessor methods
   // area, circumference
   // use encapsulation
// Write a driver
// Kyle Fagan
// Phillip Kropp

public class Circle {
   
   private double radius;
   
   public Circle(double radius) {
      setRadius(radius);
   }
   
   // mutator
   
   public void setRadius(double radius) {
      if(radius >0) {
         this.radius = radius;
      }
      else {
         this.radius = 0;
      }
   }
   
   // accsessor
   
   public double getRadius() {
      return radius;
   }
   
   // circumfrence
   public double getCircumfrence(){
      return radius*Math.PI*2;
   }
   
   // area
   public double getArea() {
      return Math.PI*(radius*radius);
   } 
   
   // toString
   public String toString(){
      return "A circle with radius " + radius;
   }
}