public class SelectionSortDescendingIterations {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 0};
        int iterations = selectionSortDescending(array);
        System.out.println("Total iterations required: " + iterations);
    }

    public static int selectionSortDescending(int[] array) {
        int n = array.length;
        int iterations = 0;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                iterations++; // Increment iteration count for each comparison
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap array[i] and array[maxIndex]
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }

        return iterations;
    }
}
