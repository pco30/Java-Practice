//Import Relevant libraries
import java.util.Scanner;
import java.util.ArrayList;

//First assignment question
public class Homework5_A{
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		// Initialize fixed string to hello world
		String fixed_string = "Hello World";
		System.out.print("Enter a word or sentence: ");
		String input = obj.nextLine();
		
		// Convert both fixed string and user input to either upper or lower case
		fixed_string = fixed_string.toLowerCase();
		input = input.toLowerCase();
	    
		// For loop to iterate over user input
		for (int i = 0; i < input.length(); i++) {
            char user_input_letter = input.charAt(i);

            // Check if each character from the user input exists in the fixed_word; Hello world
            if (fixed_string.indexOf(user_input_letter) != -1) {

                // If statements based on certain conditions to output letters from their corresponding methods
                if (user_input_letter == 'h') {
                    h();
                }
                else if (user_input_letter == 'e') {
                    e();
                }
                else if (user_input_letter == 'l') {
                    l();
                }
                else if (user_input_letter == 'o') {
                    o();
                }
                else if (user_input_letter == 'w') {
                    w();
                }
                else if (user_input_letter == 'r') {
                    r();
                }
                else if (user_input_letter == 'd') {
                    d();
                }
                else if (user_input_letter == ' ') {
                    blank();
                }
            }
        }
    }
	
	// Methods for each character in Hello world
	public static void h() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("   *    %n");
		System.out.printf("   *    %n");
		System.out.printf("   *    %n");
		System.out.printf("*******%n");
		System.out.printf("%n");
	}
	
	public static void e() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*  *  *%n");
		System.out.printf("*  *  *%n");
		System.out.printf("*  *  *%n");
		System.out.printf("*  *  *%n");
		System.out.printf("%n");
	}
	
	public static void l() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*      %n");
		System.out.printf("*      %n");
		System.out.printf("*      %n");
		System.out.printf("*      %n");
		System.out.printf("%n");
	}
	
	public static void o() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*     *%n");
		System.out.printf("*     *%n");
		System.out.printf("*     *%n");
		System.out.printf("*******%n");
		System.out.printf("%n");
	}
	
	public static void w() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf(" *     %n");
		System.out.printf("   *   %n");
		System.out.printf(" *     %n");
		System.out.printf("*******%n");
		System.out.printf("%n");
	}
	
	public static void r() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("   ** *%n");
		System.out.printf("  * * *%n");
		System.out.printf(" *  * *%n");
		System.out.printf("*   ***%n");
		System.out.printf("%n");
	}
	
	public static void d() {
		System.out.printf("%n");
		System.out.printf("*******%n");
		System.out.printf("*     *%n");
		System.out.printf("*     *%n");
		System.out.printf("*     *%n");
		System.out.printf(" ***** %n");
		System.out.printf("%n");
	}
	
	
	public static void blank() {
		System.out.printf("%n%n");
		}
}


// Tried to use an array list to store user input and an array to store the fixed character at first but code did not seem to work correctly
// Think there is a problem in my looping system and will look more into arrays and array lists
//public class Homework5_A{
//	public static void main(String[] args) {
//		
//		Scanner obj = new Scanner(System.in);
//		// Initialize fixed string hello world
//		String fixed_word = "Hello World";
//		System.out.println("Enter a word or sentence: ");
//		String input = obj.nextLine();
//		
//		// Convert both fixed string and user input to lower case
//		fixed_word = fixed_word.toLowerCase();
//		input = input.toLowerCase();
//		
//		// Save user input to an array list before looping through
//	    ArrayList<String> user_input = new ArrayList<String>();
//	    user_input.add(input);
//	    
//	    // Save fixed word to an array to be looped through
//	    char[] fixed_char = fixed_word.toCharArray();
//	    
//	    // Create nested loop
//	    // Outer loop
//	    for (int i = 0; i < fixed_char.length; i++) {
//	    	char fixed_letter = fixed_char[i];
//	    	
//	    	// Inner loop
//	    	for (String word: user_input) {
//	    		
//           // Innermost loop
//	  	      for (int j = 0; j < word.length(); j++) {
//	  	    	  char user_letter = word.charAt(j);
//	  	    	  
//	  	    	  // If statements to output methods
//	  	    	  if(fixed_letter == user_letter && fixed_letter == 'h') {
//	  	    		  h();
//	  	    	  }
//	  	    	  if(fixed_letter == user_letter && fixed_letter == 'e') {
//	  	    		  e();
//	  	    	  }
//	  	    	  if(fixed_letter == user_letter && fixed_letter == 'l') {
//	  	    		  l();
//	  	    	  }
//	  	    	  if(fixed_letter == user_letter && fixed_letter == 'o') {
//	  	    		  o();
//	  	    	  }
//	  	    	  if(fixed_letter == user_letter && fixed_letter == 'w') {
//	  	    		  w();
//	  	    	  }
//	  	    	  if(fixed_letter == user_letter && fixed_letter == 'r') {
//	  	    		  r();
//	  	    	  }
//	  	    	  if(fixed_letter == user_letter && fixed_letter == 'd') {
//	  	    		  d();
//	  	    	  }
//	  	    	  if(fixed_letter == user_letter && fixed_letter == ' ') {
//	  	    		  blank();
//	  	    	  }
//	  	      }
//	  	    }
//	    }
//
//	}
