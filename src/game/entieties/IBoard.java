/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.entieties;

/**
 *
 * @author Michał
 */
public interface IBoard {
    
    int getWidth();
    int getHeight();
    int[][] getBoard();
    
    int[][] setPosition(int x, int y, int player);
}
