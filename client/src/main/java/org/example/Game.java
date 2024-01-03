package org.example;

import java.awt.event.KeyEvent;

public class Game {
//    private boolean running;
    private GameUI gameUI;
//    private GameInputs gameInputs;

    public Game() {
//        initGame();
        gameUI = new GameUI();
//        gameInputs = new GameInputs(gameUI);
    }
//
//    private void initGame() {
//        running = true;
//        Thread thread = new Thread(this::run);
//        thread.start();
//    }
//
//    private void run() {
//        long lastTime = System.nanoTime();
//        double targetFPS = 60.0;
//        double nsPerUpdate = 1_000_000_000.0 / targetFPS;
//        double delta = 0;
//
//        while (running) {
//            long now = System.nanoTime();
//            delta += (now - lastTime) / nsPerUpdate;
//            lastTime = now;
//
//            while (delta >= 1) {
//                update();
//                delta--;
//            }
//
//            render();
//        }
//    }
//
//    private void update() {
//    }
//
//    private void render() {
//    }
}
