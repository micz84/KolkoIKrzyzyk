/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.exceptions;
import game.*;
/**
 *
 * @author Michał
 */

public class InvalidMoveException extends GameException {
    
   public InvalidMoveException(IGameStateResponse gs) {
       super(gs);
   }
   
   
}
