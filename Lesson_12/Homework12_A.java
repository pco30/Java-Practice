// Import relevant libraries
import java.util.ArrayList;

public class Homework12_A {
	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<String>();
		n.add("boy");
		n.add("girl");
		n.add("man");
		n.add("woman");
		toUpper(n);
	}
	
	public static void toUpper(ArrayList<String> als) {
		for(int i = 0; i < als.size(); i++) {
			als.set(i, als.get(i).toUpperCase());
		}
		
		System.out.println(als); // Print the array list
	}
}