package com.example.client;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class PlatformerGame extends GameApplication {
    Entity player;
    Entity enemy;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("SpaceCracker");
        settings.setVersion("0.1");
    }

    @Override
    protected void initGame() {
        player = FXGL.entityBuilder().at(300, 300).view(new Rectangle(25, 25, Color.BLUE)).buildAndAttach();
        enemy = FXGL.entityBuilder().at(400, 310).view(new Circle(20, Color.RED)).buildAndAttach();
    }

    @Override
    protected void initInput() {
        FXGL.onKey(KeyCode.W, () -> player.translateY(-5));
        FXGL.onKey(KeyCode.D, () -> player.translateX(5));
        FXGL.onKey(KeyCode.S, () -> player.translateY(5));
        FXGL.onKey(KeyCode.A, () -> player.translateX(-5));
    }
}
