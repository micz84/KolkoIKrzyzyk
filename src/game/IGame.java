/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michał
 */
package game;

import game.exceptions.*;

public interface IGame {
    
   int[] getPlayers();
   IGameStateResponse startNewGame(INewGameRequest newGame);
   IGameStateResponse makeMove(IMoveRequest move) throws InvalidMoveException, GameEndedException;
   IGameStateResponse restartGame();
   IGameStateResponse getGameState();
   
}
