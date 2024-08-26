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

    public static void ScissorsBeatsPaper() {
        RockPaperScissors  rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.SCISSORS, Moves.PAPER);
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

    public static void paperLosesScissors() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.PAPER, Moves.SCISSORS);
        if (results == Results.PLAYER2) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void rockLosesPaper() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.ROCK, Moves.PAPER);
        if (results == Results.PLAYER2) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void rockTie() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.ROCK, Moves.ROCK);
        if (results == Results.TIE) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void PaperTie() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.PAPER, Moves.PAPER);
        if (results == Results.TIE) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }

    public static void scissorsTie() {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        Results results = rockPaperScissors.play(Moves.SCISSORS, Moves.SCISSORS);
        if (results == Results.TIE) {
            System.out.println("Test Passes");
        } else {
            System.out.println("Test Fails");
        }
    }
}
