Problem 1:

Write a program that reads a stream of integers from a file and writes only the positive numbers to a second file. The user should be prompted to enter the names of both the input file and output file in main(), and then main() should attempt to open both files (providing an error if there is an error during this process). The main() method should then call the process() method to read all the integers from the input file and write only the positive integers to the output file. The process() method takes as arguments a Scanner to read from the input and a PrintWriter to write to the output. You can assume that if you are able to successfully open the input file, then there will only be integers in it.


Problem 2:

Write a method printTri(int n) to print out a triangle of n rows. There is one "*" in the first row; and there are three "*"s in the second row; etc. The triangle should be symmetrical, so you need to take care how many space charactors to print out. As an example, printTri(5) should print out the following.

    *

   ***

  *****

 *******

*********


Problem 3:
Write a method arrayShift(int[] array, n) to do circular shift to the left n times on the array:

public static void arrayShift(int[] array, n)
where array is the array passed into arrayShift, n is the number of shifts.
For example, assuming array = [1, 2, 3, 4, 5], calling arrayShift(array, 1) will make array = [2, 3, 4, 5, 1]. Calling arrayShift(array, 2) will make array = [3, 4, 5, 1, 2].
