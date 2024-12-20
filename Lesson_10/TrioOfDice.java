package java_work;

public class TrioOfDice extends PairOfDice {
    private int die3;

    public TrioOfDice() {
        super(); 
        roll();  
    }

    // Constructor that initializes all three dice with input values
    public TrioOfDice(int val1, int val2, int val3) {
        super(val1, val2); 
        this.die3 = val3; // Sets the value for die3
    }

    public void roll() {
        super.roll(); // Rolls die1 and die2
        die3 = (int) (Math.random() * 6) + 1; // Rolls die3
    }

    // Getter for die3
    public int getDie3() {
        return die3;
    }

    // Setter for die3
    public void setDie3(int die3) {
        this.die3 = die3;
    }

    // Method to print all 3 die values
    public void printValue() {
        System.out.println("Die1: " + getDie1() + ", Die2: " + getDie2() + ", Die3: " + die3);
    }
}
