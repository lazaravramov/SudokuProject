package client;

import utils.Constants;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Stack;
import Entity.playerTurn;
public class Sudoku {
    private int[][] currentBoardState=new int[Constants.SIZE][Constants.SIZE];

    private int[][] finalBoard=new int[Constants.SIZE][Constants.SIZE];

    private int wrongMoves=0;

    private final ArrayList<playerTurn> undoMoves=new ArrayList<playerTurn>();

    private final sudokuHelper helpMe=new sudokuHelper();
    private void initializeBoard(){
        for (int x = 0; x < Constants.SIZE; x++) {
            for (int y = 0; y < Constants.SIZE; y++) {
                currentBoardState[x][y] = 0;
            }
        }
    }

    public void resetBoard(){
        undoMoves.clear();
        wrongMoves=0;
        initializeBoard();
    }

    public playerTurn addPlayerTurn(playerTurn  turn){
        if(helpMe.isValidMove(turn,currentBoardState)){
            if(currentBoardState[turn.getX()][turn.getY()]!=0){
                removePlayerTurn(turn);
            }
            undoMoves.add(turn);
            currentBoardState[turn.getX()][turn.getY()]=turn.getValue();
            return turn;
        } else {
            wrongMoves++;
            return turn;
        }
    }

    public void removePlayerTurn(playerTurn turn){
        currentBoardState[turn.getX()][turn.getY()]=0;
        for(playerTurn curTurn:undoMoves){
            int currX = curTurn.getX();
            int currY = curTurn.getY();
            if (currX == turn.getX() && currY == turn.getY()) {
                undoMoves.remove(curTurn);
                break;
            }
        }
    }

    public playerTurn undoMove(){
        if(!undoMoves.isEmpty()){
            playerTurn turn=undoMoves.remove(undoMoves.size()-1);
            currentBoardState[turn.getX()][turn.getY()]=0;
            return turn;
        }
        return null;
    }
    public int getScore(int time){
        return 0;
    }
    public void solve(){
        currentBoardState=finalBoard;
    }
}
