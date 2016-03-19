/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces.commandline;

import game.INewGameRequest;

/**
 *
 * @author Michał
 */
public class NewGameRequest implements INewGameRequest {

    int width,height;
    public  NewGameRequest(int x,int y) {
        width = x;
        height = y;
    }
    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
    
}
