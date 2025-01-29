package client;

import utils.Constants;
import Entity.playerTurn;

public class sudokuHelper {
    public sudokuHelper() {
    }

    public boolean isSolved(int[][] currentBoard){
        for( int x = 0; x < Constants.SIZE; x++ ) {
            for( int y = 0; y < Constants.SIZE; y++ ) {
                if( currentBoard[x][y] == 0 ) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidMove(playerTurn turn,int[][] currentBoard) {
        int x = turn.getX();
        int y = turn.getY();
        int value = turn.getValue();


        for (int i = 0; i < Constants.SIZE; i++) {
            if (currentBoard[x][i] == value) {
                return false;
            }
            if (currentBoard[i][y] == value) {
                return false;
            }
        }
        int xSmallGrid = (x / 3) * 3;
        int ySmallGrid = (y / 3) * 3;
        for (int i = xSmallGrid; i < xSmallGrid + 3; i++) {
            for (int j = ySmallGrid; j < ySmallGrid + 3; j++) {
                if (currentBoard[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }

}
