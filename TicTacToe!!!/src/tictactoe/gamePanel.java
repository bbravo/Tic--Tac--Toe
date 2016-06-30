/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Brighid Moore and Nathan Pell
 */
public class gamePanel extends JPanel {
    JButton[] newButtons = new JButton[9];
    int count=0;
    String player;
    JLabel Label= new JLabel("Turn: X");
    public gamePanel(){
        setLayout(new GridLayout(4,3));
        setPreferredSize(new Dimension(400,400));
        for (int i = 0; i < newButtons.length; i++) {
            newButtons[i] = new JButton("");
            add(newButtons[i]);
            newButtons[i].addActionListener(new ButtonListener());
            }//end of for 
        JLabel label = Label;
        label.setSize(new Dimension(50,50));
        label.setFont(new Font("Courier New", Font.BOLD, 24));
        add(label);
        }//end of public game panel
   
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton buttonClicked = (JButton)event.getSource();
            count++;
            if (count%2 == 0){
                buttonClicked.setText("O");
                buttonClicked.setFont(new Font("Courier New", Font.BOLD, 18));
                Label.setText("Turn: X");}//end of if
            else {
                buttonClicked.setText("X");
                buttonClicked.setFont(new Font("Courier New", Font.BOLD, 18));
                Label.setText("Turn: O");}//end of else
                
            if (checkForWin() == true){
                JOptionPane.showConfirmDialog(null, "Player "+player+" Won!!!!...WANT TO PLAY AGAIN?");
                resetButtons();
                Label.setText("Turn: X");}//end of if
            if (count==9){
                if(checkForWin()==false){
                    JOptionPane.showConfirmDialog(null, "It's a TIE!!!!...WANT TO PLAY AGAIN?");
                    resetButtons();
                    Label.setText("Turn: X");}//end of if
                }//end of if count ==9
            }//end of actionPerformed
    
    public boolean checkForWin(){          
            //horizontal 
            if( checkAdj(0,1) && checkAdj(1,2) ){
                player=newButtons[0].getText(); 
                return true;}//end of if
            else if( checkAdj(3,4) && checkAdj(4,5) ){
                player=newButtons[3].getText();
                return true;}//end of else if
            else if ( checkAdj(6,7) && checkAdj(7,8)){
                player=newButtons[6].getText();
                return true;}//end of else if
            else if ( checkAdj(0,3) && checkAdj(3,6)){
                player=newButtons[0].getText();
                return true;}//end of else if  
            else if ( checkAdj(1,4) && checkAdj(4,7)){
                player=newButtons[1].getText();
                return true;}//end of else if
            else if ( checkAdj(2,5) && checkAdj(5,8)){
                player=newButtons[2].getText();
                return true;}//end of else if
            else if ( checkAdj(0,4) && checkAdj(4,8)){
                player=newButtons[0].getText();
                return true;}//end of else if  
            else if ( checkAdj(2,4) && checkAdj(4,6)){
                player=newButtons[2].getText();
                return true;}//end of else if
            else 
                return false;
            }//end of checkForWin
        public boolean checkAdj(int a, int b){
            if ( newButtons[a].getText().equals(newButtons[b].getText()) && !newButtons[a].getText().equals("") )
                return true;
            else
                return false;
            }//end of checkAdj
        public void resetButtons(){
            for(int i = 0; i <= 8; i++){
                newButtons[i].setText("");
                count=0;}//end of for loop
            }//end of reset buttons
     }//end of ButtonListener
}//end of gamePanel class
