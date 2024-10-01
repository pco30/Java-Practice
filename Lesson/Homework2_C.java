// Generate and print out a random number between 10 and 19
public class Homework2_C {
		public static void main(String [] args) {
			// Efficient Way AKA Method 1
			int generated_num = (int)(Math.random() *(19-10+1)+10); // (int)(Math.random() *(max - min + 1) + min)
			System.out.println("Generated number (Method 1): " + generated_num);
			
			// Inefficient Way AKA Method 2
			// Number generation for number 0 to 19
			int gen_num = (int)(Math.random() *20);
			// conditional statement to only print out if greater than or equal to 10
			if (gen_num >= 10) {
			// Output to console
			System.out.println("Generated number (Method 2): " + gen_num);
			}
			else {
				System.out.println("Run again to get generated number using Method 2");
			}	
		}
}