import javax.swing.*;
import java.util.Scanner;
import javax.swing.*;
/**
 * Created by huynq on 7/4/17.
 */
public class Program {

    public static void main(String[] args) {
        GameWindow gw = new GameWindow();
        GameCanvas gc = new GameCanvas();
        Player player1 = new Player();
        gw.add(gc);
        gw.setVisible(true);

    }
}
