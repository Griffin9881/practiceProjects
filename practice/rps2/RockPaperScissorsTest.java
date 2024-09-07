package practice.rps2;

public class RockPaperScissorsTest {
    public static void main(String[] args) {
        System.out.println("Rock Paper Scissors Test Cases:");
        PaperBeatsRockTest();
    }

    public static void PaperBeatsRockTest() {
        RockPaperScissors rps = new RockPaperScissors();
        Player player1 = Player.PAPER;
        Player player2 = Player.ROCK;
        Outcome result = rps.play(player1, player2);
        if (result.equals(Outcome.WIN)) {
            System.out.println("PaperBeatsRockTest Passed");
        } else {
            System.out.println("PaperBeatsRockTest Failed");
        }
    }
}
