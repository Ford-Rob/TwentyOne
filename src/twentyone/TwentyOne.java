package twentyone;

/**
 * @author WMitchell
 * @author RFord
 */
public class TwentyOne {
    public static Hand myHand = new Hand(); 
    public static Player myPlayer = new Player();
    public static Deck myDeck = new Deck();
    
    public static void main(String[] args) {
        TwentyOne myGame = new TwentyOne();
        System.out.println("\n" + "Welcome to 21.");
        myPlayer.multiPlayer();
        myPlayer.getName();
        MainMenuView myMainMenuView = new MainMenuView();
        myMainMenuView.getInput(myDeck);
        myDeck.initDeck();

        myDeck.shuffleDeck();

        TwentyOne.myHand.displayHand();
        System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());
        GameMenuView myGameMenuView = new GameMenuView();
        myGameMenuView.getInput();
        Results myResults = new Results();
        myResults.displayResults();
        
        
    }
    
    }
