import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {
    Background background;
    Player player1;

    public GameCanvas() {
        this.setBackground(Color.blue);
        this.background = new Background();
        this.player1 = new Player();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(background.image, background.x, background.y, null);
        g.drawImage(player1.player,player1.x,player1.y,null);
    }

}