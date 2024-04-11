public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
        int target1 = 4;

        int[] arr2 = {2, 2, 2, 6, 6, 18, 29, 30, 30, 30};
        int target2 = 15;

        System.out.println("Last occurrence of " + target1 + " in arr1: " + lastOccurrence(arr1, target1));
        System.out.println("Last occurrence of " + target2 + " in arr2: " + lastOccurrence(arr2, target2));
    }

    public static int lastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
