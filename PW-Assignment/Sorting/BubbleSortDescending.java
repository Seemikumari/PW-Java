public class BubbleSortDescending {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 0};
        System.out.println("Input Array:");
        printArray(array);

        bubbleSortDescending(array);

        System.out.println("Output Array:");
        printArray(array);
    }

    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
