package oop.game.Characters;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import oop.game.graphics.Sprite;

public abstract class Entity {

    protected int x;
    protected int y;
    protected Image img;

    public Entity(int xUnit, int yUnit, Image img) {
        this.x = xUnit * Sprite.SCALED_SIZE;
        this.y = yUnit * Sprite.SCALED_SIZE;
        this.img = img;
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(img, x, y);
    }

    public abstract void update();
}