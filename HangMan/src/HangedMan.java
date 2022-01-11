import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangedMan {
  public static void main(String[] args) throws FileNotFoundException {  
    
    Scanner keyboard = new Scanner(System.in);
    Scanner wordList = new Scanner(new File("H:/Esra/Documents/SOGYO/HangManWordList.txt"));
    
    List<String> words = new ArrayList<>();
    while (wordList.hasNext()) {
    	words.add(wordList.nextLine());
    }
    
    Random rand = new Random();
    String word = words.get(rand.nextInt(words.size()));
    
    List<Character> previousGuesses = new ArrayList<>();
    
    
    boolean continueGame = true;
    
    System.out.println("----------------------------------");
	System.out.println("|Hangman game  --  Guess the word|");
	System.out.println("----------------------------------");
	
  	//System.out.println(word); //// to test letters from word
  	
    
    // PRINTING LETTERS OR _  (for first show of amount of letters. )
    for (int i =0; i < word.length(); i++) {
    	if (previousGuesses.contains(word.charAt(i))) {     // if the guessed letter is in the word
    		System.out.print(word.charAt(i) + " ");			// print letter in place 
    		
    	}	else {											// otherwise a _ 
    		System.out.print("_ " );
    	}
    	
    }
    System.out.println();   						// go to next line after print
   
    
    
    int livesLeft = 10; 
    
    
    while(continueGame = true) {
    	
    	System.out.print("YOU HAVE " + livesLeft + " MORE TRIES.   ");	// TEXT over vorige en hoeveelheid pogingen
    	System.out.println("Previous guesses: " + previousGuesses);
    	System.out.println("ENTER YOUR LETTER ");
    	String letterGuess = keyboard.nextLine(); 					//// getting input from user loop and add to guesses list
    	previousGuesses.add(letterGuess.charAt(0));						// only taking first letter
    	
       	
    	
    	for (int i =0; i < word.length(); i++) { 						// looping the show of letters and printing them if guessed correctly. 
    		if (previousGuesses.contains(word.charAt(i))) {				
    		System.out.print(word.charAt(i) + " ");					
    		}
    		
    		else {
    		System.out.print("_ " );									//print _ for not yet guessed 
    		}
    	}
    	System.out.println();
    	
    	
    	
    	if (!word.contains(letterGuess)) {
    		livesLeft --;
    	}
    	
    	if (livesLeft == 0) {									// LOST IF NO LIVES LEFT. 
    		System.out.println("|  YOU LOST!  |");
    		return;
    	}
    	
  		
    }
    
    
    
    
    
  }
}
 

  
