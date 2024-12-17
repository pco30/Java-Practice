public class OrderedInt {
    private int size;    
    private int[] array;

    // Constructor 
    public OrderedInt(int n) {
        this.size = 0;
        this.array = new int[n];
    }
    
    public static void main(String[] args) {
        OrderedInt oi = new OrderedInt(10);
        oi.insert(10);
        oi.insert(10);
        oi.insert(15);
        oi.insert(5);

        System.out.println("Array size is " + oi.getSize());
        
        // Print array
        for (int i = 0; i < oi.getSize(); i++) {
            System.out.print(oi.getIntAt(i) + " "); 
        }
    }
    
    // Method to insert integer n into the array then order the array
    public void insert(int n) {
        if (size >= array.length) {
            System.out.println("Array is full.");
            return;
        }

        // Find the position to insert n
        int i = size - 1;
        while (i >= 0 && array[i] > n) {
            array[i + 1] = array[i]; // Shift elements to the right
            i--;
        }

        // Insert n 
        array[i + 1] = n;
        size++; // Increase the size after successful insertion
    }

    // Method to return value at index n
    public int getIntAt(int n) {
        return array[n];
    }

    // Method to return the size of array
    public int getSize() {
        return size;
    }

}
