public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {
        uc1_initializeAndDisplayBoard();
        // uc2_playerMove();  // add later
    }

    // UC1
    static void uc1_initializeAndDisplayBoard() {
        initializeBoard();
        printBoard();
    }

    static void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
    }

    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
}