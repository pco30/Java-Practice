public class Homework7_C {
    public static void main(String[] args) {
        int[] my_array = {10, 20, 30, 5, 2, 12, 4, 12, 34, 2, 3, 6, 7, 12, 2, 3, 1, 2, 30};
        int newSize = removeAllOccu(my_array, 2, my_array.length);

        // Print array 
        for (int i = 0; i < newSize; i++) {
            System.out.print(my_array[i] + " ");
        }
    }
    
    // Method to remove all occurences of a particular integer in an array
    public static int removeAllOccu(int[] array, int toRemove, int size) {
        int finalSize = size;
        for (int i = 0; i < finalSize; i++) {
            if (array[i] == toRemove) {
                // Shift elements to the left
                for (int z = i; z < finalSize - 1; z++) {
                    array[z] = array[z + 1];
                }
                finalSize--; // Reduce the array size
                i--; // Adjust index to check the current position again
            }
        }
        return finalSize;
    }
}
