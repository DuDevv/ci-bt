
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class GameWindow extends JFrame {
    public static boolean isUpPress;
    public static boolean isDowPress;
    public static boolean isLeftPress;
    public static boolean isRightPress;
    public static boolean isFiringPress;

    public GameWindow() {

        this.setTitle("MU");
//        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       this.setResizable(false);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
               if (e.getKeyCode()==KeyEvent.VK_W){
                   isUpPress  = true;
               }
               if (e.getKeyCode() == KeyEvent.VK_S){
                   isDowPress = true;
               }
               if (e.getKeyCode() == KeyEvent.VK_A){
                   isLeftPress = true;
               }
               if (e.getKeyCode() == KeyEvent.VK_D){
                   isRightPress = true;
               }
                if (e.getKeyCode() == KeyEvent.VK_SPACE){
                    isFiringPress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode()==KeyEvent.VK_W){
                    isUpPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_S){
                    isDowPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_A){
                    isLeftPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_D){
                    isRightPress = false;
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE){
                    isFiringPress = false;
                }
            }
        });
    }
}
