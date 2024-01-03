package org.example;

import javax.swing.*;
import java.awt.*;

public class GameUI extends JFrame {
    public GameUI() {
        gameWindow();
        gamePanel();
    }
    public void gameWindow() {
        setTitle("Shape Shifter");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void gamePanel() {
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.RED);
                g.fillRect(50, 50, 100, 100);
            }
        };

        add(panel);
    }
}
