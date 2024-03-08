package assignment;

public class NameComparisonExamplePrgrm20
{
    public static void main(String[] args)
    {
        String name1 = "Cristiano Ronaldo";
        String name2 = "Ronaldo Nazario";

        boolean isEqual = compareNames(name1, name2);

        if (isEqual)
        {
            System.out.println("Names are equal");
        }
        else
        {
            System.out.println("Names are not equal");
        }
    }

    public static boolean compareNames(String name1, String name2)
    {
        return name1.equals(name2);
    }
}
