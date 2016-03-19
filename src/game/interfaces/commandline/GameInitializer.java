/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces.commandline;

import game.IGame;
import game.IGameFactory;
import game.interfaces.commandline.IGameInitializer;
import game.interfaces.commandline.IGameDriver;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Michał
 * @param <T>
 */
public class GameInitializer implements IGameInitializer {

    IGameFactory gameFactory;
    String name;

    public GameInitializer(String name, IGameFactory gameFactory) {
        this.name = name;
        this.gameFactory = gameFactory;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IGameDriver intializeGame() {

        IGame game = gameFactory.GetGame();
        List<String> players = new ArrayList<>();
        Scanner reader = new Scanner(System.in);

        boolean next = false;
        int x = 0, y = 0;
        
        x = ReaSize("Podaj szerokośc planszy:",reader);
        y = ReaSize("Podaj wysokość planszy:",reader);

        System.out.println("Podaj imię pierwszego gracza:");
        players.add(reader.next());
        System.out.println("Podaj imię drugiego gracza:");
        players.add(reader.next());

        return new GameDriver(game, players, new NewGameRequest(x, y));

    }
    
    private int ReaSize(String command,Scanner reader) {
        boolean next = false;
        int number = 0;
        do {
            try {
                System.out.println(command);
                number = reader.nextInt();
               if(number>0)
                    next = true;
                else
                   System.out.println("Podaj liczbę większą od zera"); 
            } catch (InputMismatchException e) {
                reader.nextLine();
                System.out.println("Podaj liczbę większą od zera");
                
            }
        } while (!next);
        return number;
    }

}
