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
    public static Hand myHand = new Hand(); 
    
    public static void main(String[] args) {
        TwentyOne myGame = new TwentyOne();
        MainMenuView myMainMenu = new MainMenuView();
        String input = myMainMenu.getInput(myGame);
        HelpMenuView myHelpMenuView = new HelpMenuView();
        myHelpMenuView.getInput();
        //Rob, Moved this code here to MainMenuView to diplay before GameMenu. The game is taking shape! I keep going bust. haha
        //TwentyOne.myHand.displayHand();
        //System.out.println("The Value of Your Hand is " + TwentyOne.myHand.checkValue());
        
        GameMenuView myGameMenuView = new GameMenuView();
        myGameMenuView.getInput();
        

    }


        

        /**
         * 
         * HIDING THIS CODE UNTIL IT IS NEEDED
         * 
         * Player myPlayer = new Player();
         * myPlayer.multiPlayer();
         * myPlayer.getName();
         */
         
        /** Table myTable = new Table();
         * myTable.displayChair();
         * Card myCard;
         * for (int i = 0; i < 2; i++ ) {
         *   myCard = new Card();
         *   myCard.displayCard();
         * }
         *       GameMenu myGameMenu = new GameMenu(); 
         * myGameMenu.displayGameMenu(); 
        /*
        
        /**
         * Results myResults = new Results();
         * myResults.displayResults();
        */
    
    }
