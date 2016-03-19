/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces.commandline;

import game.IGame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michał
 */
public class CommandLineGame {
    
    IGame game;
    
    public static void main(String [] args) {
    
        boolean playGame = true;
        IGameInitializer initializer;
        do {
        GameSelector  selector= new GameSelector();
        
        initializer = selector.selectGame();
        if(initializer!=null) {
            IGameDriver driver = initializer.intializeGame();
            boolean play = true;
            while(play) {
                play = driver.playGame();
            }
        }
        } while(initializer!=null);
    }
}
