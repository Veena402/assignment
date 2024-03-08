package assignment;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class CurrentMonthExamplePrgrm16
{
    public void displayCurrentMonth()
    {
        // Get the current month using java.time.Month enum
        Month currentMonth = YearMonth.now().getMonth();

        // Convert the current month to its corresponding name
        String monthName = currentMonth.getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        // Display the current month
        System.out.println("The current month is: " + monthName);

        // Switch statement to select the current month
        switch (currentMonth) {
            case JANUARY:
                System.out.println("It's January!");
                break;
            case FEBRUARY:
                System.out.println("It's February!");
                break;
            case MARCH:
                System.out.println("It's March!");
                break;
            case APRIL:
                System.out.println("It's April!");
                break;
            case MAY:
                System.out.println("It's May!");
                break;
            case JUNE:
                System.out.println("It's June!");
                break;
            case JULY:
                System.out.println("It's July!");
                break;
            case AUGUST:
                System.out.println("It's August!");
                break;
            case SEPTEMBER:
                System.out.println("It's September!");
                break;
            case OCTOBER:
                System.out.println("It's October!");
                break;
            case NOVEMBER:
                System.out.println("It's November!");
                break;
            case DECEMBER:
                System.out.println("It's December!");
                break;
            default:
                System.out.println("Invalid month!");
                break;
        }
    }
    public static void main(String[] args)
    {
        CurrentMonthExamplePrgrm16 currentMonthExample = new CurrentMonthExamplePrgrm16();
        currentMonthExample.displayCurrentMonth();
    }


}
