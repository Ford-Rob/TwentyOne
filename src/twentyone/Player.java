/* 
 * 
 * Assigned to WMitchell.
 */
package twentyone;

import java.util.Scanner;
import robandwade.cit260.twentyone.exceptions.PlayerException;
import robandwade.cit260.twentyone.enums.PlayerType;
/**
 * @author WMitchell
 * @author RFord
 */
public class Player {
    static String[] playerName = new String[0];
    public int numberofPlayers = 0; 
    int kbdInput;
    String stringInput;
    static Scanner input = new Scanner(System.in);
    static String nameInput;
    private String name;
    private PlayerType playerType;
        
        
    public Player(PlayerType playerType) {
        this.playerType = playerType;}  

    public void multiPlayer() {
        while(numberofPlayers == 0) {
            
            System.out.println("\nNumber of Players (1 or 2): ");
            stringInput = Player.input.next();
            try {
                kbdInput = Integer.parseInt(stringInput);
            } catch(NumberFormatException e) {
                kbdInput = 0;
            }

            try {
                if (kbdInput == 1){
                    numberofPlayers = 1;
                    playerName = new String[1];

                } else if (kbdInput == 2){
                    numberofPlayers = 2;
                    playerName = new String[2];

                } else {
                    throw  new PlayerException("invalid input");
                }
            } catch (PlayerException tex) {
                System.out.println("\n\t" + tex.getMessage());
            }
    
        }
    //needs an integer 1 or 2

    }
    public String currentPlayer(int current) {
        return playerName[current];
        
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

