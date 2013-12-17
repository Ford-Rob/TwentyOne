/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twentyone;

import robandwade.cit260.twentyone.models.Deck;
import robandwade.cit260.twentyone.menus.MainMenu;
import static twentyone.Player.playerName;
import robandwade.cit260.twentyone.exceptions.MenuException;
import robandwade.cit260.twentyone.frames.MainFrame;
import robandwade.cit260.twentyone.enums.ErrorType;
import twentyone.TwentyOne;
/**
 *
 * @author RFord
 */
public class Start {
    public void start() {
    try {
    
            TwentyOne myGame = new TwentyOne();
            MainMenu myMainMenu = new MainMenu();      
            myMainMenu.getInput();      
        } catch (MenuException e) {
                System.out.println("\n\t" + e.getMessage());
        } finally {
                System.out.println("\n\tGame Over");        
        }  
    }
}
