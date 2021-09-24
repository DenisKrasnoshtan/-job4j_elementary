package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int x = 0; x < board[row].length - 1; x++) {
            if (board[row][x] != board[row][x + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int x = 0; x < board.length - 1; x++) {
            if (board[x][column] != board[x + 1][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
