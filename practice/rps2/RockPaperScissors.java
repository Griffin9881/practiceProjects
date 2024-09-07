package practice.rps2;

public class RockPaperScissors {
    public Outcome play(Player player1, Player player2) {
        Outcome outcome = Outcome.TIE;
        if (player1.equals(Player.PAPER) && player2.equals(Player.ROCK)) {
            outcome = Outcome.WIN;
        }
        return outcome; 
    }
}
