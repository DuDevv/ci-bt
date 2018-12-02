import tklibs.Setlocation;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class PlayerBullet {
    BufferedImage image;
    Setlocation setlocation;
    Vector2D position;
    public PlayerBullet(){
        this.image = SpriteUtils.loadImage("D:\\IntelliJ\\CI-BT2\\ci-begin-master\\assets\\images\\player-bullets\\a\\1.png");
        this.position = new Vector2D(Setting.PLAYER_LOCATION_X,Setting.PLAYER_LOCATION_Y);
    }
    public void run() {
        if(GameWindow.isFiringPress){
            this.setlocation.scale(0,4);
        }
    }
}
