package practice;

public class RockPaperScissors {
    public RockPaperScissors() {

    }

    public static Results play(Moves move1, Moves move2) {
        if (move1 == Moves.PAPER && move2 == Moves.ROCK || move1 == Moves.SCISSORS && move2 == Moves.PAPER || move1 == Moves.ROCK && move2 == Moves.SCISSORS) {
            return Results.PLAYER1;
        } else if (move1 == Moves.ROCK && move2 == Moves.PAPER || move1 == Moves.PAPER && move2 == Moves.SCISSORS || move1 == Moves.SCISSORS && move2 == Moves.ROCK){
            return Results.PLAYER2;
        } else {
            return Results.TIE;
        }
    }
}
