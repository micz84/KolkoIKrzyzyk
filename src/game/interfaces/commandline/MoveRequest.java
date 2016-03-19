/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces.commandline;

import game.IMoveRequest;

/**
 *
 * @author Michał
 */
public class MoveRequest implements IMoveRequest {

    int x,y,player;
    
    public MoveRequest(int _x, int _y, int _player) {
        x = _x;
        y = _y;
        player = _player;
    }
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getPlayer() {
        return player;
    }
    
}
