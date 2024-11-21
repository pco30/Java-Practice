Problem 1:
Write a method
int getIntFromInput()
to get a string from user input and then convert the string to integer, using Integer.parseInt(String). Return the integer to the main method.  In the main method, handle the NumberFormatException if the string cannot be converted to an integer. If exception happens, you should print out call stack (e.printStackTrace(), where e is the exception object passed into the catch block).
This problem demonstrates that a method generating an exception can rely on the calling method for exception handling, if it is not clear what the best choice is when an exception is thrown.
Study the call stack!  It is extremely helpful information for debugging.

Problem 2:
Write a program to calculate the root of f(x)=x*x-2, i.e., solving the equation x*x-2=0, using the bisection method. The wikipedia has a very good explanation, including the algorithm, of the bisection method: https://en.wikipedia.org/wiki/Bisection_method
You are not supporsed to use any existing library to find the root. Use a loop for the iteration, or regression (to be studied in later classes) if you want more fun.

Problem 3:
Write a method to remove all occurrences of an element in an array, while keeping the original order
int removeAllOccu(int[] array, int toRemove, int size)
Where toRemove is the value of element to remove; size is the original number of elements in array, and the return value is final size of elements after removal.

Pseudo code:
finalSize = n
for i = 0 to finalSize-1
    if array[i] == toReomve
        shift all remaining elements to the left (how?)
        finalSize = finalSize – 1
        // there is a bug here, can you find it?

Test your code with different cases: no element to remove, one element to remove, multiple separated elements to remove, multiple continuous elements to remove, etc.

