// import relevant libraries
import java.util.ArrayList;
import java.util.Collections;

public class Homework12_B{
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5};
		int[] arr2 = {2, 4, 6};
		printArray(merge(arr1, arr2));
	}
	
	// Method to merge 2 arrays
	public static int[] merge(int[] a1, int[] a2) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		
		if (a1.length > 0) { // if array is not empty
			for(int i = 0; i < a1.length; i++) {
				n.add(a1[i]); // add a1 values to the created arrayList
			}
		}
		
		if(a2.length > 0) {
			for(int i = 0; i < a2.length; i++) {
				n.add(a2[i]);
			}
		}
		
		Collections.sort(n); // Sort the arrayList
		int[] array = new int[n.size()]; // Create an array the same size as the arrayList
		
		for(int i = 0; i < array.length; i++) {
			array[i] = n.get(i); // Add the arrayList values to the array
		}
		
		return array;
	}
	
	// Method to print Array
	public static void printArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}