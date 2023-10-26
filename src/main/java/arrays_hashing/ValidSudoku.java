package arrays_hashing;

import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = null;
        Set<Character> column = null;
        for (int i = 0; i < 9; i++) {
            row = new HashSet<>();
            column = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char r = board[i][j];
                char c = board[j][i];
                if (r != '.') {

                    if (row.contains(r)) {
                        return false;
                    } else {
                        row.add(r);
                    }
                }
                if (c != '.') {

                    if (column.contains(c)) {
                        return false;
                    } else {
                        column.add(c);
                    }
                }

            }
        }

        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                if (!checkBlock(i, j, board)) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean checkBlock(int row, int column, char[][] board) {
        Set<Character> block = new HashSet<>();
        int rows = row + 3;
        int cols = column + 3;

        for (int i = row; i < rows; i++) {
            for (int j = column; j < cols; j++) {
                if (board[i][j] == '.') continue;

                if (block.contains(board[i][j])) {
                    return false;
                }
                block.add(board[i][j]);
            }
        }

        return true;
    }
}

