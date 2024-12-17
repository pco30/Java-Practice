// Import relevant libraries
import java.util.Arrays;

public class Homework9_B {
	public static void main(String[] args) {
		int[] array = {2, 5, 5, 8, 10, 20};
		insert(array, 6, 8);
	}
	
	// Method to insert integer into an array
	public static void insert(int[] array, int size, int n) {
		int[] new_array = new int[size+1];
		for (int i = 0; i < size; i++) {
			new_array[i] = array[i];
		}
		new_array[size] = n;
		Arrays.sort(new_array); // Sort array in ascending order
		
		// Print out array
		for (int i = 0; i < size+1; i++) {
			System.out.print(new_array[i] + " ");
		}
	}
}
