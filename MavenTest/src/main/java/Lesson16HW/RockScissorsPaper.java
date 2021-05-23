package Lesson16HW;

import java.util.Scanner;

public class RockScissorsPaper {

    private User user;
    private Computer computer;
    private String name;
    private int userScore;
    private int computerScore;
    private int numberOfGames;

    public RockScissorsPaper() {
        user = new User();
        computer = new Computer();
        name = "";
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }
    public void nameUser(){
        System.out.print("What are your name? --> ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
    }

    public void startGame() {

        System.out.println("ROCK, SCISSORS, PAPER!");
        Moves userMove = user.getMove();
        Moves computerMove = computer.getMove();
        System.out.println("\nYour tern  " + userMove + ".");
        System.out.println("Computer tern  " + computerMove + ".\n");
        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                System.out.println("Ничья!");
                break;
            case 1:
                System.out.println(userMove + " beats " + computerMove + ". You win!");
                userScore++;
                break;
            case -1:
                System.out.println(computerMove + " beats " + userMove + ". You lose.");
                computerScore++;
                break;
        }
        numberOfGames++;

        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }


    private void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int draws = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) draws) / 2) / numberOfGames;


        System.out.println("Good game " + name);
        System.out.print("+");
        printDashes(68);
        System.out.println("+");


        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WINS", "LOSSES", "draws", "GAME PLAYED", "WINS PERCENT");

        // Вывод линии
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");


        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, draws, numberOfGames, percentageWon * 100);


        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}
