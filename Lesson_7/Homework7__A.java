// Import relevant libraries
import java.util.Scanner;

public class Homework7__A {    
    public static void main(String[] args) {
        try {
            int a = getIntFromInput();
            System.out.println("The user input is: " + a);
        } catch (NumberFormatException e) {
            System.out.println("Error!!! Input not valid");
            e.printStackTrace();
        }
    }
    
    // Method to convert string to integer
    public static int getIntFromInput() {
    	// Initialize scanner object
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String user_string = obj.next();
        return Integer.parseInt(user_string); 
    }
}
