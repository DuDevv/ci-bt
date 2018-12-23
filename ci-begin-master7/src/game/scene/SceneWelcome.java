package game.scene;

import game.Background;
import game.GameObject;

public class SceneWelcome extends Scene {

    @Override
    void init() {
        BackgroundWelcome background = GameObject.recycle(BackgroundWelcome.class);
    }

    @Override
    void clear() {
        GameObject.clearAll();
    }
}
