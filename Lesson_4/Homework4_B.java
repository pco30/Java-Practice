// Import relevant libraries
import java.util.Scanner;

public class Homework4_B {
	public static void main(String [] args) {
		// Scanner object
		Scanner obj = new Scanner(System.in); 
		int a = (int)(Math.random() * (100-1+1)+1); 
		
		// Testing 
		// System.out.println(a);
		// int a = 57;
		
		System.out.print("Enter your guess (between 1 and 100): ");
		int guess = obj.nextInt();
		
		// while loop checking the condition if guess = winning number,a
		while (guess != a) {
			if ((guess < 1) || (guess > 100)) {
				System.out.println("Invalid guess, try again!");
				System.out.print("Guess again: ");
				guess = obj.nextInt();
			}
			if (guess > a) {
				System.out.println("Too high!");
				System.out.print("Guess again: ");
				guess = obj.nextInt();
			}
			if (guess < a) {
				System.out.println("Too low!");
				System.out.print("Guess again: ");
				guess = obj.nextInt();
			}	
		}
		// If guess == winning number, while loop does not run
		System.out.println("You win!");
		System.exit(0);
	}
}