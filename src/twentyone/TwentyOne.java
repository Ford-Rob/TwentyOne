/*
 * 
 * 
 */
package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOne {
    String instructions = "This is 21. \n\n"
            + "Try to get as close to 21 and beat the Dealer";
    
    public static void main(String[] args) {
        TwentyOne myGame = new TwentyOne();
        Player myPlayer = new Player ();
        myPlayer.getName();
        myGame.displayHelp();
        MainMenu myMainMenu = new MainMenu();
        myMainMenu.displayMainMenu();
        myPlayer.displayPlayers();
        Table myTable = new Table();
        myTable.displayChair();
        Card myCard;
        for (int i = 0; i < 2; i++ ) {
            myCard = new Card();
            myCard.displayCard();
        }
                GameMenu myGameMenu = new GameMenu(); 
        myGameMenu.displayGameMenu(); 
        Results myResults = new Results();
        myResults.displayResults();
    }   


    public void displayHelp() {
        System.out.println("\nWelcome " + Player.playerName + "\n");
        System.out.println(this.instructions);
    }
    
}
