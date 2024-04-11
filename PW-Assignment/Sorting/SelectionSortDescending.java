public class SelectionSortDescending {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 0};
        System.out.println("Input Array:");
        printArray(array);

        selectionSortDescending(array);

        System.out.println("Output Array:");
        printArray(array);
    }

    public static void selectionSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap array[i] and array[maxIndex]
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
