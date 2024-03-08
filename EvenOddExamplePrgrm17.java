package assignment;

public class EvenOddExamplePrgrm17
{
    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    public static void main(String[] args) {
        int number = 7; // You can change this number to test different values

        String result = checkEvenOrOdd(number);
        System.out.println(number + " is " + result + ".");
    }

}
