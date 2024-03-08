package assignment;

public class ExceptionHandlingExample
{
    public static int divide(int num, int denom)
    {
        return num / denom;
    }

    public static void performLogic()
    {
        try
        {
            int result = divide(20, 4);
            System.out.println("Result of logic: " + result);
        }
        catch (Exception e)
        {
            System.out.println("An exception occurred in the logic: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        try
        {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        }
        catch (Exception e)
        {
            System.out.println("An exception occurred: " + e.getMessage());
        }
        finally
        {
            System.out.println("Inside finally block");
        }
    }

}
