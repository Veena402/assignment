package assignment;

public class NumberFinderPrgrm5
{
    public static void findNumber() {
        // Run a for loop from 500 to 1000
        for (int i = 500; i <= 1000; i++) {
            // Check if the current number is 808
            if (i == 808) {
                // Print the number if found
                System.out.println("Number found: " + i);
            }
        }
    }
    public static void main(String[] args)
    {
        findNumber();
    }

}
