// RENAME DIGITAL TO PLAYABLE
import java.io.*;
import java.util.*;
public class EntertainmentDatabase {
   static final int MAX = 100;
   static Library [] library = new Library [MAX];
   public static void main(String [] args) throws Exception{
      File inFile = new File(args[0]);
      File outFile = new File(args[1]);
      PrintStream writer = new PrintStream(outFile);
      Scanner echoScanner = new Scanner(inFile);
      Scanner inputScanner = new Scanner(inFile);
      int count = 0;
      writer.println("Kyle Fagan\nCS101\nSection 01\n");
      writer.println("Echo Print of Input\n");
      while(echoScanner.hasNext()) {
         writer.println(echoScanner.nextLine());
      }
      writer.println();
      Input input = new Input();
      while(inputScanner.hasNextLine()){
         String line = inputScanner.next();
         input = new Input(line);
         library[count] = input.setUpLibrary();
         count++;
         
      }
      writer.println("Library Sortd by title");
      input.libraryByTitle(library);
      for(int i = 0; i < library.length; i++){
         writer.println(library[i].toString());
      }
      writer.println("Books Sorted by ISBN");
      input.booksByISBN(library);
      for(int i = 0; i < library.length; i++) {
         if(library[i] instanceof Book) {
            writer.println(library[i].toString());
         } 
      }
      writer.println("Songs Sorted by Album");
      input.songsByAlbum(library);
      for(int i = 0; i < library.length; i++) {
         if(library[i] instanceof Song){
            writer.println(library[i].toString());
         }
      }
      writer.println("Albums Sorted by Number of Songs");
      input.albumByNumberOfSongs(library);
      for(int i = 0; i < library.length; i++) {
         if(library[i] instanceof Album){
            writer.println(library[i].toString());
         }
      }
      writer.println("Movies Sorted by Date");
      input.moviesByDate(library);
      for(int i = 0; i < library.length; i++) {
         if(library[i] instanceof Movie){
            writer.println(library[i].toString());
         }
      }
      writer.println("Music Sorted by Run Time");
      input.musicByRunTime(library);
      for(int i = 0; i < library.length; i++) {
         if(library[i] instanceof Song || library[i] instanceof Album) {
            writer.println(library[i].toString());
         }
      }
   }
   }

