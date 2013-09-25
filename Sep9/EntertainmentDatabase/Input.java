/*
   Kyle Fagan
   CS101-01
   Final Project
   Due September 26, 2013
   An input class that sorts various media and 
   creates media objects.
*/
/*
             Data Table
             ==========
    Variable             Purpose
    line                 String that has the line of input from
                           the inFile
    numberOfEntries      counts the size of the array

*/
import java.util.*;
public class Input {
   private String line;
   private int numberOfEntries = 0;

   public Input() {
   
   }
   
   /*
      Algorithm
      this.line <- line
   */
   public Input(String line) {
      this.line = line;
   }
   
   /*
      Algorithm
      numberOfEntries++;
      Scanenr inputScanenr <- new Scanner(line)
      inputScanner.useDelimiter("@")
      String type <- inputScanner.next()
      switch(type)
         case "a": String albumDateSTring <- inputScanner.next()
                   Date albumDate <- setUpdate(albumDateString)
                   String artist <- inputScanner.next()
                   String album <- inputScanner.next()
                   int tracks <- inputScanner.nextInt()
                   String albumRunTimeSTring <- inputScanner.next()
                   RunTime runTime <- setUpRunTime(albumRunTimeString)
                   Album ablumObj
                   return albumObj <- new Album(albumDate, artist, ablum,tracks,runTime
         case "f": String fictionISBN <- inputScanner.next()
                   String fictionDateString <- inputSCanner.next()
                   Date fictionDate <- setUPdate(fictionDateString)
                   String fictionAutor <- inputScanner.next()
                   String fictionTitle <- inputScanner.next()
                   String fictionGenre <- inputScanner.next()
                   int fictionPageNumbers <- inputScanner.nextInt()
                   Fiction fictionObj
                   return fictionObj <- new Fiction(fictionISBN, fictionDate,ficitionAutor, fictionTitle, fictionGenre, fictionPageNumbers)
         case "m": String movieDateString <- inputScanner.next();
                   Date movieDateString <- inputScanner.next()
                   String movieStudio <- inputScanner.next()
                   String movieTitle <- inputScanner.next(0
                   String movieStars <- inputScanner.next()
                   String movieRunTimeString <- inputScanner.next()
                   RunTime movieRunTime <- setUpRunTime(movieRunTimeString)
                   Movie movieObj
                   return movieObj <- newMovie(movieDate,movieStudio,movieTitle,movieStars,movieRunTime)
         case "n": String nonfictionISBN <- inputScanner.next()
                   String nonfictionDateSTring <- inputScanner.next()
                   Date nonfictionDate <- setUpDate(nonfictionDateString)
                   String nonfictionAuthor <- inputScanner.next()
                   String nonfictionTitle <- inputScanner.next()
                   String nonfictionGenre <- inputScanner.next()
                   int nonfictionReadingLevel <- inputScanner.nextInt()
                   Nonfiction nonfictionObj
                   return nonfictionObj <- new Nonfiction(nonfictionISBN, nonfictionDate, nonfictionAuthor, nonfictionTitle, nonfictionGenre,nonfictionReadingLevel)
         case "s": String songDateString <- inputScanner.next()
                   Date songDate <- setUpDate(songDateString)
                   String songArtist <- inputScanner.next()
                   String songTitle <- inputcanner.next()
                   String songAlbum <- inputScanner.next()
                   String songRunTimeString <- inputScanner()
                   RunTime songRunTime <- setUpRunTime(songRunTimeString)
                   Song songObj
                   return songObj <- new Song(songDate, songArtist,songTitle,songAlbum,songRunTime)
         default: Album libraryObj
                  return new Album(setUpDate("0000000"),"NoArtist","No title",0,setUpRunTime("0:0:0")
   */
   public Library setUpLibrary() {
      numberOfEntries++;
      Scanner inputScanner = new Scanner(line);
      inputScanner.useDelimiter("@");
      String type = inputScanner.next();
      switch(type) {
         case "a" : String albumDateString = inputScanner.next();
                    Date albumDate = setUpDate(albumDateString);
                    String artist = inputScanner.next();
                    String album = inputScanner.next();
                    int tracks = inputScanner.nextInt();
                    String albumRunTimeString = inputScanner.next();
                    RunTime runTime = setUpRunTime(albumRunTimeString);
                    Album albumObj;
                    return albumObj = new Album(albumDate, artist, album, tracks, runTime);
         case "f" : String fictionISBN = inputScanner.next();
                    String fictionDateString = inputScanner.next();
                    Date fictionDate = setUpDate(fictionDateString);
                    String fictionAuthor = inputScanner.next();
                    String fictionTitle = inputScanner.next();
                    String fictionGenre = inputScanner.next();
                    int fictionPageNumbers = inputScanner.nextInt();
                    Fiction fictionObj;
                    return fictionObj = new Fiction(fictionISBN, fictionDate, fictionAuthor, fictionTitle, fictionGenre, fictionPageNumbers);
         case "m" : String movieDateString = inputScanner.next();
                    Date movieDate = setUpDate(movieDateString);
                    String movieStudio = inputScanner.next();
                    String movieTitle = inputScanner.next();
                    String movieStars = inputScanner.next();
                    String movieRunTimeString = inputScanner.next();
                    RunTime movieRunTime = setUpRunTime(movieRunTimeString);
                    Movie movieObj;
                    return movieObj = new Movie(movieDate, movieStudio, movieTitle, movieStars, movieRunTime);
         case "n" : String nonfictionISBN = inputScanner.next();
                    String nonfictionDateString = inputScanner.next();
                    Date nonfictionDate = setUpDate(nonfictionDateString);
                    String nonfictionAuthor = inputScanner.next();
                    String nonfictionTitle = inputScanner.next();
                    String nonfictionGenre = inputScanner.next();
                    int nonfictionReadingLevel = inputScanner.nextInt();
                    Nonfiction nonfictionObj;
                    return nonfictionObj= new Nonfiction(nonfictionISBN, nonfictionDate, nonfictionAuthor, nonfictionTitle, nonfictionGenre, nonfictionReadingLevel);
         case "s" : String songDateString = inputScanner.next();
                    Date songDate = setUpDate(songDateString);
                    String songArtist = inputScanner.next();
                    String songTitle = inputScanner.next();
                    String songAlbum = inputScanner.next();
                    String songRunTimeString = inputScanner.next();
                    RunTime songRunTime = setUpRunTime(songRunTimeString);
                    Song songObj;
                    return songObj = new Song(songDate, songArtist, songTitle, songAlbum, songRunTime);
         default  : Album libraryObj;
                    return libraryObj = new Album(setUpDate("0000000"), "No Artist", "No Title", 0, setUpRunTime("0:0:0"));
      }
   }
   
