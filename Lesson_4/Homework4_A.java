// Import relevant libraries
import java.util.Scanner;

public class Homework4_A {
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the current price, number of years and inflation rate(%): ");
		// System inputs
		double a = obj.nextDouble();
		double b = obj.nextDouble();
		double c = obj.nextDouble();
		c = c/100;
	
		int d = (int) b; // convert b double to int to use for indexing
		double[] price = new double[d]; // price list to store prices for d years
		
		// Sanitize Inputs
		if ((a < 0) || (b < 0) || (c < 0)) {
			System.out.println("Invalid input!");
			System.exit(0);
		}
		// Loop until d-1 or <d while incrementing i by 1
		for (int i = 0; i < d; i++) {
			a = (a * (1 + c));
			price[i] = a; // Update the price
		}
		// Print output (using printf to approximate price to 2 decimal places)
		System.out.printf("After " + d + " years, the price will be: $ %.2f" , price[d-1]);
	}
}