package game.renderer;

import game.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SingleImage extends Renderer {
    BufferedImage image;
    public SingleImage(BufferedImage image){
        this.image = image ;

    }
    @Override
    public void render(Graphics g, GameObject master) {
        g.drawImage(this.image,(int)master.position.x,(int)master.position.y,null);
    }
}
