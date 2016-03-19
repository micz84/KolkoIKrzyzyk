/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces.commandline;

import game.IGame;
import game.IGameStateResponse;
import game.INewGameRequest;
import game.exceptions.GameEndedException;
import game.exceptions.InvalidMoveException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Michał
 */
public class GameDriver implements IGameDriver{
 
    IGame game;
    List<String> players;
    int currentPlayer;
    public GameDriver(IGame game, List<String> players,INewGameRequest newGame) {
        this.game = game;
        this.players = players;
        IGameStateResponse response = this.game.startNewGame(newGame);
        currentPlayer = response.getCurrentPlayer();
        DrawBoard(response);
    }
    
    public void DrawBoard(IGameStateResponse response) {
        System.out.println("//////////////////////////////////////////////////");
        int[][] board = response.getBoard().getBoard();
         for(int i =0;i<board[0].length;i++) {
                if(i==0) {
                    System.out.print("y/x|"+i+"|");
                } else {
                    System.out.print(i+"|");
                }
            }
         System.out.println("");
        for(int i =0;i<board.length;i++) {
            System.out.print(" "+i+" |");
            for(int j =0;j<board[i].length;j++) {    
                if(board[i][j]==0)
                    System.out.print(" ");
                if(board[i][j]==1)
                    System.out.print("O");
                if(board[i][j]==2)
                    System.out.print("X");
                if(j<board[i].length)
                    System.out.print("|");
            }
            System.out.println("");
            if(i<board.length-1) {
                for(int j=0;j<board[0].length*2+4;j++){
                   System.out.print("-");
                }
            }
            System.out.println("");
        }
        System.out.println("Aktualny gracz: "+GetCurrentPlayerName());
    }
    
    private String GetCurrentPlayerName() {
        return players.get(currentPlayer);
    }

    @Override
    public boolean playGame() {
        int x; int y;
        try {
        Scanner reader = new Scanner(System.in);
        System.out.println("Wpisz ujemną wartość aby wyjść");
        try {
        System.out.println("Wybierz współrzędą x:");
        x = reader.nextInt();
        if(x<0)
            return false;
        } catch(InputMismatchException e) {
            System.out.println("Podaj liczbę  od 0 do "+game.getGameState().getBoard().getWidth());
            return true;
        }
         try {
        System.out.println("Wybierz współrzędą y:");
        y = reader.nextInt();
         } catch(InputMismatchException e) {
            System.out.println("Podaj liczbę  od 0 do "+game.getGameState().getBoard().getHeight());
            return true;
        }
        
        if(y<0)
            return false;
        
        IGameStateResponse response = game.makeMove(new MoveRequest(x, y, currentPlayer));
        currentPlayer = response.getCurrentPlayer();
        DrawBoard(response);
        return true;
        } catch(InvalidMoveException e) {
            System.out.println("Niewłaściwy ruch!");
            currentPlayer = e.getGameState().getCurrentPlayer();
            DrawBoard(e.getGameState());
            return true;
        }
        catch(GameEndedException e) {
            System.out.println("Gra zakończona!");
            currentPlayer = e.getGameState().getCurrentPlayer();
            DrawBoard(e.getGameState());
            return false;
        }
        
    }
}
