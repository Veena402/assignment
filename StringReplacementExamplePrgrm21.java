package assignment;

public class StringReplacementExamplePrgrm21
{
    public static String replaceName(String original, String target, String replacement)
    {
        return original.replace(target, replacement);
    }
    public static void main(String[] args)
    {
        String originalName1 = "Liverpool";
        String originalName2 = "City";

        // Replace substrings and print
        String modifiedName1 = replaceName(originalName1, "Liverpool", "Liverpool Football Club");
        System.out.println("Modified name 1: " + modifiedName1);

        String modifiedName2 = replaceName(originalName2, "City", "Manchester City");
        System.out.println("Modified name 2: " + modifiedName2);
    }

}
