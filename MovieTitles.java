

package movietitles;
import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;


/**
 *
 * @author Yuemei Wu
 */
public class MovieTitles {

    /**
     * @param args the command line arguments
     * 
     */
    private static class movieBundle{
        private String num;
        private String title;
        private String genre;
    
    public movieBundle(String num, String tile, String genre){
        this.num = num;
        this.title = tile;
        this.genre = genre;
        
    }
    public String num(){
        return num;
    }
    public String title(){
        return title;
    }
    public String genre(){
        return genre;
    }
    @Override
    public String toString(){
        return num +  " " + title + " " + genre +"\n" ;
    }
    
    }
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        List mv2= readcsv();
         File file1 = new File(" output.txt");
        PrintWriter writer1 = new PrintWriter(file1);
        writer1.print(mv2);
    }
        // TODO code application logic here
    public static List readcsv()throws FileNotFoundException, IOException{
        List movie = new ArrayList<>(); 
        FileReader file = new FileReader("input.txt");
        BufferedReader br = new  BufferedReader(file);
        String line = br.readLine();
      while ((line = br.readLine()) != null && !line.isEmpty()) {
          String [] movieList = line.split(",");
          String num = movieList[0];
          String title = movieList[1];
          String genre = movieList[2];
          movieBundle mB = new movieBundle(num, title, genre);
          movie.add(mB);
          
    }
      br.close();
     return movie;
    
}
}

 

       
 

       
