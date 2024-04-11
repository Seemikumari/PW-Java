public class CountSetBits {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 15;

        System.out.println("Input: " + number1 + ", Number of set bits: " + countSetBits(number1));
        System.out.println("Input: " + number2 + ", Number of set bits: " + countSetBits(number2));
    }

    public static int countSetBits(int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
}
