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
        myPlayer.getName();
        MainMenuView myMainMenu = new MainMenuView();
        String input = myMainMenu.getInput(myGame);
        HelpMenuView myHelpMenuView = new HelpMenuView();
        myHelpMenuView.getInput();
        //Rob, Moved your code here to MainMenuView to diplay before GameMenu. The game is taking shape! I keep going bust. haha
        //TwentyOne.myHand.displayHand();
        //System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());
        GameMenuView myGameMenuView = new GameMenuView();
        myGameMenuView.getInput();
        Results myResults = new Results();
        myResults.displayResults();
    }
        
        /** Table myTable = new Table();
         * myTable.displayChair();
        */
    
    }
