import java.util.ArrayList;
public class opdrLists {

	public static void main(String[] args) {
		
	//   1.    
	//  creating Array
		int[] randomNrList = new int[10];
		//Filling with random values
			for (int i = 0; i <randomNrList.length ; i++)
	       			randomNrList [i]= (int)(Math.random()*100);
	    //Printing the values          	       
			for (int i=0; i <randomNrList.length; i++)
				System.out.println(randomNrList[i]);
		
			
			
		// 2.
		//Finding the highest number. Creating variable, loop of comparing which is higher and naming the highest. 
			int highest = 0;
			for (int i=0; i < randomNrList.length; i++) {
				if(randomNrList[i] > highest) {
					highest = randomNrList[i];
				}
			}
		//Printing the highest number					
			System.out.println("The highest number is " + highest);
			
			
			
			
		// 3.
		// Finding lowest 2. Adding the 2 lowest values is displayed. 
			//finding the lowest value
			int lowest = highest;
			for (int i=0; i < randomNrList.length; i++) {
				if(randomNrList[i] < lowest) {
					lowest = randomNrList[i];
				}
			}
			// finding the second lowest value, is low, but not lowest. 
			int secondLowest = highest;
			for (int i=0; i< randomNrList.length; i++) {
				if (randomNrList[i]<secondLowest && randomNrList[i] != lowest) {
					secondLowest = randomNrList[i];
				}
			}
			
			// lowest sum and printing them.
			int lowestSum = (lowest + secondLowest);
						
			//System.out.println(lowest);
			//System.out.println(secondLowest);
			
			System.out.println("The sum of the lowest numbers is " + lowestSum);
			
			
			
			
		// 4. 
		 // Filtering program to display even values
			// even values are found in loop of dividing them by 2 and printing
			
			System.out.println("The even numbers are: ");
			
			for (int i=0; i< randomNrList.length; i++) {
				if (randomNrList[i] % 2 == 0) 
					System.out.println(randomNrList[i]);
										
			}
			
			
		// 5.
		// Splitting the list into 4 different lists. divby2, divby3, divby5, remainder. 
			
			// creating array lists
			// ! needed to import java.util.ArrayList 
			ArrayList<Integer> divBy2 = new ArrayList<Integer>();
			ArrayList<Integer> divBy3 = new ArrayList<Integer>();
			ArrayList<Integer> divBy5 = new ArrayList<Integer>();
			ArrayList<Integer> remain = new ArrayList<Integer>();
			
			// looping through to check every number of the original list. 
			for (int i = 0; i <randomNrList.length; i++) {
			if (randomNrList[i] % 2 == 0) 
				divBy2.add(randomNrList[i]); 
			if (randomNrList[i] %3 == 0) 
				divBy3.add(randomNrList[i]);
			if (randomNrList[i] %5 ==0) 
				divBy5.add(randomNrList[i]);
			if (randomNrList[i] % 2 != 0 && randomNrList[i] %3 !=0 && randomNrList[i] %5 !=0)
				remain.add(randomNrList[i]);
			
			}
	
			System.out.println("Divisible by 2:" +divBy2);
			System.out.println("Divisible by 3:" +divBy3);
			System.out.println("Divisible by 5:" +divBy5);
			System.out.println("Remaining:" +remain);

			
			
			
		// 6.
		// Sorting the list in ascending order with BubbleSort algorithm. 
		
			// Looping the next loop through the list of random numbers.
			for(int i=0; i<randomNrList.length; i++) {
				// Looping a check if a number is higher than the one next to it.
				for(int h = 0; h <9; h++) {
				if(randomNrList[h] > randomNrList[h+1]) {
					//temporary list
					int temp = randomNrList[h];
					randomNrList[h] = randomNrList[h+1];
					randomNrList[h+1] = temp;
				}
				}
			}
			System.out.println("Numbers in ascending order: ");
			//printing array
			for(int i=0; i <randomNrList.length; i++) {
				System.out.println(randomNrList[i]);
			}
			
	}

}