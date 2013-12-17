package borrowedCode;
/* Game.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends javax.swing.JFrame implements ActionListener {

    private Deck deck;
    public Player player = new Player("player");
    public Player dealer = new Player("dealer");

    private JButton jbtnHit = new JButton("Hit");
    private JButton jbtnStay = new JButton("Stay");
    private JButton jbtnDeal = new JButton("Deal");

    private JLabel jlblStatus = new JLabel(" ", JLabel.CENTER);
    private JLabel jlblPlayer = new JLabel(" ", JLabel.CENTER);

    JPanel playerPanel = new JPanel();
    JPanel dealerPanel = new JPanel();
    JPanel buttonsPanel = new JPanel();
    JPanel statusPanel = new JPanel();

    public void Game() {
        JFrame gameFrame = new JFrame("IT327 Project 4 - BlackJack");
        gameFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("/resources/10.png"));
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buttonsPanel.add(jbtnHit);
        buttonsPanel.add(jbtnStay);
        buttonsPanel.add(jbtnDeal);
        statusPanel.add(jlblStatus);

        jbtnHit.addActionListener(this);
        jbtnStay.addActionListener(this);
        jbtnDeal.addActionListener(this);

        jbtnHit.setEnabled(false);
        jbtnStay.setEnabled(false);

        dealerPanel.setBackground(Color.GREEN);
        playerPanel.setBackground(Color.GREEN);
        buttonsPanel.setBackground(Color.GREEN);
        statusPanel.setBackground(Color.GREEN);

        gameFrame.setLayout(new BorderLayout());
        gameFrame.add(dealerPanel, BorderLayout.NORTH);
        gameFrame.add(playerPanel, BorderLayout.CENTER);
        gameFrame.add(buttonsPanel, BorderLayout.SOUTH);
        gameFrame.add(statusPanel, BorderLayout.WEST);
        gameFrame.repaint();
        gameFrame.setSize(640, 480);
        gameFrame.setVisible(true);
    }

    private void hitPlayer() {
        Card newCard = player.dealTo(deck.dealFrom());
        playerPanel.add(new JLabel(new ImageIcon("f:/cards/" + newCard.toString())));
        playerPanel.updateUI();
    }


    private void hitDealerDown() {
        Card newCard = dealer.dealTo(deck.dealFrom());
        dealerPanel.add(new JLabel(new ImageIcon("f:/cards/b2fv.png")));
        dealerPanel.updateUI();
    }

    private void hitDealer() {
        Card newCard = dealer.dealTo(deck.dealFrom());
        dealerPanel.add(new JLabel(new ImageIcon("f:/cards/" + newCard.toString())));
        dealerPanel.updateUI();
    }

    private void deal() {
        playerPanel.removeAll();
        dealerPanel.removeAll();
        playerPanel.updateUI();
        dealerPanel.updateUI();
        player.reset();
        dealer.reset();
        if (deck == null || deck.size() < 15) {
            deck = new Deck();
            deck.shuffle();
            jlblStatus.setText("Shuffling");
        }
        hitPlayer();
        hitDealerDown();
        hitPlayer();
        hitDealer();
    }

    private void checkWinner() {
        dealerPanel.removeAll();
        for (int i = 0; i < dealer.inHand(); i++) {
            dealerPanel.add(new JLabel(new ImageIcon("f:/cards/" + dealer.cards[i].toString())));
        }
        if (player.value() > 21) {
            jlblStatus.setText("Player Busts");
        } else if (dealer.value() > 21) {
            jlblStatus.setText("Dealer Busts");
        } else if (dealer.value() == player.value()) {
            jlblStatus.setText("Push");
        } else if (dealer.value() < player.value()) {
            jlblStatus.setText("Player Wins");
        } else {
            jlblStatus.setText("Dealer Wins");
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbtnHit) {
            hitPlayer();
            if (player.value() > 21) {
                checkWinner();
                jbtnHit.setEnabled(false);
                jbtnStay.setEnabled(false);
                jbtnDeal.setEnabled(true);
            }
        }

        if (e.getSource() == jbtnStay) {
            while (dealer.value() < 17 || player.value() > dealer.value()) {
                hitDealer();
            }
            checkWinner();
            jbtnHit.setEnabled(false);
            jbtnStay.setEnabled(false);
            jbtnDeal.setEnabled(true);
        }

        if (e.getSource() == jbtnDeal) {
            deal();
            jlblStatus.setText(" ");
            jbtnHit.setEnabled(true);
            jbtnStay.setEnabled(true);
            jbtnDeal.setEnabled(false);
        }
    }


}
