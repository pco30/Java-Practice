public class Homework8_A {
	public static void main(String[] args) {
		int[] array = {1, 2, 2, 4, 2};
		int sz = removeAllOccu_v2(array, 2, array.length);
		printArray(array, sz);
	}
	
	public static int removeAllOccu_v2(int[] array, int toRemove, int size) {
		int finalSize = size;
		for(int i = 0; i < finalSize; i++) {
			if(array[i] == toRemove) {
				array[i] = array[finalSize-1];
				finalSize--;
				//i--;
			}
		}
		return finalSize;
	}
	
	public static void printArray(int[] array, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void arrayShift(int[] array, int n) {
		for(int i = 0; i < n; i++) {
			arrayShift_once(array);
		}
	}
	
	public static void arrayShift_once(int[] array) {
		int tmp = array[0];
		for(int i = 0; i < array.length; i++) {
			array[i-1] = array[i];
		}
		array[array.length-1] = tmp;
	}
}