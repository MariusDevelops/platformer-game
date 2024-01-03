package org.example;

import java.awt.event.*;

public class GameInputs implements KeyListener, MouseListener, MouseMotionListener {
    private final GameUI gameUI;

    public GameInputs(GameUI gameUI) {
        this.gameUI = gameUI;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> gameUI.changeYDelta(-5);
            case KeyEvent.VK_D -> gameUI.changeXDelta(5);
            case KeyEvent.VK_S -> gameUI.changeYDelta(5);
            case KeyEvent.VK_A -> gameUI.changeXDelta(-5);
            default -> System.out.println("Unexpected key pressed");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        gameUI.setRectPos(e.getX(), e.getY());
    }
}
