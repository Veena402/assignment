package assignment;
import java.security.SecureRandom;

public class RandomAlphaNumericGeneratorPrgrm15
{
    public String generateRandomAlphaNumeric(int length) {
        // Define the characters to be used for generating the random string
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Create a StringBuilder to store the generated random string
        StringBuilder sb = new StringBuilder(length);

        // Create a SecureRandom instance for generating random numbers
        SecureRandom random = new SecureRandom();

        // Generate random characters and append them to the StringBuilder
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }

        // Convert the StringBuilder to a String and return it
        return sb.toString();
    }

    public static void main(String[] args) {
        // Create an instance of RandomAlphaNumericGeneratorPrgrm15
        RandomAlphaNumericGeneratorPrgrm15 generator = new RandomAlphaNumericGeneratorPrgrm15();

        // Generate a random alphanumeric string of length 10 and print it
        String randomString = generator.generateRandomAlphaNumeric(10);
        System.out.println("Random Alphanumeric String: " + randomString);
    }
}
