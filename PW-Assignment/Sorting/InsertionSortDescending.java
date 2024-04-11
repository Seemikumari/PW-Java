public class InsertionSortDescending {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 0};
        System.out.println("Input Array:");
        printArray(array);

        insertionSortDescending(array);

        System.out.println("Output Array:");
        printArray(array);
    }

    public static void insertionSortDescending(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key, to one position ahead
            // of their current position
            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
