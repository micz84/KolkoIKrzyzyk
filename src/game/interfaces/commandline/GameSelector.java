/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.interfaces.commandline;

import game.mocks.MockGameFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Michał
 */
public class GameSelector {
 
    List<IGameInitializer> games = new ArrayList<>();
    public GameSelector() {
        games.add(new GameInitializer("MockGame",new MockGameFactory()));
    }
    
    public IGameInitializer selectGame() {
        
        Scanner reader = new Scanner(System.in);
        for(int i=0;i<games.size();i++){
            System.out.println((i+1)+". "+games.get(i).getName());
        }
        System.out.println((0)+". Wyjscie");
        System.out.println("Wybierz grę:");
        int index = reader.nextInt();
        index--;
        if(index<0)
            return null;
        if(index>=games.size())
            index =games.size()-1;
        return games.get(index);
    }
}
