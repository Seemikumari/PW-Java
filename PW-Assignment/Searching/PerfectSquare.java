public class PerfectSquare {
    public static void main(String[] args) {
        int num1 = 16;
        int num2 = 14;

        System.out.println(num1 + " is a perfect square: " + isPerfectSquare(num1));
        System.out.println(num2 + " is a perfect square: " + isPerfectSquare(num2));
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false; // Negative numbers are not perfect squares
        }
        
        long low = 0;
        long high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (square == num) {
                return true; // Found perfect square
            } else if (square < num) {
                low = mid + 1; // Adjust search range
            } else {
                high = mid - 1; // Adjust search range
            }
        }

        return false; // Not a perfect square
    }
}
