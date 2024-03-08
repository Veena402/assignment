package assignment;

public class StringManipulationExamplePrgr8
{
    public static void main(String[] args)
    {
        String sentence = "Welcome To Java";

        // Split the sentence into an array of words based on space character
        String[] words = sentence.split(" ");

        // Count the number of spaces (words.length - 1)
        int spaceCount = words.length - 1;
        System.out.println("Number of spaces: " + spaceCount);

        // Print only the first word
        if (words.length > 0) {
            System.out.println("First word: " + words[0]);
        }
        else
        {
            System.out.println("No words found in the sentence.");
        }
    }
}
