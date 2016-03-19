/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.mocks;

import game.IGame;
import game.IGameStateResponse;
import game.IMoveRequest;
import game.INewGameRequest;
import game.entieties.IBoard;
import game.exceptions.GameEndedException;
import game.exceptions.InvalidMoveException;

/**
 *
 * @author Michał
 */
public class MockGame implements IGame{
    
    IBoard board;
    public MockGame() {
    }
    public int[] getPlayers(){
        return new int[]{0,1};
    }
    @Override
    public IGameStateResponse startNewGame(INewGameRequest newGame) {
        board = new MockBoard(newGame.getWidth(), newGame.getHeight());
        return new MockGameStateResponse(board);
    }

    @Override
    public IGameStateResponse makeMove(IMoveRequest move) throws InvalidMoveException, GameEndedException {
        return new MockGameStateResponse(board);
    }

    @Override
    public IGameStateResponse restartGame() {
        
        return new MockGameStateResponse(board);
    }

    @Override
    public IGameStateResponse getGameState() {
        return new MockGameStateResponse(board);
    }
}
