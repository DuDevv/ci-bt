package game.player;

import game.GameCanvas;
import game.GameObject;
import game.GameWindow;
import game.Setting;
import game.renderer.Animation;
import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Player extends GameObject {
    public Player(){
        super();
        //this.image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        this.position.set(200, 300);
        this.creatRenderer();
    }

    private void creatRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/players/straight/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/3.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/4.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/5.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/straight/6.png"));

//        this.renderer = new Animation(images) ;
        this.renderer = new PlayerRenderer("MU",images);

    }


    int count = 0;//  TODO: se fix
    @Override
    public void run() {
        this.move();
        count++;
        if (count>10) {
            this.fire();
        }
        this.limitPlayerPosition();
    }
    private void fire() {
        if (GameWindow.isFirePress){
            PlayerBullet bullet = new PlayerBullet();
            bullet.position.set(this.position.x,this.position.y);
            GameObject.addGameObject(bullet);
            count =0;
        }
    }

    private void move() {
        if(GameWindow.isUpPress) {
            this.position.addThis(0, -3);
        }
        if(GameWindow.isDownPress) {
            this.position.addThis(0, 3);
        }
        if(GameWindow.isLeftPress) {
            this.position.addThis(-3, 0);
        }
        if(GameWindow.isRightPress) {
            this.position.addThis(3, 0);
        }
    }



    private void limitPlayerPosition() {
        //limit x [0, game.Background.image.width] BACKGROUND_WIDTH
        //float x = (float)Mathx.clamp(this.position.x, 0, 384 - 32);
        int halHeight = (int)(Setting.PLAYER_HEIGTH*this.anchor.y);
        int halWidth = (int)(Setting.PLAYER_WIDTH*this.anchor.x);
        float x = (float)Mathx.clamp(this.position.x,halWidth, Setting.BACKGROUND_WIDTH - halWidth);
        //limit y [0, Screen.height]
        float y = (float)Mathx.clamp(this.position.y, 0, Setting.SCREEN_HEIGTH - halHeight);
        this.position.set(x, y);
    }
}
