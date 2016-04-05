
package word.set;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.*; 
import java.util.List;
import java.util.ListIterator;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author Zach Murphy 
 */
public class WordSet {
   
    //use this for user input
    private static BufferedReader reader;
    
    
    
    //will be used to put string input into string set array output
    private static Set<String> arrayOutput;
    
    //was going to use this guy
    //Scanner keyboard = new Scanner(System.in); 
    
    //main class need ioexception for readLine() method
    public static void main(String args[] ) throws IOException {
        //basically making reader do same thing as keyboard in
        reader = new BufferedReader (new InputStreamReader(System.in));
        //some output to tell user what to do
        System.out.println("Enter a line of something..");
        
        //variable set from input
        String userInput =reader.readLine();
        
        //seperating using split will make array with spaces
        arrayOutput = new TreeSet<String>(Array.asList(userInput.split(" ")));
        //wll output in order
        System.out.println(arrayOutput);
    }
    
}
