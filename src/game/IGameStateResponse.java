package game;
import game.entieties.IBoard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */

public interface IGameStateResponse {
    
    IBoard getBoard();
    int getCurrentPlayer();
    GameState getGameState();
}
