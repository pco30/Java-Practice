import java.util.Scanner;

public class Homework3_C {
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter integer values: ");
		double a = obj.nextDouble();
		double b = obj.nextDouble();
		double c = obj.nextDouble();
		// Find minimum between a and b, then find the minimum between that variable and c
		double d = Math.min(a, b);
		double e = Math.min(c, d);
		System.out.println("The minimal number is: " + e);
	}
}