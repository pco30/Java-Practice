// Import scanner class to read user input
import java.util.Scanner;

public class Homework2_B {
	public static void main(String [] args) {
		// Create a scanner object
		Scanner obj = new Scanner(System.in);
		
		// Numerical user input
		System.out.println("Input the total inches: "); 
		int total = obj.nextInt();
		// Calculate yards, feet, and inches from total
		int yards = total/36; 
		int feet = (total%36)/12;
		int inches = total%36%12;
		// Print out results
		System.out.println("Yards: " + yards);
		System.out.println("Feet: " + feet);
		System.out.println("Inches: " + inches);
	}
}