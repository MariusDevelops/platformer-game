package org.example.main;

import javax.swing.*;

public class GameWindow {
    public GameWindow(GamePanel gamePanel) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.add(gamePanel);
        jframe.setResizable(false);
        jframe.pack();
        jframe.setVisible(true);
    }

}