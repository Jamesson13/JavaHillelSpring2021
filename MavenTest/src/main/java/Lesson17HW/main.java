package Lesson17HW;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        RockScissorsPaper game = new RockScissorsPaper();
        game.nameUser();
        game.startGame();
        //game.saveGameStates();
    }
}

