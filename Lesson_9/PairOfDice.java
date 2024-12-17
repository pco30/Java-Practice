public class PairOfDice {
	// Getter for die1
	public int getDie1() {
		return die1;
	}
	// Setter for die1
	public void setDie1(int die1) {
		this.die1 = die1;
	}
	// Getter for die2
	public int getDie2() {
		return die2;
	}
    // Setter method for die2
	public void setDie2(int die2) {
		this.die2 = die2;
	}
	
    //Private instance for variables 1 and 2
	private int die1;
	private int die2;
	
	public PairOfDice() {
		// Constructor Rolls the dice, so that they initially
		// show some random values.
		roll();
	}
	
	public PairOfDice(int val1, int val2) {
		// Constructor. Creates a pair of dice that are initially
		// showing the values val1 and val2
		die1 = val1;
		die2 = val2;
	}
	
	public void roll() {
		// Roll the dice by setting each of the dice to be a
		// random number between 1 and 6
		die1 = (int)(Math.random() *6) + 1;
		die2 = (int)(Math.random() *6) + 1;
	}
}