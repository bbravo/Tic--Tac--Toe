package tictactoe;

import javax.swing.JFrame;

/**
 *
 * @author Brighid Moore and Nathan Pell
 */
public class TicTacToe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel panel = new gamePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        }//end of main    
    }//end of class
