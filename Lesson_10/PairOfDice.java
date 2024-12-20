package java_work;

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

    // Private instance variables for dice
    private int die1;
    private int die2;

    // Default constructor
    public PairOfDice() {
        roll();
    }

    // Constructor with initial values
    public PairOfDice(int val1, int val2) {
        die1 = val1;
        die2 = val2;
    }

    // Method to roll the dice
    public void roll() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
    }

    // Method to print the values of the dice
    public void printValue() {
        System.out.println("Die1: " + die1 + ", Die2: " + die2);
    }
}

