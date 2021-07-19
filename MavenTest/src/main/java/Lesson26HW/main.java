package Lesson26HW;


import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        RockScissorsPaper game;
        if(args.length == 0) {
            game = new RockScissorsPaper();
        }
        else {
            game = new RockScissorsPaper(args[0]);
        }
        game.printTutorial();
        game.getInfo(new Scanner(System.in));
        game.startGame();

    }
}

