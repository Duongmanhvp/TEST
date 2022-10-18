package oop.game.items;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import oop.game.Characters.Bomber;
import oop.game.Characters.Entity;
import oop.game.graphics.Sprite;

import static oop.game.BombermanGame.bomberman;
import static oop.game.BombermanGame.scene;


public class Bomb extends Entity {

    private int animate = 0;
    public Bomb() {
    }
    public Bomb(int x, int y, Image img) {
        super(x, y, img);
    }

    public void update() {
        animate ++;
    }

}
