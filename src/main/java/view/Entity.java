package view;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Entity {

    protected int x;
    protected int y;
    protected Image img;

    public Entity(int xUnit, int yUnit, Image img) {
        this.x = xUnit ;
        this.y = yUnit;
        this.img = img;
    }

    public void render(GraphicsContext gc) {
        gc.drawImage(img, x, y);
    }

    public abstract void update();
}