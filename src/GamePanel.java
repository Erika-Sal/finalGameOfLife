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
                    playGame();
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
//erika eat cheese
//test pushh
    //Bulk of Code will be here!!!!!!
    public void playGame() {
        boolean start = true;
        /*boolean first = true;
        if(p1.getMove() < 250 && first){
            p1.move();
        }else{
            first = false; 
        }
        if(!first){
            p2.move();
        }*/
        while(start == true)
        {
            //display turn screen
            int move = (int) (Math.random()*11);
            while(move!=0){
                System.out.println("chicken");
            }
            start = false;

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
