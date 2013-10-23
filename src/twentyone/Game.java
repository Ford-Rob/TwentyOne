/*
 * THIS IS THE TICTACTOE TEMPLATE THAT WILL NEED TO CHANGE DRASTICLY TO ADAPT TO 
 * OUR GAME, BUT NEEDS TO BE ADDED FOR SOME OF THE MENU METHODS TO WORK.
 */
package twentyone;

/**
 *
 * @author Wade
 *
 */
public class Game {
    
    public static final String ONE_PLAYER = "ONE_PLAYER";
    //Player 2, B...is the Dealer
    public static final String TWO_PLAYER = "TWO_PLAYER";
    
    public static final String CONTINUE = "CONTINUE";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String PUSH = "PUSH"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";

    private String gameType;
    private Player playerA;
    private Player playerB;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    //private Board board;
   

    

    public Game() {
   
       this.playerA = new Player();
       this.playerB = new Player();
       
       //this.playerA.setMarker(Game.PLAYER_A_DEFAULT_MARKER);
       //this.playerB.setMarker(Game.PLAYER_B_DEFAULT_MARKER);
    }

    public Game(String gameType) {
        this();

        this.gameType = gameType;
        //this.board = new Board(3, 3);
        
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    //public Board getBoard() {
        //return board;
    //}

    //public void setBoard(Board board) {
        //this.board = board;
    //}




    public void start() {

        this.setPlayingOrder(playerA, playerB);

        // clear the board
        //this.board.clearTheBoard();
        this.setStatus(Game.NEW_GAME);
    }

    public void setPlayingOrder(Player player1, Player player2) {

        double randomValue = Math.random();

        if (randomValue < 0.5) {
            this.currentPlayer = player1;
            this.otherPlayer = player2;
        } else {
            this.otherPlayer = player2;
            this.currentPlayer = player1;
        }

    }

    public void recordWinner() {
        if (this.currentPlayer == this.playerA) {
            this.winner = this.playerA;
            this.loser = this.playerB;
        } else {
            this.winner = this.playerB;
            this.loser = this.playerA;
        }

        //long noWins = this.winner.getWins();
        //noWins++;
        //this.winner.setWins(noWins);
        //long noLosses = this.loser.getLosses();
        //noLosses++;
        //this.loser.setLosses(noLosses);

        this.setStatus(Game.WINNER);
        
    }

    public void recordPush() {
        //long player1Push = this.playerA.getPush();
        //player1Push++;
        //this.playerA.setPush(player1Push);
        //long player2Push = this.playerB.getPush();
        //player2Push++;
        //this.playerB.setPush(player2Push);

        this.setStatus(Game.PUSH);
       
    }



    //public String getWinningMessage () {
        //return "\n\t*******************************************************************************"
             //+ "\n\t Congratulations " + winner.getName() + "! You beat the Dealer."
             //+ "\n\t Sorry " + loser.getName() + ", Dealer wins." 
             //+ "\n\t*******************************************************************************";
    //}

    public String getPushMessage () {
       return "\n\t*******************************************************************************"
             + "\n\t The game is a Push. Better luck next time!" 
             + "\n\t*******************************************************************************";
    }
}