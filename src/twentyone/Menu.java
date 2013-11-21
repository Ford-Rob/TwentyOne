/*
* This will be the super-class Menu for the game for the paired programming assignment Week 9.
* 
*/

package twentyone;  

import java.util.Scanner;
import static twentyone.TwentyOne.myDeck;


/**
* @author WMitchell
* @author RFord
*/

public class MenuView {
    short SuitNumber = 9824;
    byte counter = 0;
    char border;
    private final static String[][] MenuItems = {
    {"H", "Hit"},
    {"S", "Stand"},        
    {"Q", "Quit Game"}        
    };
    
    private MenuControl MenuControl = new MenuControl();
    
public class Menu {
    
            public void displayMenu(){

            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }      
            }                           
            System.out.println("\n\tGame Menu");
            counter = 0;
            while (++counter < 26){
                    border=(char)SuitNumber;
                    System.out.print("-");
 
            }  
            System.out.println("");
            for (int i = 0; i < MenuView.MenuItems.length; i++) {
            System.out.println("\t" + MenuItems[i][0] + " - " + MenuItems[i][1]);
        }
            counter = 0;
            while (++counter < 25){
                    border=(char)SuitNumber;
                    System.out.print(border);
                    if (SuitNumber > 9830) {    
                        SuitNumber = 9824;
                    } else {++SuitNumber;
                    }  
            }  
            counter = 0;
            System.out.println("\nEnter your choice: ");
        
    
                    
             
    }
