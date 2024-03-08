package assignment;

public class StringManipulationExamplePrgm22
{
    public static void printNameInDifferentCases(String name)
    {
        // Convert to uppercase
        String upperCaseName = name.toUpperCase();
        System.out.println("Uppercase: " + upperCaseName);

        // Convert to lowercase
        String lowerCaseName = name.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseName);
    }

    public static void main(String[] args)
    {
        printNameInDifferentCases("Narendra Modi");
    }

}
