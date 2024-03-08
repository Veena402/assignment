package assignment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateExamplePrgrm14
{
    public String getCurrentDateAsString()
    {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Format the current date as a string
        String currentDateAsString = currentDate.format(formatter);

        // Return the formatted date string
        return currentDateAsString;
    }

    public static void main(String[] args)
    {
        // Create an instance of CurrentDateExamplePrgrm14
        CurrentDateExamplePrgrm14 example = new CurrentDateExamplePrgrm14();

        // Print the current date
        System.out.println("Current Date: " + example.getCurrentDateAsString());
    }
}
