public class Homework10_B {
	public static void main (String[] args) {
		int[] hey = {1, 2, 3, 4};
		evenBeforeOdd(hey);
		
	}
	
	// Method to count number of even numbers in array
	public static int isEven(int[] array) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if((array[i]%2) == 0) {
				count++;
			}
		}
		return count;
	}
	
	// Method to place even before odd
	public static void evenBeforeOdd(int[] my_array) {
	    int even_count = isEven(my_array); // Number of even numbers
	    int[] new_array = new int[my_array.length];
	    
	    // Index for odd or even placements
	    int even = 0; 
	    int odd = even_count; 

	    // Rearrange the array so that even numbers come before odd numbers
	    for (int value : my_array) {
	        if ((value % 2) == 0) {
	            new_array[even] = value;
	            even++;
	        } else {
	            new_array[odd] = value;
	            odd++;
	        }
	    }
	    
	    // Print array
	    for (int i = 0; i < new_array.length; i++) {
	    	System.out.print(new_array[i]);
	    }
	    
	}
}