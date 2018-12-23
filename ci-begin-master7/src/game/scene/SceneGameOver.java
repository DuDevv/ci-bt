package game.scene;

import game.GameObject;

public class SceneGameOver extends Scene {
    @Override
    void init() {
        BackgroundGameOver background = GameObject.recycle(BackgroundGameOver.class);
    }

    @Override
    void clear() {
        GameObject.clearAll();
    }
}
