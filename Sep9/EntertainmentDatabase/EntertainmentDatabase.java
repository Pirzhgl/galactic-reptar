/*
   Kyle Fagan
   CS101-01
   Final Project
   Due September 26, 2013
   An entertainment database that sorts various media.
*/
/*
             Data Table
             ==========
    Variable             Purpose 
    MAX                  constant int for max number of array elements
    library              array of type LIbrary that stores all entertainment
    inFile               File object that is the input file
    outFile              File object that is the output file
    writer               Print Stream object that writes to outFile
    echoScanner          Scanner object used specifically for echoing input
    inputScanner         Scanner object used to gather lines from inFile
*/
/*
   Algorithm
static final int MAX <- 100
static Library [] library <- new Library [MAX]
public static void main(String [] args) throws Exception
   File inFile <- new File(args[0])
   File outFile <- new File(args[1])
   PrintStream writer <- new PrintSTream(outFile)
   Scanner echoScanenr <- new Scanner(inFile)
   Scanner inputScanner <- new Scanner(inFile)
   writer.println("Name and information")
   writer.println("Echo Print of Input")
   while(echoScanner.next())
      writer.println(echoScanner.nextLine())
   writer.println()
   int count <- 0
   String line <- inputScanner.nextLine()
   while(inputScanner.hasNextLine())
      input <- new Input(line)
      library[count] <- input.setUpLibrary()
      count++
      line <- inputScanner.nextLine()
   writer.println("Library Sorted by title")
   input.libraryByTitle(library, count)
   for(int i <- 0; i < count; i++)
      writer.println(library[i].toString())
   writer.println()
   writer.println("Books sorted by ISBN")
   input.booksByISBN(library,count)
   for(int i <- 0; i < count; i++)
    if(library[i] instanceof Book)
      writer.println(library[i].toString())
   writer.println()
   writer.println("Songs Sorted by Album")
   input.songsByAlbum(library,count)
   for(int i <- 0; i < count; i++)
    if(library[i] instanceof Music)
      writer.println(library[i].toString())
   writer.println()
   writer.println("Album Sorted by number of Songs")
   input.albumByNumberOfSongs(library,count)
    if(library[i] instanceof Album)
      writer.println(library[i].toString())
   writer.println()
   writer.println("Movies Sorted by Date")
   input.moviesByDate
    if(library[i] instanceof Movie)
      writer.println(library[i].toString())
   writer.println()
   writer.println("Music Sorted by Run Time")
   input.musicByRunTime(library, count)
    if(library[i] instanceof Music)
      writer.println(library[i].toString())
*/
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
      writer.println("Kyle Fagan\nCS101\nSection 01\nEntertainmentDatabase\n");
      writer.println("Echo Print of Input:\n");
      while(echoScanner.hasNext()) {
         writer.println(echoScanner.nextLine());
      }
      writer.println();
      int count = 0;
      Input input = new Input();
      String line = inputScanner.nextLine();
      while(inputScanner.hasNextLine()){
         input = new Input(line);
         library[count] = input.setUpLibrary();
         count++;
         line = inputScanner.nextLine();  
      }
      writer.println("Library Sorted by title:");
      input.libraryByTitle(library, count);
      for(int i = 0; i < count; i++){
         writer.println(library[i].toString());
      }
      writer.println();
      writer.println("Books Sorted by ISBN:");
      input.booksByISBN(library, count);
      for(int i = 0; i < count; i++) {
         if(library[i] instanceof Book) {
            writer.println(library[i].toString());
         } 
      }
      writer.println();
      writer.println("Songs Sorted by Album:");
      input.songsByAlbum(library, count);
      for(int i = 0; i < count; i++) {
         if(library[i] instanceof Song){
            writer.println(library[i].toString());
         }
      }
      writer.println();
      writer.println("Albums Sorted by Number of Songs:");
      input.albumByNumberOfSongs(library, count);
      for(int i = 0; i < count; i++) {
         if(library[i] instanceof Album){
            writer.println(library[i].toString());
         }
      }
      writer.println();
      writer.println("Movies Sorted by Date:");
      input.moviesByDate(library, count);
      for(int i = 0; i < count; i++) {
         if(library[i] instanceof Movie){
            writer.println(library[i].toString());
         }
      }
      writer.println();
      writer.println("Music Sorted by Run Time:");
      input.musicByRunTime(library, count);
      for(int i = 0; i < count; i++) {
         if(library[i] instanceof Song || library[i] instanceof Album) {
            writer.println(library[i].toString());
         }
      }
   }
   }

