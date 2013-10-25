package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOne {
    public static Hand myHand = new Hand(); 
    
    public static void main(String[] args) {
        TwentyOne myGame = new TwentyOne();
        System.out.println("\nWelcome to 21.");
        Player myPlayer = new Player();
        myPlayer.multiPlayer();
        myPlayer.getName();
        MainMenuView myMainMenuView = new MainMenuView();
        myMainMenuView.getInput(myGame);
        Results myResults = new Results();
        myResults.displayResults();
    }
    
    }
