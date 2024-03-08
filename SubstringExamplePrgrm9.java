package assignment;

public class SubstringExamplePrgrm9
{
    public static String extractSubstring(String originalString) {
        // Extracting substring from index 5 to the end of the string
        return originalString.substring(5);
    }
    public static void main(String[] args) {
        String originalString = "ABCDE12345";

        // Calling the method to extract the substring
        String subString = extractSubstring(originalString);

        // Printing the extracted substring
        System.out.println("Substring: " + subString);
    }

}
