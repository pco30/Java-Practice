import java.util.Scanner;

public class Homework3_A {
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter values a, b and c: ");
		double a = obj.nextDouble();
		double b = obj.nextDouble();
		double c = obj.nextDouble();
		
		double d = (b*b) - (4*a*c);
		
		// If statements
		if (d < 0) {
			System.out.println("STOP! Use different numbers");
			System.exit(0);
		}
		if (d == 0) {
			double root = (-b)/(2*a);
			System.out.printf("Only one root = %.2f", root);
		}
		if (d > 0) {
			double root_1 = ((-b + Math.sqrt(d)) / (2 * a));
			double root_2 = ((-b - Math.sqrt(d)) / (2 * a));
			System.out.printf("Roots are = %.2f %.2f", root_2,root_1);
		}
	}
}