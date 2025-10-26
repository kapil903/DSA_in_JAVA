
import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    //Time Complexity = O(n^n)

    public static boolean isSafe(int row, int col, char[][] boards) {
        //column
        for (char[] board : boards) {
            if (board[col] == 'Q') {
                return false;
            }
        }
        //Row
        for (char[] board : boards) {
            if (board[row] == 'Q') {
                return false;
            }
        }
        //UpperLeft
        int r = row;
        for (int c = 0; c >= 0 && r >= 0; c--, r--) {
            if (boards[r][c] == 'Q') {
                return false;
            }
        }
        //UpperRight
        r = row;
        for (int c = 0; c < boards.length && r >= 0; c++, r--) {
            if (boards[r][c] == 'Q') {
                return false;
            }
        }
        //lower right
        r = row;
        for (int c = 0; c < boards.length && r < boards.length; c--, r++) {
            if (boards[r][c] == 'Q') {
                return false;
            }
        }
        //LowerLeft
        r = row;
        for (int c = 0; c >= 0 && r < boards.length; c--, r++) {
            if (boards[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    static void saveBoard(char[][] boards, List<List<String>> allboards) {
        String row;
        List<String> newBoard = new ArrayList<>();
        for (char[] board : boards) {
            row = "";
            for (int j = 0; j < boards.length; j++) {
                if (board[j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allboards.add(newBoard);

    }

    public static void helper(char[][] boards, List<List<String>> allboards, int col) {
        if (col == boards.length) {
            saveBoard(boards, allboards);
            return;
        }
        for (int row = 0; row < boards.length; row++) {
            if (isSafe(row, col, boards)) {
                boards[row][col] = 'Q';
                helper(boards, allboards, col + 1);
                boards[row][col] = '.';
            }

        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allboards = new ArrayList<>();
        char[][] Boards = new char[n][n];
        helper(Boards, allboards,n);
        return allboards;
    }
    public static void main(String[] args) {
        List<List<String>> solutions = new Backtracking().solveNQueens(4);
        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
