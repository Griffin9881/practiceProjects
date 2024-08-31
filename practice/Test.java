package practice;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String scan;
        int randomInt = new Random().nextInt(1,4);
        String randomPlay = "";
        switch (randomInt) {
            case 1:
                randomPlay = "paper";
                break;
            case 2:
                randomPlay = "rock";
                break;
            case 3: 
                randomPlay = "scissors";
                break;
            default:
                break;
        }

        do {
            System.out.println("Rock, Paper, or Scissors?");
            scan = scanner.nextLine();
        } while (!scan.toLowerCase().equals("rock") && !scan.toLowerCase().equals("paper") && !scan.toLowerCase().equals("scissors"));

        switch (scan.toLowerCase()) {
            case "scissors":
                switch (randomPlay) {
                    case "scissors":
                        System.out.println("You Tie");
                        scissorsTie();
                        break;
                    case "paper":
                        System.out.println("You Win");
                        ScissorsBeatsPaper();
                        break;
                    case "rock":
                        System.out.println("You Lose");
                        scissorsLosesRock();
                        break;
                    default:
                        break;
                }
                break;
            case "rock":
                switch (randomPlay) {
                    case "scissors":
                        System.out.println("You Win");
                        RockBeatsScissors();
                        break;
                    case "paper":
                        System.out.println("You Lose");
                        rockLosesPaper();
                        break;
                    case "rock":
                        System.out.println("You Tie");
                        rockTie();
                        break;
                    default:
                        break;
                }
                break;
            case "paper":
                switch (randomPlay) {
                    case "scissors":
                        System.out.println("You Lose");
                        paperLosesScissors();
                        break;
                    case "paper":
                        System.out.println("You Tie");
                        PaperTie();
                        break;
                    case "rock":
                        System.out.println("You Win");
                        paperBeatsRock();
                        break;
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
        scanner.close();
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
