// Import relevant libraries
import java.util.Arrays;

public class Homework11_B {
	public static void main(String[] args) {
		int[] my_array = {9, 9, 9};
		System.out.print("Initial array: ");
		printArray(my_array);
		System.out.println();
		addOne(my_array);
		System.out.print("Initial array plus 1: ");
		printArray(addOne(my_array));
	}
	
	// Method to add one to the combined array value
	public static int[] addOne(int[] array) {
		int sum = 0;
		int power = (array.length - 1);
		
		// Express array as integer in terms of sum of base powers
		for (int i = 0; i < array.length; i++) {
			int n = (array[i] * (int)Math.pow(10,power));
			sum = sum + n;
			power--;
		}
		
		sum = sum + 1; //Add 1 to the value
		
		// convert value to an array
		int[] numberArray = Integer.toString(sum).chars().map(Character::getNumericValue).toArray();
		
		return numberArray;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}