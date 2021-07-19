package Lesson24HW;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class RockScissorsPaper {

    private User user;
    private Computer computer;
    private String name;
    private int userScore;
    private int computerScore;
    private int numberOfGames;
    private int rounds;

    public RockScissorsPaper() {
        user = new User();
        computer = new Computer();
        name = "";
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
        rounds = 0;
    }

    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.gameResult");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");
    private static final Logger loggerOut = LoggerFactory.getLogger("logger.stdout");

    public void nameUserAndRounds(){
        loggerOut.info("What are your name? --> ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        do {
            loggerOut.info("How many games do you want to play? ");
            while (!scan.hasNextInt()) {
                loggerError.error("Entered wrong number of rounds");
                scan.next();
            }
            rounds = scan.nextInt();
        }while (rounds <= 0);
    }


    public void startGame()  {
        loggerOut.info("ROCK, SCISSORS, PAPER!");
        loggerInfo.info("RockScissorsPaper start");
        Moves userMove = user.getMove();
        Moves computerMove = computer.getMove();
        loggerOut.info("\nYour tern  " + userMove + ".");
        loggerOut.info("Computer tern  " + computerMove + ".\n");
        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                loggerOut.info("Ничья!");
                break;
            case 1:
                loggerOut.info(userMove + " beats " + computerMove + ". You win!");
                userScore++;
                break;
            case -1:
                loggerOut.info(computerMove + " beats " + userMove + ". You lose.");
                computerScore++;
                break;
        }
        numberOfGames++;

        loggerOut.info("\n " + numberOfGames + " Раунд"
        + "\n Ход компьютера: " + computerMove
        + "\n Ход игрока: " + userMove);



        if (rounds!=numberOfGames) {
            System.out.println();
            startGame();
        }else {
            loggerWarn.warn("Last Round");
            printGameStats();
        }

    }


    private void printGameStats()  {

        int wins = userScore;
        int losses = computerScore;
        int draws = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) draws) / 2) / numberOfGames;

        loggerOut.info("\n");
        loggerOut.info("User : " + name);
        loggerOut.info("Games played : " + rounds);
        loggerOut.info("Wins : " + wins);
        loggerOut.info("Loses : " + losses);
        loggerOut.info("Draws : " + draws);
        loggerOut.info("\"Percent of Wins : " + percentageWon);
        loggerOut.info("\n");

        loggerResult.info("User : " + name + " | " + "Games played : " + rounds + " | " +
                "Wins : " + wins + " | " + "Loses : " + losses + " | " +
                "Draws : " + draws + " | " + "Percent of Wins : " + percentageWon);
    }

}
