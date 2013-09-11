public class Sodoku {
	public final int SODOKU_ROWS = 9;
	public final int SODOKU_COLUMNS = 9;
	private int [] [] sodoku = new int[SODOKU_ROWS][SODOKU_COLUMNS];
   private boolean isValid = false;
   private boolean complete = false;

 	public Sodoku(int [][] sodoku) {
		// copy into array
 		for(int i=0; i < sodoku.length; i++) {
 			for(int j=0; j < sodoku[i].length; j++) {
 				this.sodoku[i][j] = sodoku[i][j];
 			}
 		}
 	}
   
   // needs to ignore zeros
   public void evaluateSodoku() {
      checkIfComplete();
      checkRows();
      checkColumns();
      checkBoxes();
   }
   
   private void checkRows() {
      for(int i = 0; i < sodoku.length; i++) {
         for(int j = 0; j <sodoku[i].length; j++) {

         }
      }
   }
   
   private void checkColumns() {
      for(int i = 0; i < sodoku.length; i++) {
         for(int j = 0; j < sodoku[j].length; j++) {
            
         }
      }
      
   }
   
   private void checkBoxes() {
      
   }
   
   // if zeros handle in toString...
   private void checkIfComplete() {
      for(int i = 0; i < sodoku.length; i++) {
         for(int j = 0; j < sodoku[i].length; j++) {
            if(sodoku[i][j] == 0) {
               complete = false;
            }
            else {
               complete = true;
            }
         }
      }
   }
   
   public String conclusion() {
      if(isValid && complete) {
         return "Valid, compelte Sodoku.\n";
      }
      else if(isValid && !complete) {
         return "Valid, incomplete Sodoku.\n";
      }
      else {
         return "Invalid Sodoku\n";
      }
   }
   
   public String toString() {
      String toString = "";
      return toString =  
                    sodoku[0][0] + " " + sodoku[0][1] + " " + sodoku[0][2]
                  + "|"
                  + sodoku[0][3] + " " + sodoku[0][4] + " " + sodoku[0][5]
                  + "|"
                  + sodoku[0][6] + " " + sodoku[0][7] + " " + sodoku[0][9]
                  + "\n"
                  + sodoku[1][0] + " " + sodoku[1][1] + " " + sodoku[0][2]
                  + "|"
                  + sodoku[1][3] + " " + sodoku[1][4] + " " + sodoku[0][5]
                  + "|"
                  + sodoku[1][6] + " " + sodoku[1][7] + " " + sodoku[0][8]
                  + "\n"
                  + sodoku[2][0] + " " + sodoku[2][1] + " " + sodoku[2][2]
                  + "|"
                  + sodoku[2][3] + " " + sodoku[2][4] + " " + sodoku[2][5]
                  + "|"
                  + sodoku[2][6] + " " + sodoku[2][7] + " " + sodoku[2][8]
                  + "\n"
                  + "-------+-------+-------\n"
                  + sodoku[3][0] + " " + sodoku[3][1] + " " + sodoku[3][2]
                  + "|"
                  + sodoku[3][3] + " " + sodoku[3][4] + " " + sodoku[3][5]
                  + "|"
                  + sodoku[3][6] + " " + sodoku[3][7] + " " + sodoku[3][8]
                  + "\n"
                  + sodoku[4][0] + " " + sodoku[4][1] + " " + sodoku[4][2]
                  + "|"
                  + sodoku[4][3] + " " + sodoku[4][4] + " " + sodoku[4][5]
                  + "|"
                  + sodoku[4][6] + " " + sodoku[4][7] + " " + sodoku[4][8]
                  + "\n"
                  + sodoku[5][0] + " " + sodoku[5][1] + " " + sodoku[5][2]
                  + "|"
                  + sodoku[5][3] + " " + sodoku[5][4] + " " + sodoku[5][5]
                  + "|"
                  + sodoku[5][6] + " " + sodoku[5][7] + " " + sodoku[5][8]
                  + "\n"
                  + "-------+-------+-------\n"
                  + sodoku[6][0] + " " + sodoku[6][1] + " " + sodoku[6][2]
                  + "|"
                  + sodoku[6][3] + " " + sodoku[6][4] + " " + sodoku[6][5]
                  + "|"
                  + sodoku[6][6] + " " + sodoku[6][7] + " " + sodoku[6][8]
                  + "\n"
                  + sodoku[7][0] + " " + sodoku[7][1] + " " + sodoku[7][2]
                  + "|"
                  + sodoku[7][3] + " " + sodoku[7][4] + " " + sodoku[7][5]
                  + "|"
                  + sodoku[7][6] + " " + sodoku[7][7] + " " + sodoku[7][8]
                  + "\n"
                  + sodoku[8][0] + " " + sodoku[8][1] + " " + sodoku[8][2]
                  + "|"
                  + sodoku[8][3] + " " + sodoku[8][4] + " " + sodoku[8][5]
                  + "|"
                  + sodoku[8][6] + " " + sodoku[8][7] + " " + sodoku[8][8]
                  + "\n";

      
   }
} 