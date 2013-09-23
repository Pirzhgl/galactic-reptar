import java.util.*;
public class Input {
   private String line;
   private Scanner inputScanner;
   
   public Input() {
   
   }
   
   public Input(String line) {
      this.line = line;
   }
   
   public Library setUpLibrary() {
      inputScanner = new Scanner(line);
      inputScanner.useDelimiter("@");
      String type = inputScanner.next();
      switch(type) {
         case "a" : String albumDateString = inputScanner.next();
                    Date albumDate = setUpDate(albumDateString);
                    break;
         case "f" : 
                    break;
         case "m" : ;
                    break;
         case "n" : ;
                    break;
         case "s" : ;
                    break;
         default: break;
      }
   }
   
   public void libraryByTitle(Library [] library){
      boolean sorted = false;
      int bottomIndex = library.length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i].getTitle().compareToIgnoreCase(library[i+1].getTitle()) > 0) {
               swap(library,i,i+1);
               sorted = false;
            }
         }
      }
   }
   
   public void booksByISBN(Library [] library) {
      boolean sorted = false;
      int bottomIndex = library.length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i].getISBN().compareToIgnoreCase(library[i+1].getISBN()) > 0 ) {
               swap(library,i,i+1);
               sorted = false;
            }
         }
      }
   }
   
   public void songsByAlbum(Library [] library) {
      boolean sorted = false;
      int bottomIndex = library.length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i].getAlbum().compareToIgnoreCase(library[i+1].getAlbum()) > 0) {
               swap(library,i,i+1);
               sorted = false;
            }
         }
      }
   }
   
   public void albumByNumberOfSongs(Library [] library) {
      boolean sorted = false;
      int bottomIndex = library.length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            int j = library[i].getNumberOfTracks();
            int k = library[i+1].getNumberOfTracks();
            if(j > k) {
               swap(library,i,i+1);
               sorted = false;
            }
         }
      }
   }
   
   public void moviesByDate(Library [] library) {
      boolean sorted = false;
      int bottomIndex = library.length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i].getDate().compareTo(library[i+1].getDate()) > 0) {
               swap(library,i,i+1);
               sorted = false;
            }
         }
      }
   }
   
   public void musicByRunTime(Library [] library) {
      boolean sorted = false;
      int bottomIndex = library.length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i].getRunTime().compareTo(library[i+1].getRunTime()) > 0) {
               swap(library,i,i+1);
               sorted = false;
            }
         }
      }
   }
   
   private void swap(Library [] library, int ind1, int ind2) {
      Library temp = library[ind1];
      library[ind1] = library[ind2];
      library[ind2] = temp;
   }
   
   
   private Date setUpDate(String dateString) {
      String day;
      String month;
      String year;
      Scanner dateScanner = new Scanner(dateString);
      dateScanner.useDelimiter("");
      day = dateScanner.next();
      day = day + dateScanner.next();
      month = dateScanner.next();
      month = month + dateScanner.next();
      year = dateScanner.next();
      year = year + dateScanner.next();
      year = year + dateScanner.next();
      year = year + dateScanner.next();
      return new Date(day,month,year);
   }
   
   private RunTime setUpRunTime(String runTimeString) {
      String hours;
      String minutes;
      String seconds;
      Scanner runTimeScanner = new Scanner(runTimeString);
      runTimeScanner.useDelimiter(":");
      hours = runTimeScanner.next();
      minutes = runTimeScanner.next();
      seconds = runTimeScanner.next();
      return new RunTime(hours, minutes, seconds);
   }
}