package practice;

public class Test {
    public static void main(String[] args) {
        paperBeatsRock();
        RockBeatsScissors();
        scissorsLosesRock();
    }
    public static void paperBeatsRock() {
        RockPaperScissors  rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.PAPER, Moves.ROCK);
        if (results == Results.PLAYER1) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }
    
    public static void RockBeatsScissors() {
        RockPaperScissors  rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.ROCK, Moves.SCISSORS);
        if (results == Results.PLAYER1) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void scissorsLosesRock() {
        RockPaperScissors  rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.SCISSORS, Moves.ROCK);
        if (results == Results.PLAYER2) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }
}
