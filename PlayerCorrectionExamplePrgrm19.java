package assignment;

public class PlayerCorrectionExamplePrgrm19
{
    public static void main(String[] args)
    {
        PlayerCorrectionExamplePrgrm19 playerCorrectionExample = new PlayerCorrectionExamplePrgrm19();

        String player1 = "Davi Beckham";
        String player2 = "Lionel Messi - 400 goals";

        String correctedPlayer1 = playerCorrectionExample.correctSpelling(player1);
        System.out.println("Corrected player 1: " + correctedPlayer1);

        String correctedPlayer2 = updateGoals(player2, 579);
        System.out.println("Corrected player 2: " + correctedPlayer2);
    }

    public String correctSpelling(String playerName)
    {
        return playerName.replace("Davi", "David");
    }

    public static String updateGoals(String playerInfo, int newGoals)
    {
        return playerInfo.replaceAll("\\d+", String.valueOf(newGoals));
    }
}
