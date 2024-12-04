//Import relevant libraries
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.PrintWriter;   
import java.util.Scanner;

public class Homework8 {
	// Main methods
	  public static void main(String[] args) {
		  // Initialize scanner object
		  Scanner obj = new Scanner(System.in);
		  // Enter name if input and output files
		  System.out.println("Enter name of input file:");
		  String inputFile = obj.nextLine();
		  System.out.println("Enter name of output file:");
		  String outputFile = obj.nextLine();
		  
		  // Add numbers to the input file for testing purposes
	      try(PrintWriter in = new PrintWriter(new File(inputFile))) {
	      for(int i = -5; i <= 5; i++) {
	    	  in.println(i);
	      }
	      System.out.println("Successfully wrote to the file.");
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      System.exit(0);
	    }
		 
	     // Process the input file to write only positive numbers to the output file
		 try(	  Scanner fin = new Scanner(new File(inputFile));
	    		  PrintWriter fout = new PrintWriter(new File(outputFile));
	     ){
			  process(fin, fout); 
	     } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      System.exit(0);
		   }
	  }
	  
	  // Method to write to the output file
	  public static void process(Scanner input, PrintWriter output) {
		  while (input.hasNextInt()) {
			  int data = input.nextInt();
			  // Condition to move data to the output file
			  if (data > 0) {
				  output.println(data);
				  System.out.println(data); // Print out data to make sure code is working properly
			  }
		  }
	  }
	  
	}