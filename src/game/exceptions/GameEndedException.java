/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.exceptions;

import game.IGameStateResponse;

/**
 *
 * @author Michał
 */
public class GameEndedException extends GameException {
     public GameEndedException(IGameStateResponse gs) {
       super(gs);
   }
}
