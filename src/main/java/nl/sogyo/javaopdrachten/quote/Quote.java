package nl.sogyo.javaopdrachten.quote;

import java.time.LocalDate;

public class Quote {
    static String[][] quotes = {
        {"galileo", "eppur si muove"},
        {"archimedes", "eureka!"},
        {"erasmus", "in regione caecorum rex est luscus"},
        {"socrates", "I know nothing except the fact of my ignorance"},
        {"rené descartes", "cogito, ergo sum"},
        {"sir isaac newton", "if I have seen further it is by standing on the shoulders of giants"}
    };
    
  public static void main(String... args) {
    
	  
// FIRST SENTENCE SETUP	  
    LocalDate today = LocalDate.now();	   /// getting todays date  prints today YYYY/mm/dd
    	
    // getting name of the weekday, changing to string, capitalize first letter - rest lowercase. 
    String weekday = ((today.getDayOfWeek().toString()).substring(0,1)) + ((today.getDayOfWeek().toString()).substring(1).toLowerCase());
    
    // getting dayNumber of the month. 
    int dayNr = today.getDayOfMonth();
    
    String dayNrOrdinal;        // getting 4 different options for the ending of dayNr. (ordinal numbers)
    switch(dayNr) {
    	default: dayNrOrdinal = dayNr + "th";
    	break;
    	case 1, 21:
    		dayNrOrdinal = dayNr + "st";
    	break;
    	case 2, 22:
    		dayNrOrdinal = dayNr + "nd";
    	break;
    	case 3, 23:
    		dayNrOrdinal = dayNr + "rd";
    	break; 
    }
    
    // getting name of the month, changing to string, capitalize first letter - rest lowercase. 
    String month = ((today.getMonth().toString()).substring(0,1)) + ((today.getMonth().toString()).substring(1).toLowerCase());
    
//  PRINTING FIRST SENTENCE 
    System.out.println("Quote for " + weekday + " the " + dayNrOrdinal + " of " + month + ":");
   
   
   
   
   
   
  
// SECOND SENTENCE SETUP   						// GETTING QUOTE
   int dayOfYearNr = today.getDayOfYear();						// todays Number 
   int quoteNr = (dayOfYearNr -1) % 6; 							// making it from 0-5
   
   String todaysQuote = quotes [quoteNr][1];					// using above number to select the right quote from the array
   String speaker = quotes [quoteNr][0];						// using the same number to select the belonging speaker
   
   todaysQuote = todaysQuote.substring(0, 1).toUpperCase() + todaysQuote.substring(1);		// Capitalizing
   speaker = speaker.substring(0, 1).toUpperCase() + speaker.substring(1);					
   
   if (todaysQuote.matches(".*[a-z]$")) 						// if the quote ends with a letter, add a .
	   todaysQuote = todaysQuote + ".";
   
   
   

// PRINTING SECOND SENTENCE
   System.out.println('\u0022' + todaysQuote + '\u0022' + " -- " + speaker);
  
   
   
    }
}
