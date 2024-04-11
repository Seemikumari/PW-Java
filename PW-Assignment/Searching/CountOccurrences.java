public class CountOccurrences {
    public static void main(String[] args) {
        int[] nums = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int target1 = 5;
        int target2 = 6;

        int count1 = countOccurrences(nums, target1);
        int count2 = countOccurrences(nums, target2);

        System.out.println("Target " + target1 + " occurs " + count1 + " times");
        System.out.println("Target " + target2 + " occurs " + count2 + " times");
    }

    public static int countOccurrences(int[] nums, int target) {
        int firstIndex = findFirstIndex(nums, target);
        int lastIndex = findLastIndex(nums, target);

        if (firstIndex == -1) {
            return 0; // Target not found
        }

        return lastIndex - firstIndex + 1;
    }

    private static int findFirstIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target && (mid == 0 || nums[mid - 1] != target)) {
                return mid; // Found the first occurrence of target
            } else if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // Target not found
    }

    private static int findLastIndex(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target && (mid == nums.length - 1 || nums[mid + 1] != target)) {
                return mid; // Found the last occurrence of target
            } else if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
