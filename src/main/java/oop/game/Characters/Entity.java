package oop.game.Characters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;
import oop.game.graphics.Sprite;

//import java.awt.*;

public abstract class Entity {

    protected int x;
    protected int y;
    protected Image img;
    protected Sprite sprite;

    protected int speed = 5;

    public Entity() {

    }
    public Entity(int xUnit, int yUnit, Image img) {
        this.x = xUnit * Sprite.SCALED_SIZE;
        this.y = yUnit * Sprite.SCALED_SIZE;
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public  int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(img, x, y);
    }

    public abstract void update();

    public Rectangle getBounds() {
        return new Rectangle(x, y, sprite.get_realWidth() * 2, sprite.get_realHeight() * 2 );
    }
}