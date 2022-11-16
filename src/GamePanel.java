import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class GamePanel extends JPanel {
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;


    int FPS = 60;
    Thread gameThread;
    player p1 = new player(200000, " ", 0, " ", 0, 0, this, 20, 20);
    player p2 = new player(200000, " ", 0, " ", 0, 0, this, 20, 80);

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread() {

            public void run() {
                while (true) {
                    update();
                    try {
                        gameThread.sleep(1000 / FPS);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        gameThread.start();
    }


    //Bulk of Code will be here!!!!!!
    public void update() {
        boolean first = true;
        if(p1.getMove() < 250 && first){
            p1.move();
        }else{
            first = false; 
        }
        if(!first){
            p2.move();
        }
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (p1 != null){
            p1.drawSelf(g, 1);
        }
        if(p2 != null){
            p2.drawSelf(g, 2);
        }



    }




}
