/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.mocks;

import game.entieties.IBoard;

/**
 *
 * @author Michał
 */
public class MockBoard implements IBoard {

    int width,height;
    int[][] board;
    public MockBoard(int x,int y){
        board = new int[y][x];
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

    @Override
    public int[][] getBoard() {
        return board;
    }

    @Override
    public int[][] setPosition(int x, int y, int player) {
        board[y][x] = player;
        return board;
    }
    
}
