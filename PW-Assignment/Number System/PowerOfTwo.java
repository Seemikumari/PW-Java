public class PowerOfTwo {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 32;

        System.out.println("Input 1: n = " + n1);
        System.out.println("Output 1: " + isPowerOfTwo(n1));

        System.out.println("Input 2: n = " + n2);
        System.out.println("Output 2: " + isPowerOfTwo(n2));
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
