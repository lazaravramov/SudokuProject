package Entity;

import java.io.Serializable;
import utils.*;

public class sudokuNetwork implements Serializable {
    int[][] currentBoard=new int[Constants.SIZE][Constants.SIZE];;

    int[][] finalBoard=new int[Constants.SIZE][Constants.SIZE];

    public int[][] getCurrentBoard() {
        return currentBoard;
    }

    public void setCurrentBoard(int[][] currentBoard) {
        this.currentBoard = currentBoard;
    }

    public int[][] getFinalBoard() {
        return finalBoard;
    }

    public void setFinalBoard(int[][] finalBoard) {
        this.finalBoard = finalBoard;
    }
}
