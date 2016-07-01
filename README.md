# Tic--Tac--Toe
##Introduction
    This program was assigned in my Java programming class. It was created for two players to be able to play 
    Tic-Tac-Toe. Using the NetBeans IDE and GUI components, I was able to create the board and notify the players 
    which of them won the game, unless it was a tie of course.

##How To Play
    *After you compile the game in NetBeans, the game window will appear on the screen.
    ![alt text](https://github.com/bbravo/Tic--Tac--Toe/blob/master/Tic-Tac-Toe/1.png)
    *When you choose the box you would like to place your letter, click inside the box and the your letter 
     will appear and change the JLabel at the bottom of the screen.
    *This process will continue until one player gets three in a row, horizontally, vertically, or diagonally, or 
     there are no more boxes to choose.
    *When one of the scenarios above occurs, a box will display on the screen with the outcome of the game.
    *Once you have seen the result, you have the option to start a new game, leave the current game displayed, 
     or to exit the program.
     
##Integral Components
    *TicTacToe class-- This is the main class that holds the GUI frame and panel that allow the game to be played.
    
    *gamePanel class-- This is the supporting class that encompasses the dynamics of the game board and the 
    different functions needed for the program to run correctly.
    
    *ButtonListener class--This class recognizes when you push the JButtons and corresponds with placing the 
    correct letter in the box and swapping to the next players turn.  
    
    *CheckForWin boolean--The boolean steps through the various possibilities of getting three in a row and 
    returns true if a player has three in a row.
 
    *checkAdj boolean-- This boolean compares two of the values checking to see if they are equal.

    *resetButtons void-- After nine turns, this resets the JLabels on all the buttons back to null.
