import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to be searched (X)
        System.out.print("Enter the element to be searched (X): ");
        int X = scanner.nextInt();

        // Perform linear search
        int index = linearSearch(array, X);

        // Output the result
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in array");
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int X) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == X) {
                return i; // Return the index if element found
            }
        }
        return -1; // Return -1 if element not found
    }
}
