// Import scanner class to read user input
import java.util.Scanner;

public class Homework2_A {
	public static void main(String [] args) {
		// Create a Scanner object
		Scanner obj = new Scanner(System.in);
		
		// Numerical user input
		System.out.println("Input the number of yards, feet and inches");
		int yards = obj.nextInt();
		int feet = obj.nextInt();
		int inches = obj.nextInt();
		
		// User output
		System.out.println("Number of yards: " + yards);
		System.out.println("Number of feet: " + feet);
		System.out.println("Number of inches: " + inches);
		
		// Conversion to inches and output on console
		int yards_to_inches = (yards * 36);
		System.out.println("Yards to inches : " + yards_to_inches);
		int feet_to_inches = (feet * 12);
		System.out.println("Feet to inches : " + feet_to_inches);
		
		// Summation and output
		int sum = inches + yards_to_inches + feet_to_inches;
		System.out.print("Sum of all values in inches = " + sum);
	  }
}