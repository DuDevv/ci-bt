package game.enemy;

import game.GameObject;
import game.renderer.Animation;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class EnemyExplosion extends GameObject {
    public EnemyExplosion(){
        this.creatRenderer();
    }

    private void creatRenderer() {
        ArrayList<BufferedImage> images = new ArrayList<>();
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/0.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/1.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/2.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/3.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/4.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/5.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/6.png"));
        images.add(SpriteUtils.loadImage("assets/images/players/explosions/7.png"));
        this.renderer = new Animation(images,true);
    }

    @Override
    public void reset() {
        super.reset();// this.active = true
    }
}
