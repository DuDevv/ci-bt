package game;

import java.awt.*;
import java.awt.image.BufferedImage;

import game.renderer.SingleImage;
import tklibs.SpriteUtils;

public class Background extends GameObject{
    public Background() {
        super();
        BufferedImage image = SpriteUtils.loadImage("assets\\images\\background\\0.png");
        this.renderer = new SingleImage(image);
        this.position.set(0, Setting.SCREEN_HEIGTH - image.getHeight());
        this.anchor.set(0,0);
    }

    @Override
    public void run() {
        if(this.position.y < 0) {
            this.position.addThis(0, 10);
        } else {
            this.position.set(this.position.x, 0);
        }
    }


}
