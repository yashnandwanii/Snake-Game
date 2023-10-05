package SnakeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {
    private int dots;
    private Image apple, dot, head;
    private final int allDots=2500;
    private final int dotSize=10;
    private final int randomPosition=29;
    private int apple_x, apple_y;
    private Timer timer;
    private final int x[]=new int[allDots];
    private final int y[]=new int[allDots];

    Board(){
        setBackground(Color.BLACK);
        setFocusable(true);

        loadImages();
        initGame();

    }
    public void loadImages(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("SnakeGame/icons/apple.png"));
        apple = i1.getImage();
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("SnakeGame/icons/dot.png"));
        dot = i2.getImage();
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("SnakeGame/icons/head.png"));
        head = i3.getImage();
    }
    public void initGame(){
        dots = 3;

        for(int i = 0; i<dots; i++){
            y[i]=50;
            x[i]=50-i*dotSize;
        }
        locateApple();

        timer = new Timer(140,this);
        timer.start();
    }

    public void locateApple(){
        int r=(int) (Math.random()*randomPosition);
        apple_x=r*dotSize;
        r=(int) (Math.random()*randomPosition);
        apple_y=r*dotSize;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);

    }

    public void draw(Graphics g){
        g.drawImage(apple,apple_x,apple_y,this);
        for(int i=0;i<dots;i++){
            if(i==0){
                g.drawImage(head,x[i],y[i],this);
            }
            else{
                g.drawImage(dot,x[i],y[i],this);
            }
        }
        Toolkit.getDefaultToolkit().sync();
    }

    public void actionPerformed(ActionEvent actionEvent){
        moveSnake();
        repaint();
    }

    public void moveSnake(){
        for(int i=dots;i>0;i--){
            x[i]=x[i-1];
//            y[i]=y[i-1];
        }
        x[0]+=dotSize;
//        y[0]+=dotSize;
    }
}
