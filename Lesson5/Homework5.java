// Import relevant libraries
import java.util.Scanner;

// Second question
public class Homework5 {
	// Main method to print averages and check for further calculations
	public static void main(String [] args) {
		Scanner obj = new Scanner(System.in); 
		
		while (true) {
			// Call method to compute the positive average
			double average = Positive_Average(obj);
			System.out.printf("The average is: $ %.2f%n" , average);
			
			// Ask if you want to compute another average
			System.out.printf("Do you want to compute another average (y/n)?");
			String input = obj.next();
			
            if (input.equalsIgnoreCase("n")) {
                break;
            }
		}
	}

	// Method to calculate Positive averages and stop when negative number is inputted
public static double Positive_Average(Scanner obj) {
    double positive_sum = 0;
    int len = 0;
    
    System.out.print("Enter non-negative numbers (enter a negative number to finish):");
    
    // (len != -1) same as true
    while (len != -1) {
        double value = obj.nextDouble();
        
        // Halt when negative number inputed
        if (value < 0) {
            break;
        }
        
        // Append values to positive sum
        positive_sum += value;
        len++;
    }
    
    // Sanity check to prevent error when no number is inputed
    if (len == 0) {
        return 0;
    }
    
    // Calculate the average
    double average = positive_sum / len;
    return average;
}
}


// Tried using arrays. Need to learn to avoid them for now
//public static double Calc(Scanner obj) {
//	double sum = 0;
//	double len = 0;
//	
//	System.out.println("Enter a stream of non-negative numbers (negative when finished): "); 
//
//	while(true) {
//		int a = obj.nextInt();
//		double[] numbers = new double[a];
//		for (double i: numbers) {
//			if(i < 0) {
//				break;
//			}
//			else {
//				sum += i;
//				len ++;
//			}
//		}
//	}
//	if (len == 0) {
//		return 0;
//	}
//	
//	double average =  sum/len;
//	return average;
//}
//}