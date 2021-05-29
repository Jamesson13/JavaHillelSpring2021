package Lesson17HW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
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
    public void nameUserAndRounds(){
        System.out.print("What are your name? --> ");
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();
        System.out.println("How many games do you want to play? ");
        Scanner scan1 = new Scanner(System.in);
        rounds = scan.nextInt();
    }

    public void startGame()  {
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

        String log = "\n " + numberOfGames + " Раунд"
        + "\n Ход компьютера: " + computerMove
        + "\n Ход игрока: " + userMove;



        if (rounds!=numberOfGames) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }

        Path currentRelativePath = Paths.get("src/main/java/Lesson17HW/GameLog");
        String s = currentRelativePath.toAbsolutePath().toString();
        File gameLog = new File(s);
        gameLog.mkdir();

        String fileName = "Log_" + name.toLowerCase(Locale.ROOT) + "_" +
                new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());


        try(FileWriter writer = new FileWriter(s+"/"+fileName, true))
        {
            writer.write("\n ");
            writer.write(log);
            writer.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void printGameStats()  {

        int wins = userScore;
        int losses = computerScore;
        int draws = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) draws) / 2) / numberOfGames;

        Path currentRelativePath = Paths.get("src/main/java/Lesson17HW/GameStates");
        String s = currentRelativePath.toAbsolutePath().toString();
        File gameStates = new File(s);
        gameStates.mkdir();

        String fileName = "States_" + name.toLowerCase(Locale.ROOT) + "_" +
                new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());


        String info = " Player name: "+ name
                + "\n Wins: "+ wins
                + "\n Losses: " + losses
                + "\n Draws: " + draws
                + "\n Percent wins: "+ percentageWon*100+"%";

        try(FileWriter writer = new FileWriter(s+"/"+fileName, true))
        {
            writer.write(info);
            writer.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Good game " + name);
        System.out.print("+");
        printDashes(68);
        System.out.println("+");


        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WINS", "LOSSES", "draws", "GAME PLAYED", "WINS PERCENT");

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
