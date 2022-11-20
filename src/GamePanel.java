import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GamePanel extends JPanel {
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    int int_random;
    int FPS = 60;
    Thread gameThread;
    player p1 = new player(200000, " ", 0, " ", 0, 0, this, 40, 80,0);
    player p2 = new player(200000, " ", 0, " ", 0, 0, this, 40, 80,0);
boolean go = true;
    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        this.setDoubleBuffered(true);
    }

    public void startGameThread() {

            gameThread = new Thread() {

                public void run() {
                    while(p1.getSteps() < 2500 || p2.getSteps() < 2500){
                        Random rand = new Random();
                        int upperbound = 12;
                        int_random = rand.nextInt(upperbound) + 1;
                        p1.setCnt(12);
                        while (p1.getCnt() > 0 && p1.getSteps() < 2500) {
                            playGame();
                            System.out.println(p1.getCnt());
                            try {
                                gameThread.sleep(1000 / FPS);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        rand = new Random();
                        upperbound = 12;
                        int_random = rand.nextInt(upperbound) + 1;
                        p2.setCnt(int_random);
                        while (p2.getCnt() > 0 && p2.getSteps() < 2500) {
                            playGame();
                            System.out.println(p2.getCnt());
                            try {
                                gameThread.sleep(1000 / FPS);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            };


            gameThread.start();
        }




    //erika eat cheeseee
//test pushh
    //Bulk of Code will be here!!!!!!
    public void playGame() {

        if(p1.getSteps() < 2500 && p1.getCnt() > 0){
            p1.move();
            p1.setSteps();
            repaint();
        }
        if(p2.getSteps()< 2500 && p2.getCnt() > 0 ){
            p2.move();
            p2.setSteps();
            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Image img1 = Toolkit.getDefaultToolkit().getImage("IMG_0170.jpg"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 0 , 0 , 800 , 600 , this);
        if (p1 != null){
            p1.drawSelf(g, 1);
        }
        if(p2 != null){
            p2.drawSelf(g, 2);
        }



    }




}