package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameUI extends JFrame {
    private float xDelta = 100;
    private float yDelta = 100;
    private float xDir = 0.5f;
    private float yDir = 0.5f;
    private int frames = 0;
    private long lastCheck = 0;
    private Color color = new Color(155, 5, 155);
    private final Random random = new Random();

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

                updateRectangle();

                g.setColor(color);
                g.fillRect((int) xDelta, (int) yDelta, 100, 100);

                frames++;
                if (System.currentTimeMillis() - lastCheck >= 1000) {
                    lastCheck = System.currentTimeMillis();
                    System.out.println("Frames per second: " + frames);
                    frames = 0;
                }

                repaint();
            }
        };

        add(panel);
        addKeyListener(gameInputs);
        addMouseListener(gameInputs);
        addMouseMotionListener(gameInputs);
    }

    private Color getRndColor() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r, g, b);
    }

    private void updateRectangle() {
        xDelta += xDir;
        if (xDelta > 800 || xDelta < 0) {
            xDir *= -1;
            color = getRndColor();
        }

        yDelta += yDir;
        if (yDelta > 600 || yDelta < 0) {
            yDir *= -1;
            color = getRndColor();
        }
    }

    public void changeXDelta(int value) {
        xDelta += value;
    }

    public void changeYDelta(int value) {
        yDelta += value;
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
    }
}
