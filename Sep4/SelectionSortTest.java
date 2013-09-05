public class SelectionSortTest {
   public static void main(String [] args) {
      int [] a = MakeArray.unsorted(1000000, -43213, 906697);
      Sort.selection(a);
   }
}