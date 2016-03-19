/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.mocks;

import game.GameState;
import game.IGameStateResponse;
import game.entieties.IBoard;

/**
 *
 * @author Michał
 */
public class MockGameStateResponse implements IGameStateResponse{

    IBoard board;
    public MockGameStateResponse(IBoard _board){
        board = _board;
    }
    @Override
    public IBoard getBoard() {
        return board;
    }

    @Override
    public int getCurrentPlayer() {
        return 0;
    }

    @Override
    public GameState getGameState() {
        return GameState.PLAYING;
    }
    
}
