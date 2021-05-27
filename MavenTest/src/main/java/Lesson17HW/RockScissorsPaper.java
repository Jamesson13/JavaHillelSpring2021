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

    public void startGame() throws IOException {



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



        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }

        String path = "/Users/vlad_kodzhebash/Documents/JavaHillelSpring2021/MavenTest/src/main/java/Lesson17HW/GameLog";
        File gameLog = new File(path);
        gameLog.mkdir();

        String fileName = "Log_" + name.toLowerCase(Locale.ROOT) + "_" +
                new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());

        Path currentRelativePath = Paths.get("src/main/java/Lesson17HW/GameLog");
        String s = currentRelativePath.toAbsolutePath().toString();

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

        String path = "/Users/vlad_kodzhebash/Documents/JavaHillelSpring2021/MavenTest/src/main/java/Lesson17HW/GameStates";
        File gameStates = new File(path);
        gameStates.mkdir();

        String fileName = "States_" + name.toLowerCase(Locale.ROOT) + "_" +
                new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());


        Path currentRelativePath = Paths.get("src/main/java/Lesson17HW/GameStates");
        String s = currentRelativePath.toAbsolutePath().toString();
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


    public void saveGameStates() throws IOException {
//        java.io.File file = new java.io.File("GameStates");
//        String  abspath =file.getAbsolutePath();
        String path = "/Users/vlad_kodzhebash/Documents/JavaHillelSpring2021/MavenTest/src/main/java/Lesson17HW/GameStates";
        String pathTXT ="/Users/vlad_kodzhebash/Documents/JavaHillelSpring2021/MavenTest/src/main/java/Lesson17HW/GameStates/";
        File gameStates = new File(path);
        System.out.println(gameStates.mkdir());
        String fileName = "States_" + name.toLowerCase(Locale.ROOT) + "_" +
                new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
        System.out.println(fileName);

        Path currentRelativePath = Paths.get("src/main/java/Lesson17HW/GameStates");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);

        File file = new File(s.concat(File.separator).concat(fileName));
        if(!file.exists()){
            file.createNewFile();
        } else {
            String newName = file.getName().split("\\.")[0] + "_1." + file.getName().split("\\.")[1];
            System.out.println(newName);
            new File(newName).createNewFile();
        }

//        try (FileWriter fw = new FileWriter(s)) {
//           // fw.write(printGameStats());
//
//        }

    }
}
