// Import relevant libraries
import java.util.Scanner;
import java.util.Arrays;

public class Homework6_B {
	public static void main(String[] args) {
		
		// Create a scanner object
		Scanner obj = new Scanner(System.in);
		System.out.print("Write your text: ");
		
		char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int[] word_count = new int[26];
		
		// Initialize each value in the array to zero (not sure if necessary)
		for (int i = 0; i < word_count.length; i++) {
			word_count[i] = 0;
		}
		
		// Read every input text
		while(obj.hasNext()) {
			String text = obj.next();
			text = text.toUpperCase();
			
			// Loop through each character in the user input
		    for (int i = 0; i < text.length(); i++) {
		    	char character = text.charAt(i); 
		    	
		    	// Loop through each character in the char array
		    	for (int j = 0; j < letter.length; j++) {
		    		if (character == letter[j]) {
		    			word_count[j]++; // increment count by 1 at the characters index
		    		}
		    	}
		    }
		}
		
		// Print the number of times each character occurs
        for (int i = 0; i < letter.length; i++) {
            if (word_count[i] >= 1) {
                System.out.println(letter[i] + " appears " + word_count[i] + " time(s)");
            }
        }
	}
}
