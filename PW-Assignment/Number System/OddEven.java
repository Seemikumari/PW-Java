public class OddEven {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 3;

        System.out.println("Input " + number1 + ", Even: " + isEven(number1));
        System.out.println("Input " + number2 + ", Even: " + isEven(number2));
    }

    public static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}
