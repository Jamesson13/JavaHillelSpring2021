package Lesson3HW;
public class Task13ChessBoard {
    public static void main(String[] args) {
        String board[][] = new String[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j< board.length; j++){
                board[i][j] = (i+j)%2== 0 ? "B" : "W";
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j< board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
