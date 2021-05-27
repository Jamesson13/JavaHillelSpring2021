package Lesson17HW;

import java.util.Random;

public class Computer {

    public Moves getMove() {
        Moves[] moves = Moves.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }

}
