package game;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class GameCanvas extends JPanel{
    Background background;
    Player player;
    static ArrayList<PlayerBullet> playerBullets;
    
    public GameCanvas() {
        this.background = new Background();
        this.player = new Player();
        this.playerBullets = new ArrayList<>();
//        PlayerBullet bullet = new PlayerBullet();
////        bullet.position.set(300,500);
////        playerBullets.add(bullet);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 800, 600);
        this.background.render(g);
        this.player.render(g);
        for (int i =0;i<playerBullets.size();i++){
            PlayerBullet bullet = this.playerBullets.get(i);
            bullet.render(g);
        }
    }

    public void runAll() {
        //
        this.background.run();
        this.player.run();
        for (int i =0;i<playerBullets.size();i++){
            PlayerBullet bullet = this.playerBullets.get(i);
            bullet.run();
        }
    }

    public void renderAll() {
        this.repaint(); // ~ paint()
    }

    public void gameLoop() {
        long lastTimeRun = 0;
        while(true) {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTimeRun > 1000 / 60) {
                runAll(); // logic game
                renderAll(); // hien thi game
                lastTimeRun = currentTime;
            }
        }
    }
}
