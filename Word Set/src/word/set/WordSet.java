
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
   
    //main class need ioexception for readLine() method
    public static void main(String args[] ) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        //basically making reader do same thing as keyboard in
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        
        //allouwing the user to pick how many lines they want to enter
        System.out.println("Enter the number of lines you would like to convert to an array.");
        int amount = keyboard.nextInt();
        
        //for loop to control this
        for(int i = 1; i <= amount; i++ ){
        //some output to tell user what to do
        System.out.println("Enter a line of something..");
        
        //variable set from input
        String userInput =reader.readLine();
        
        //convert to all lower case even if this is already done by user
        String input =  userInput.toLowerCase();
      
        
        //seperating using split will make array with spaces
        Set <String> arrayOutput = new TreeSet<String>(Arrays.asList(input.split(" ")));
        
        //wll output in order
        System.out.println("Array # " + i + arrayOutput);
        //makes it look a little nicer
        System.out.println();
        }
        //the end!
        System.out.println("You have gotten all your arrays.");
    }
    
}
