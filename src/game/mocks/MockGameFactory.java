/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.mocks;

import game.IGame;
import game.IGameFactory;

/**
 *
 * @author Michał
 */
public class MockGameFactory implements IGameFactory{

    @Override
    public IGame GetGame() {
        return new MockGame();
    }
    
}
