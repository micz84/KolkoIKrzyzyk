/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces.commandline;

import game.IGame;

/**
 *
 * @author Michał
 */
public interface IGameInitializer {
    
    String getName();
    IGameDriver intializeGame();
   
}
