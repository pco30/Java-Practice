Problem 1:
Add a method to get the nth (0 based) string in our Linked list implementation :
public String getStringAt(int n)
You should throw an NoSuchElementException if n is negative, or n is bigger or equal to the number of nodes, or the linked list is empty:
import java.util.NoSuchElementException;
if (some condition){
    throw new NoSuchElementException("nth node not available in linked list");
}


Problem 2:
Write a method that performs an addition by one:
int[] addOne(int[] array)
where array is an array of integer representing the digits of a decimal integer; the returned array representing the results. Note that array[array.length-1] is  one's unit, array[array.length-2] is ten's unit, etc. For example:
[1, 2, 3, 4] => [1, 2, 3, 5].
[9, 9, 9] => [1, 0, 0, 0]
[2, 1, 4, 5, 9] => [2, 1, 4, 6, 0]
