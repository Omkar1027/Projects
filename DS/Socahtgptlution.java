public class Socahtgptlution {
    public static int b = 9;

    public static boolean isSafe(int row, int col, int n, char[][] board) {
        for (int i = 0; i < b; i++) {
            if (board[i][col] == n) {
                return false;
            }
        }
        for (int i = 0; i < b; i++) {
            if (board[row][i] == n) {
                return false;
            }
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean check(char[][] board, int row, int col) {
        if (row == b - 1 && col == b) {
            return true;
        }
        if (col == b) {
            row++;
            col = 0;
        }
        if (board[row][col] != '.') {
            return check(board, row, col + 1);
        }
        for (char num = '1'; num <= '9'; num++) {
            if (isSafe(row, col, num, board)) {
                board[row][col] = num;
                if (check(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.'; // Undo the move (backtrack)
            }
        }
        return false;
    }

    public static char[][] solveSudoku(char[][] board) {
        check(board, 0, 0);
        printBoard(board);
        return board;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solveSudoku(board);
    }
}