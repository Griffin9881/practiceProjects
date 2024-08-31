package practice;

public class Test {
    public static void main(String[] args) {
        paperBeatsRock();
        RockBeatsScissors();
        ScissorsBeatsPaper();
        scissorsLosesRock();
        paperLosesScissors();
        rockLosesPaper();
        rockTie();
        PaperTie();
        scissorsTie();
    }
    public static void paperBeatsRock() {
        Results results = RockPaperScissors.play(Moves.PAPER, Moves.ROCK);
        if (results == Results.PLAYER1) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }
    
    public static void RockBeatsScissors() {
        Results results = RockPaperScissors.play(Moves.ROCK, Moves.SCISSORS);
        if (results == Results.PLAYER1) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void ScissorsBeatsPaper() {
        Results results = RockPaperScissors.play(Moves.SCISSORS, Moves.PAPER);
        if (results == Results.PLAYER1) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void scissorsLosesRock() {
        Results results = RockPaperScissors.play(Moves.SCISSORS, Moves.ROCK);
        if (results == Results.PLAYER2) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void paperLosesScissors() {
        Results results = RockPaperScissors.play(Moves.PAPER, Moves.SCISSORS);
        if (results == Results.PLAYER2) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void rockLosesPaper() {
        Results results = RockPaperScissors.play(Moves.ROCK, Moves.PAPER);
        if (results == Results.PLAYER2) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void rockTie() {
        Results results = RockPaperScissors.play(Moves.ROCK, Moves.ROCK);
        if (results == Results.TIE) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void PaperTie() {
        Results results = RockPaperScissors.play(Moves.PAPER, Moves.PAPER);
        if (results == Results.TIE) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void scissorsTie() {
        Results results = RockPaperScissors.play(Moves.SCISSORS, Moves.SCISSORS);
        if (results == Results.TIE) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }
}
