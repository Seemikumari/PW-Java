public class BinaryRepresentation {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 10;

        System.out.println("Input 1: number = " + number1);
        System.out.println("Output 1: " + toBinary(number1));

        System.out.println("Input 2: number = " + number2);
        System.out.println("Output 2: " + toBinary(number2));
    }

    public static String toBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
