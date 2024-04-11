public class OddOccurringElement {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
        System.out.println("The odd occurring element is " + findOddOccurringElement(arr));
    }

    public static int findOddOccurringElement(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
