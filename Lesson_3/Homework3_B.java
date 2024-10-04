import java.util.Scanner;

public class Homework3_B {
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter integer values: ");
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		int d = obj.nextInt();
		int e = obj.nextInt();
		// Sum and average of all numbers
		double sum = a + b + c + d + e;
		double average = sum/5;
		System.out.println("Sum of the five numbers: " + (int)sum);
		System.out.println("Average of the five numbers: " + average);
		
		// Initializing variables
		double negative_sum = 0;
		double positive_sum = 0;
		double negative_avg = 0;
		double positive_avg = 0;
		double negative_count = 0;
		double positive_count = 0;
		
		// For loop to loop through values and check if they are positive or negative
		// Could not figure out an easier way than using loops
		int[] values = {a,b,c,d,e};
		for (int value : values) {
			// For non-positives
			if (value < 0) {
				negative_sum += value;
				negative_count ++;
				negative_avg = (negative_sum / negative_count);
			}
			// For positives
			else if (value > 0) {
				positive_sum += value;
				positive_count ++;
				positive_avg = (positive_sum / positive_count);
			}
		}
		// Print out the sums and averages
		System.out.println("Sum of the non-positive numbers: " + (int)negative_sum);
		System.out.println("Average of the non-positive numbers: " + negative_avg);	
		System.out.println("Sum of the positive numbers: " + (int)positive_sum);
		System.out.println("Average of the positive numbers: " + positive_avg);
	}
}