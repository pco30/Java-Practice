public class Homework8_B {
	public static void main(String[] args) {
		printTri(8);
	}
	
	// Method to print triangle
	public static void printTri(int n) {
		int b = 1; //  Initialize to base case
		for(int i = 1; i <= n; i++) {
			System.out.printf("\n");
			b = b+2;
			int blank = n-i;
			for(int k = 0; k < blank; k++) {
				System.out.print(' '); // Print blanks
			}
			for(int j = 0; j < b-2; j++) {
				System.out.print('*'); //  Print asterisks
			}
		}
		System.out.println();
	}
}