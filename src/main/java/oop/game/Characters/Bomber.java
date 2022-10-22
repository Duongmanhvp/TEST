package oop.game.Characters;

import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.util.Duration;
import oop.game.graphics.Sprite;
import oop.game.items.Bomb;
import oop.game.items.Flame;

import java.util.ArrayList;
import java.util.List;

import static oop.game.BombermanGame.scene;
import static oop.game.items.Bomb.hasBomb;

public class Bomber extends Entity {

    public static List<Bomb> bombs = new ArrayList<>();
    public static List<Flame> flames = new ArrayList<>();
    private int animate = 0;

    public Bomber(int x, int y, Image img) {
        super(x, y, img);
    }

    public void update () {
        MoveBomber();
        //putBomb();
        if (hasBomb) {
            Bomb.setBomb();
        }
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



   /* public void putBomb() {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.SPACE) {
                    Bomb.setBomb();
                }
            }
        });
    }


    */
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
                } else if(event.getCode() == KeyCode.SPACE) {
//                    if (hasBomb == false){
//                    Bomb.setBomb();
//                    System.out.println(bombs.size());
//                    } else {
//                        bombs.remove(bombs);
//                    }
                    hasBomb = true;
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
                 } else if (event.getCode() == KeyCode.SPACE) {
                     hasBomb = false;
                 }
            }
        });
    }}

