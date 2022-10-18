package oop.game.Characters;

import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;
import oop.game.graphics.Sprite;
import oop.game.items.Bomb;

import java.util.ArrayList;
import java.util.List;

import static oop.game.BombermanGame.bomberman;
import static oop.game.BombermanGame.scene;
public class Bomber extends Entity {

    public List<Bomb> bombs = new ArrayList<>();
    private int animate = 0;


    private boolean live = true;
    public Bomber(int x, int y, Image img) {
        super(x, y, img);
    }

    public void update () {
        MoveBomber();
        putBomb();
        animate++;
    }

    public void isUp() {
        y -= speed;
        img  = Sprite.movingSprite(Sprite.player_up, Sprite.player_up_1, Sprite.player_up_2, animate, 15).getFxImage();

    }

    public void isDown() {
        y += speed;
        img  = Sprite.movingSprite(Sprite.player_down, Sprite.player_down_1, Sprite.player_down_2, animate, 15).getFxImage();

    }

    public void isLeft() {
        x -= speed;
        img  = Sprite.movingSprite(Sprite.player_left, Sprite.player_left_1, Sprite.player_left_2, animate, 15).getFxImage();

    }

    public void isRight() {
        x += speed;
        img  = Sprite.movingSprite(Sprite.player_right, Sprite.player_right_1, Sprite.player_right_2, animate, 15).getFxImage();

    }

    public void setBomb() {
        img = Sprite.movingSprite(Sprite.bomb, Sprite.bomb_1, Sprite.bomb_2, animate, 60).getFxImage();

    }

    public void putBomb() {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.SPACE) {
                    setBomb();
                }
            }
        });
    }

    public void MoveBomber() {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {

                if(event.getCode() == KeyCode.UP){
                    isUp();
                } else if(event.getCode() == KeyCode.DOWN) {
                    isDown();
                } else if(event.getCode() == KeyCode.LEFT) {
                    isLeft();
                } else if(event.getCode() == KeyCode.RIGHT) {
                    isRight();
                }
        }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {

                 if(event.getCode() == KeyCode.UP){
                     isUp();
                 } else if(event.getCode() == KeyCode.DOWN) {
                 isDown();
                 } else if(event.getCode() == KeyCode.LEFT) {
                 isLeft();
                 } else if(event.getCode() == KeyCode.RIGHT) {
                 isRight();
                 }
            }
        });
    }}

