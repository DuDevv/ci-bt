package game.renderer;

import game.GameObject;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Renderer {
    abstract public void render(Graphics g, GameObject master);
}
