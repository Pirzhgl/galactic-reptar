/**
 * Course class for creating Course objects.
 * A Course consists of a name, a number, a building, and the number of students in a course
 * File: Course.java
 * Designer: Dr. Vineyard
 * Implementor: Kyle Fagan
 * Organization: CS101-01
*/

/**
 * Data Table
 * Variable          Usage
 * ========          =====
 * name              String data for Course name
 * number            integer for Course number
 * MAX_STUDENTS      constant value, maximum number of students in a Course
 * numberOfStudents  total number of students in a course
 * building          String data for the buidling the Course is located
 * roomNumber        number of the room the Course is in
*/

public class Course {

   private String name;
   private int number;
   public final static int MAX_STUDENTS = 40;
   private int numberOfStudents;
   private String building;
   private int roomNumber;
   
   /**
    * Course constructor initializes name, number, location and room number
    * 
    * algorithm:
    * this.name <-- name
    * this.number <-- number
    * numberOfStudents <-- 0
    * this.building <-- building
    * roomNumber <-- room
   */
   public Course(String name, int number, String building, int room) {
      this.name = name;
      this.number = number;
      numberOfStudents = 0;
      this.building = building;
      roomNumber = room;
   }
   
   /**
    * addStudent increases numberOfStudents by its argument, students
    * 
    * algorithm:
    * numberOfStudents <-- numberOfStudents + students
    *
   */
   public void addStudents(int students){
      numberOfStudents = numberOfStudents + students;
   }
   
   /**
    * dropStudents decreases numberOfStudents by its arguement, students
    * 
    * algorithm:
    * numberOfStudents <-- numberOfStudents - students
    *
   */
   public void dropStudents(int students) {
      numberOfStudents = numberOfStudents - students;
   }
   
   /**
    * getCourseNumber returns the number of the Course
    * 
    * algorithm:
    * return number
    *
   */
   public int getCourseNumber() {
      return number;
   }
   
   /**
    * getNumberOfStudents returns numberOfStudents in the Course
    * 
    * algorithm:
    * return numberOfStudents
    *
   */
   public int getNumberOfStudents() {
      return numberOfStudents;
   }
   
   /**
    * getCourseName returns the name of the Course
    * 
    * algorithm:
    * return name
    *
   */
   public String getCourseName() {
      return name;
   }
   
   /**
    * getBuilding returns the building of the Course
    * 
    * algorithm:
    * return building
    *
   */
   public String getBuilding() {
      return building;
   }
   
   /**
    * getRoomNumber returns the room number of the Course
    * 
    * algorithm:
    * return roomNumber
    *
   */
   public int getRoomNumber() {
      return roomNumber;
   }
   
   /**
    * toString returns the current state of the Course object
    *
    * algorithm:
    * return name, numberOfStudents, building, and roomNumber as String
    *
   */
   public String toString() {
      return name + " Course Number " + number + " Number of Students " + 
         numberOfStudents + " Building " + building + " Room Number " 
         + roomNumber;
   }
}