   /*
      Algorithm
      boolean sorted <- false
      int bottomIndex <- length
      while(!sorted)
         sorted <- true
         bottomIndex--
         for(int i <- 0; i<bottomIndex; i++)
            if(library[i].getTitle().compreToIgnoreCase(librayr[i+1].getTitle() > 0)
               swap(library,i,i+1)
         sorted <- false
   */
   public void libraryByTitle(Library [] library, int length){
      boolean sorted = false;
      int bottomIndex = length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i].getTitle().compareToIgnoreCase(library[i+1].getTitle()) > 0) {
               swap(library,i,i+1);
            }
         sorted = false;
         }
      }
   }
   
   /*
      Algorithm
      boolean sorted <- false
      int bottomIndex <- length
      while(!sorted)
         sorted <- true
         bottomIndex--
         for(int i <- 0; i < bottomIndex; i++)
            if(library[i].getISBN().compareToIgnoreCase(library[i+1].getISBN()) > 0 )
               swap(library,i,i+1)
               sorted <- false
   */
   public void booksByISBN(Library [] library, int length) {
      boolean sorted = false;
      int bottomIndex = length;
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
   
   /*
      Algorithm
      boolean sorted <- false
      int bottomIndex <- length
      while(!sorted)
         sorted <- true
         bottomIndex--
         for(int i<-0; i<-bottomIndex; i++)
            if(library[i].getAlbum().compareToIgnoreCase(library[i+1].getAlbum()) > 0)
               swap(libary,i,i+1)
               sorted <- false
            if(library[i].getAlbum().compareToIgnoreCase(libary[i+1].getAlbum()) == 0)
               if(library[i].getTitle().compareToIgnoreCase(library[i+1].getAlbum() < 0)
                  swap(library,i,i+1)
                  sorted <- false
   */
   public void songsByAlbum(Library [] library, int length) {
      boolean sorted = false;
      int bottomIndex = length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i].getAlbum().compareToIgnoreCase(library[i+1].getAlbum()) > 0) {
               swap(library,i,i+1);
               sorted = false;
            }
            if(library[i].getAlbum().compareToIgnoreCase(library[i+1].getAlbum()) == 0) {
               if(library[i].getTitle().compareToIgnoreCase(library[i+1].getAlbum()) < 0) {
                  swap(library,i,i+1);
                  sorted = false;
               }
            }
         }
      }
   }
   
   /*
      Algorithm
      boolean sorted <- false
      int bottomIndex <- length
      while(!sorted)
         sorted <- true
         bottomIndex --
         for(iint <- 0; i<bottomIndex; i++)
            int j <- library[i].getNumberOfTracks()
            int k <- library[i+1].getNumberOfTracks()
            if(j>k)
               swap(library,i,i+1)
               sorted <- false
            if(j==k)
               if(library[i].getTitle().compareToIgnoreCase(library[i+1].getTitle()) > 0)
                  swap(library, i, i+1)
                  sorted <- false
   */
   public void albumByNumberOfSongs(Library [] library, int length) {
      boolean sorted = false;
      int bottomIndex = length;
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
            if(j == k) {
               if(library[i].getTitle().compareToIgnoreCase(library[i+1].getTitle()) > 0) {
                  swap(library, i, i+1);
                  sorted = false;
               }
            }
         }
      }
   }
   
   /*
      Algorithm
      boolean sorted <- false
      int bottomIndex <- lenght
      while(!sorted)
         sorted <- true
         bottomIndex--
         for(int i<- 0; i<bottomIndex;i++)
            if(library[i].getDate().compareTo(library[i+1].getDate()) > 0)
               swap(library,i,i+1)
               sorted <- false
   */
   public void moviesByDate(Library [] library, int length) {
      boolean sorted = false;
      int bottomIndex = length;
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
   
   /*
      Algorithm
      boolean sorted <- false
      int bottomIndex <- length
      while(!sorted)
         sorted <- true
         bottomIndex--
         for(int i<-0;i<bottomIndex;i++)
            if(library[i] instanceof Music)
               int n <- 1
               while((n+i) <bottomIndex-1) && !(library[i+n] instnaceofMusic))
                  n++
               if(library[i].getRunTime().compareTo(library[i+n].getRunTime()) > 0)
                  swap(librayr,i.i+n)
                  sorted <- false
               if(librayr[i].getRunTime().comapreTo(library[i+n].getRunTime() == 0)
                  if(library[i].getTitle().compareToIgnoreCase(libarary[i+n].getTitle() > 0
                     swap(library,i,i+n)
                     sorted <- false
   */
   public void musicByRunTime(Library [] library, int length) {
      boolean sorted = false;
      int bottomIndex = length;
      while(!sorted) {
         sorted = true;
         bottomIndex--;
         for(int i = 0; i < bottomIndex; i++) {
            if(library[i] instanceof Music){
                  int n = 1;
                  while((n+i < bottomIndex-1) && !(library[i+n] instanceof Music)) {
                     n++;
                  }
                  if(library[i].getRunTime().compareTo(library[i+n].getRunTime()) > 0) {
                     swap(library,i,i+n);
                     sorted = false;
                  }
                  if(library[i].getRunTime().compareTo(library[i+n].getRunTime()) == 0) {
                     if(library[i].getTitle().compareToIgnoreCase(library[i+n].getTitle()) > 0) {
                        swap(library,i,i+n);
                        sorted = false;
                     }
                  }
            }
         }            
      }
   }
   
   /*
      Algorithm
      Library temp <- library[ind1]
      library[ind1] <- library[ind2]
      library[ind2] <- temp
   */
   private void swap(Library [] library, int ind1, int ind2) {
      Library temp = library[ind1];
      library[ind1] = library[ind2];
      library[ind2] = temp;
   }
   
   /*
      Algorithm
      String day
      String month
      String year
      Scanner date Scanenr <- new Scanner(dateString)
      dateScanner.useDelimiter("")
      day <- dateScanenr.next()
      day <- day + dateScanner.next()
      month <- dateScanner.next()
      month <- month + dateScanner.next()
      year <- dateScanener.next()
      year <- year + dateScanner.next()
      year <- year + dateScanner.next()
      year <- year + dateScanner.next()
      return tnew Dat(day,month,year)
   */
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
   
   /*
      Algorithm
      String hours
      String minutes
      String seconds
      Scanner runTimeScanner <- new Scanner(runTimeString)
      if(runTimeStirng.indexOf(":") >= 1)
         runTimeScanner.useDelimiter(":")
         hours <- runTimeScanner.next()
         minutes <- runTimeScanner.next()
         seconds <- runTimeScanner.next()
         return new RunTime(hours,mintues,seconds)
      else 
         runTimeScanner.useDelimiter(":")
         minutes <- runTImeScaner.next()
         seconds <- runTimeScanner.next()
         return new RunTime("0", minutes,seconds)
   */
   private RunTime setUpRunTime(String runTimeString) {
      String hours;
      String minutes;
      String seconds;
      Scanner runTimeScanner = new Scanner(runTimeString);
      if(runTimeString.indexOf(":") >= 1) {
         runTimeScanner.useDelimiter(":");
         hours = runTimeScanner.next();
         minutes = runTimeScanner.next();
         seconds = runTimeScanner.next();
         return new RunTime(hours, minutes, seconds);
      }
      else {
         runTimeScanner.useDelimiter(":");
         minutes = runTimeScanner.next();
         seconds = runTimeScanner.next();
         return new RunTime("0", minutes, seconds);
      }
         
   }
}