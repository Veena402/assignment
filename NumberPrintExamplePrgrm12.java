package assignment;

public class NumberPrintExamplePrgrm12
{
    public static void main(String[] args) {
        printNumbersUsingForLoop();
        System.out.println("----------------------");
        printNumbersUsingWhileLoop();
    }

    public static void printNumbersUsingForLoop() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
    public static void printNumbersUsingWhileLoop() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }
}
