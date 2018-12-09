package game;

import game.renderer.SingleImage;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Enemies extends GameObject {
    public Enemies(){
        super();
        BufferedImage image = SpriteUtils.loadImage("assets/images/enemies/level0/blue/0.png");
        this.renderer = new SingleImage(image);
        this.position.set(0,0);


    }
//    public void limitEnemies(){
//        int halfWidth = (int)(Setting.ENEMIES_WIDTH*this.anchor.x);
//        int halHeigth = (int)(Setting.ENEMIES_HEIGTH*this.anchor.y);
//    }


    @Override
    public void run() {
        if(this.position.x <Setting.BACKGROUND_WIDTH) {
            this.position.addThis(4, 2);
        } else {
            this.position.x=0;
            this.position.add(10, 1);
        }
    }
}
