import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class Background {
    BufferedImage image;
    int x, y;

    public Background() {
        this.image = SpriteUtils.loadImage("E:\\TaiVe\\TaiLIeuHoc\\ci-begin-master\\assets\\images\\background\\0.png");
        this.x = 0;
        this.y = 0;

    }

}
