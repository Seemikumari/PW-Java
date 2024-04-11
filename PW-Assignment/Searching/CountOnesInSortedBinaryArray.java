public class CountOnesInSortedBinaryArray {
    public static void main(String[] args) {
        int[] arr1 = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
        int[] arr2 = {0, 0, 0, 0, 0, 1, 1};
        
        System.out.println("Total number of 1's in arr1: " + countOnes(arr1));
        System.out.println("Total number of 1's in arr2: " + countOnes(arr2));
    }

    public static int countOnes(int[] arr) {
        int firstOneIndex = findFirstOne(arr);
        if (firstOneIndex == -1) {
            return 0; // No 1's found
        }

        int lastOneIndex = findLastOne(arr);
        return lastOneIndex - firstOneIndex + 1;
    }

    private static int findFirstOne(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0)) {
                return mid; // Found the first occurrence of 1
            } else if (arr[mid] == 1) {
                high = mid - 1; // Move left to find the first occurrence
            } else {
                low = mid + 1;
            }
        }

        return -1; // No 1's found
    }

    private static int findLastOne(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1 && (mid == arr.length - 1 || arr[mid + 1] == 0)) {
                return mid; // Found the last occurrence of 1
            } else if (arr[mid] == 1) {
                low = mid + 1; // Move right to find the last occurrence
            } else {
                high = mid - 1;
            }
        }

        return -1; // No 1's found
    }
}
