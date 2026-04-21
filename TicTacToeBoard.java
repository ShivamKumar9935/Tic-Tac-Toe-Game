public class TicTacToe {

    static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initializeBoard(); // fill with '-'

        placeMove(0, 0, 'X'); // correct method call
        System.out.println(board[0][0]);
    }

    // Initialize board with '-'
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // UC6: Place move on board
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}