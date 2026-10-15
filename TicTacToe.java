
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    static void displayBoard() {
        System.out.println("\n-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");

            for (int j = 0; j < 3; j++) {
                char cell = board[i][j] == '\0' ? ' ' : board[i][j];
                System.out.print(cell + " | ");
            }

            System.out.println("\n-------------");
        }
    }

    static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }

            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {
                return true;
            }
        }

        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char player = 'X';
        int moves = 0;

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Player 1 = X, Player 2 = O");
        System.out.println("Enter row and column from 1 to 3.");

        while (moves < 9) {
            displayBoard();

            System.out.print("Player " + player
                    + ", enter row: ");
            int row = sc.nextInt() - 1;

            System.out.print("Enter column: ");
            int col = sc.nextInt() - 1;

            if (row < 0 || row > 2 ||
                col < 0 || col > 2) {
                System.out.println("Invalid position! Try again.");
                continue;
            }

            if (board[row][col] != '\0') {
                System.out.println("Cell already filled! Try again.");
                continue;
            }

            board[row][col] = player;
            moves++;

            if (checkWinner(player)) {
                displayBoard();
                System.out.println("Player " + player + " wins!");
                sc.close();
                return;
            }

            if (player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }
        }

        displayBoard();
        System.out.println("Game Draw!");

        sc.close();
    }
}
