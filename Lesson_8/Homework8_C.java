public class Homework8_C {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
//		arrayShift_once(array);
		arrayShift(array, 2);
		printArray(array); // Call method to print array
	}
	
	// Method to shift array n times using the arrayShift_once method
	public static void arrayShift(int[] array, int n) {
		for(int i = 0; i < n; i++) {
			arrayShift_once(array);
		}
	}
	
	// Method to shift array once
	public static void arrayShift_once(int[] array) {
		int tmp = array[0];
		for(int i = 1; i < array.length; i++) {
			array[i-1] = array[i];
		}
		array[array.length-1] = tmp;
	}
	
	// Method to print array values
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}