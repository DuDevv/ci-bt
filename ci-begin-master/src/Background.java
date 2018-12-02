import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Background {
    BufferedImage image;
    Vector2D position;

    public Background() {
        this.image = SpriteUtils.loadImage("D:\\IntelliJ\\CI-BT2\\ci-begin-master\\assets\\images\\background\\0.png");
        this.position = new Vector2D(0,Setting.SCREEN_HEIGHT-this.image.getHeight());


    }

    public void run(){
        if(this.position.y <0){
            //this.y+=10;
            this.position.addThis(0,10);
        }else{
            //this.y=0;
            this.position.set(this.position.x,0);
        }
    }
}
