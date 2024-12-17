
Problem 1:
In the slides for PairOfDice class, the instance variables die1 and die2 are declared to be public. They really should be private, so that they would be protected from being changed from outside the class. Write another version of the PairOfDice class in which the instance variables die1 and die2 are private. Your class will need “getter” methods that can be used to find out the values of die1 and die2. (The idea is to protect their values from being changed from outside the class, but still to allow the values to be read.)

Problem 2:
Design an OrderedInt class to store an arrray of integers in ascending order.
The OrderedInt class should have the following members:
private int size: an integer to record total number of integers stored.
private int[] array: an integer array to store integers in ascending order
public void insert(int n): method to insert integer n into the array. If insertion is succeful, size should increase by 1.
public int getIntAt(int n): return the integer stored in array at index n
public int getSize(): return size, total number of integers stored in array
OrderdInt(int n): constructor to create an array of length n and initilize size to 0.
As an example:
OrderedInt oi = new OrderedInt(100);
will create an OrderedInt object with array of length 100; and size should be 0 because no integer is inserted yet.
oi.insert(10) will increase size to 1 and array will become [10].
oi.insert(10) will increase size to 2 and array will become [10, 10].
oi.insert(15) will increase size to 3 and array will become [10, 10, 15].
oi.insert(5) will increase size to 4 and array will become [5, 10, 10, 15].
oi.getIntAt(1) will return 10 because array[1] is 10.
oi.getSize() should return 4 because size is 4.
