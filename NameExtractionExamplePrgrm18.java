package assignment;

public class NameExtractionExamplePrgrm18
{
    public static String extractFirstName(String fullName) {
        int spaceIndex = fullName.indexOf(' ');
        if (spaceIndex != -1) {
            return fullName.substring(0, spaceIndex);
        } else {
            return fullName; // If only one name is provided
        }
    }

    public String extractSecondName(String fullName) {
        int spaceIndex = fullName.indexOf(' ');
        if (spaceIndex != -1) {
            return fullName.substring(spaceIndex + 1);
        } else {
            return ""; // If only one name is provided
        }
    }

    public static void main(String[] args)
    {
        NameExtractionExamplePrgrm18 nameExtractionExample = new NameExtractionExamplePrgrm18();

        String name1 = "Sachin Tendulkar";
        String name2 = "Rahul Dravid";

        // Extract first name from "Sachin Tendulkar"
        String firstName = extractFirstName(name1);
        System.out.println("First name: " + firstName);

        // Extract second name from "Rahul Dravid"
        String secondName = nameExtractionExample.extractSecondName(name2);
        System.out.println("Second name: " + secondName);
    }

}
