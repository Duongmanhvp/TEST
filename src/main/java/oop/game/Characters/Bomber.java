package oop.game.Characters;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import oop.game.BombermanGame;
import oop.game.graphics.Sprite;

import static oop.game.BombermanGame.*;

public class Bomber extends Entity {

    private int animate = 0;
    public Bomber(int x, int y, Image img) {
        super(x, y, img);
    }

    public void update (){
        MoveBomber();
        animate++;
    }

    /*
    private void moveBomber() {
        int xa;
        int ya;
        if (x + xa < 0) {
            xa = 1;
        }
        if (x + xa > WIDTH * Sprite.SCALED_SIZE ) {
            xa = -1;
        }
        if (y + ya < 0){
            ya = 1;
        }
        if (y + ya > HEIGHT * Sprite.SCALED_SIZE ){
            ya = -1;
        }
        //Cập nhật tọa độ
        x = x + xa;
        y = y + ya;
    }

    */
    /*
    public void keyPressed() {

        KeyEvent key = new KeyEvent();
        if(key.getCode().equals(KeyCode.UP)) {
            y -= 1;
        }
        else if(key.getCode().equals(KeyCode.DOWN)) {
            y += 1;
        }
        else if(key.getCode().equals(KeyCode.RIGHT)) {
            x += 1;
        }
        else if(key.getCode().equals(KeyCode.LEFT)) {
            x -= 1;
        }
    }
    */

    public void MoveBomber() {
    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

        @Override
        public void handle(KeyEvent event) {

            switch(event.getCode()) {

                case UP:
                    y -= 10;
                    img  = Sprite.movingSprite(Sprite.player_up, Sprite.player_up_1, Sprite.player_up_2, animate, 10).getFxImage();
                    break;
                case DOWN:
                    y += 10;
                    img  = Sprite.movingSprite(Sprite.player_down, Sprite.player_down_1, Sprite.player_down_2, animate, 10).getFxImage();
                    break;
                case LEFT:
                    x -= 10;
                    img  = Sprite.movingSprite(Sprite.player_left, Sprite.player_left_1, Sprite.player_left_2, animate, 10).getFxImage();
                    break;
                case RIGHT:
                    x += 10;
                    img  = Sprite.movingSprite(Sprite.player_right, Sprite.player_right_1, Sprite.player_right_2, animate, 10).getFxImage();
                    break;
                default:
                    break;
            }
        }
        });
    }
}
