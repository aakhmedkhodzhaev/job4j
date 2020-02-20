package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 20.02.2020
 * @task 6.7. Выигрышные комбинации в сокобан[#207040]
 * @aim Сортировка элементов массива
 * @others Имеется Тест для проверки работы программы
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i=0; i<board.length; i++) {
            if (board[row][i]!=board[1][i]) {
                result = false;
                break;
            }
        }
        return result;
    }



    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i=0; i<board.length; i++) {
            if (board[i][column]!=board[i][2]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i=0; i<board.length; i++ ) {
            if ((monoHorizontal(board, i)== monoVertical(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }

}