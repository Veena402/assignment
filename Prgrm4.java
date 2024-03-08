package assignment;

public class Prgrm4
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 5;
        String operation = "add"; // Change the operation as needed

        // Call the function to perform the operation
        int result = performOperation(num1, num2, operation);
        System.out.println("Result: " + result);
    }

    public static int performOperation(int num1, int num2, String operation) {
        int result = 0;

        // Perform the operation based on the string parameter
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }

        return result;
    }
}
