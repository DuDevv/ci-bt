package game.scene;

import game.*;
import game.player.Player;
import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

public class BackgroundGameOver extends GameObject {
        FrameCounter frame ;


    public BackgroundGameOver(){
        this.renderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/background/na.jpg"));
        this.position.set(Settings.SCREEN_WIDTH/2,Settings.SCREEN_HEIGHT/2);
        this.frame = new FrameCounter(10);
    }

    @Override
    public void run() {

        if (this.frame.run()){

            if (GameWindow.isAnyKeyPress){
                SceneManager.signNewScene(new SceneWelcome());
                this.frame.reset();

            }
        }
    }
}
