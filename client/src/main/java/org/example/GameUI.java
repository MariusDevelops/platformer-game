package org.example;

import javax.swing.*;
import java.awt.*;

public class GameUI extends JFrame {
    private int xDelta = 100;
    private int yDelta = 100;

    public GameUI() {
        gameWindow();
        gamePanel();
    }

    public void gameWindow() {
        setTitle("Shape Shifter");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void gamePanel() {
        GameInputs gameInputs = new GameInputs(this);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.setColor(Color.RED);
                g.fillRect( xDelta, yDelta, 100, 100);
            }
        };

        add(panel);
        addKeyListener(gameInputs);
        addMouseListener(gameInputs);
        addMouseMotionListener(gameInputs);
    }

    public void changeXDelta(int value) {
        xDelta += value;
        repaint();
    }

    public void changeYDelta(int value) {
        yDelta += value;
        repaint();
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }
}
