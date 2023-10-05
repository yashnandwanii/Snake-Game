package SnakeGame;

import javax.swing.*;

public class SnakeGame extends JFrame{

    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();

        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        new SnakeGame();
    }

}
