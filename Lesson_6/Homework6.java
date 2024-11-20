// Import relevant libraries
import java.util.Scanner;
import java.util.Arrays;

public class Homework6{
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int[] user_Array = new int[100];
      
		System.out.println("Enter a sequence of up to 100 integers. Type a non-integer to stop:");

        // Read values into the array
        int num = readIntoArray(obj, user_Array);

        // Print values above average
        printAboveAverage(user_Array, num);
	}	
	
	public static int readIntoArray(Scanner s, int[] a) {
	    int count = 0; // Initialize count to note the number of integers entered in case less than 100

	    // Iterate through the array, reading integers into the array
	    while (s.hasNextInt()) {
	        a[count] = s.nextInt();
	        count++;
	    }

	    return count;
	}

	// Method to print values above average
	public static void printAboveAverage(int[] a, int n) {
		int sum = 0; // Initialize sum of array values to 0
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double average = (double) sum / n;
		
		// Printing values above average
		System.out.println("The average value is " + average + " and the values above average are shown below");
		for (int i = 0; i < a.length; i++) {
			if (average < a[i]) {
				System.out.println("Value at index " + i + " is: " + a[i]);
			}
		}
		
	}
}