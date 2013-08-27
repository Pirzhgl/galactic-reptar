public class RectnagleArray {
   public static void main(String [] args) {
      // arrays of objects
      Rectangle [] r = new Rectangle [5];
      for(int i = 0; i <r.length; i++) {
         r[i] = new Rectangle((i+1)*2,(i+2)*3);
      }
   }
}