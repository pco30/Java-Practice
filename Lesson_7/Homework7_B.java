// Import relevant libraries
import java.util.Scanner;
import java.util.InputMismatchException;

public class Homework7_B {
	public static void main(String[] args) {
		// Chosen Arbitrary roots
		double a = 1.0;
		double b = 4.0;
		double root = Root(a, b);
		System.out.printf("The root of the function is approximately: %.2f%n" , root);
	}
	
	// Method for the equation or function 
    public static double f(double x) {
        return ((x * x) - 2);
    }
    
    // Method to find the root using the bisection method
    public static double Root(double a, double b) {
    	double c = 1;
    	while((b-a) >= 0.000000000001) {
    		c = (a+b)/2; // midpoint of a and b
    		
    		if (f(c) == 0) { // c is the root
    			break;
    		}
    		// Conditions to move the initial root values; a and b
    		else if ((f(c) > f(a)) && (f(c) < 0)) {
    			a = c;
    		}
    		else if ((f(c) < f(b)) && (f(c) > 0)) {
    			b = c;
    		}
    	}
    	return c;
    }
}