import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Player {
    private String name;
    private int hp;
    private int power;
    private int speed;

    BufferedImage player;
    int x,y;

    public Player(){
        this.player = SpriteUtils.loadImage("E:\\TaiVe\\TaiLIeuHoc\\ci-begin-master\\assets\\images\\players\\straight\\0.png");
        this.x = 600;
        this.y = 600;
    }

}
