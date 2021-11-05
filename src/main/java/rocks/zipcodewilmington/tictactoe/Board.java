package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private  Character[][] matrix;
    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
//        Character[][] board = this.matrix;
        int xVertCounter = 0;
        int xHoriCounter = 0;
        for (int row = 0; row < matrix.length; row++) {
            xVertCounter = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[col][row] == 'X') { //i want to make the row and col equal to X
                    xVertCounter++;
                    if (xVertCounter == 3) {
                        return true;
                    }
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            xHoriCounter = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 'X') {
                    xHoriCounter++;
                    if (xHoriCounter == 3){
                        return true;
                    }
                }
            }
        }
        if (matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X'
            || matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
            return true;
        }
        return false;
    }

    public Boolean isInFavorOfO() {
        int oVertiCounter = 0;
        int oHoriCounter = 0;
        for (int row = 0; row < matrix.length; row++) {
            oVertiCounter = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[col][row] == 'O') { //i want to make the row and col equal to X
                    oVertiCounter++;
                    if (oVertiCounter == 3) {
                        return true;
                    }
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            oHoriCounter = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 'O') {
                    oHoriCounter++;
                    if (oHoriCounter == 3){
                        return true;
                    }
                }
            }
        }
        if (matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O'
                || matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
            return true;
        }
        return false;
    }

    public Boolean isTie() {
    Boolean result = false;
    if (isInFavorOfO() == false && isInFavorOfX() == false) {
        return true;
    }
        return result;

    }

    public String getWinner() {
        String result = "";
        if (isInFavorOfX() == true){
            result = "X";
        } else if (isInFavorOfO() == true) {
            result = "O";
        }
        return result;
    }
}