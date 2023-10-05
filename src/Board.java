import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private int dots;


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

        }
    }
}
