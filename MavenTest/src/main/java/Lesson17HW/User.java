package Lesson17HW;

import java.util.Scanner;

public class User {

    public Moves getMove() {

        System.out.print("Rock(1), Scissors(2) or Paper(3)? ");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        if (answer == 1 || answer == 2 || answer == 3) {
            switch (answer) {
                case 1:
                    return Moves.ROCK;
                case 2:
                    return Moves.SCISSORS;
                case 3:
                    return Moves.PAPER;
            }
        }
        return getMove();
    }
}
