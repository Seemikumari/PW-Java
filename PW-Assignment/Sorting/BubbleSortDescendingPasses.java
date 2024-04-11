public class BubbleSortDescendingPasses {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 6, 0};
        System.out.println("Input Array:");
        printArray(array);

        int passes = bubbleSortDescendingPasses(array);

        System.out.println("Number of passes required: " + passes);
        System.out.println("Output Array:");
        printArray(array);
    }

    public static int bubbleSortDescendingPasses(int[] array) {
        int passes = 0;
        int n = array.length;
        boolean swapped;
        
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] < array[i + 1]) {
                    // Swap array[i] and array[i+1]
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            passes++;
        } while (swapped);

        return passes;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
