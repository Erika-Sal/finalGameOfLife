import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GamePanel extends JPanel {
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 18;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    int int_random;
    int FPS = 60;
    Thread gameThread;
    player p1 = new player(200000, " ", 10000, " ", 0, 0, this, 90, 45,0);
    player p2 = new player(200000, " ", 20000, " ", 0, 0, this, 90, 45,0);
    boolean go = true;
    public GamePanel() {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));

        this.setDoubleBuffered(true);
    }

    public void startGameThread() {

        gameThread = new Thread() {

            public void run() {
                while(p1.getSteps() < 2750 || p2.getSteps() < 2750){
                    Random rand = new Random();
                    int upperbound =  12;
                    //int_random = rand.nextInt(upperbound) + 1;
                    int_random =39;
                    p1.setCnt(int_random);
                    while (p1.getCnt() > 0 && p1.getSteps() < 2750) {
                        movePieces();
                        System.out.println(p1.getCnt());
                        try {
                            gameThread.sleep(1000 / FPS);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    p1.setCnt(0);
                    if(p1.getSteps()!=431 && p1.getSteps()!=941 && p1.getSteps()!=1966 && p1.getSteps()!= 2750){
                        String[] tasks = new String[]{"Pay for Kid's School - Lose $10,000 per Kid", "Win TV Game Show - Gain $12,000", "File a Law suit sue against another player - Other Player Loses $5,000", "Go on a Family Cruise - Lose $2,000 per Family Member", "You Get into a Car Accident - Lose $5,000", "Enroll Your Child in Day Care - Lose $5,000 Per Child", "Taxes Due - Pay 5% of your Total Money", "Doctors Appointment - pay $200", "You Sold Some of Your Old Furniture - Gain $5,000", "Pay Rent - Pay 7% of House Cost", "You Undergo a Successful Surgery - pay $5,000", "Won a Community Talent Show! - Gain $5,000", "You Found $100 on the Street - Gain $100","You Won a Scholarship - $10,000", "Your Childhood Best Friend is a Millionaire - Gain $15,000", "You Were the 100th Caller in a Sweepstakes - Gain $500", "You Sold your Old College TV - $ 1,500", "You are Issued a Speeding Ticket - $Lose $125","You Get a Parking Ticket - Lose $50", "You Get Cashback on your Credit Card - Gain $500", "You Went on a Shopping Spree - Lose $1,500", "You Pay for Gas - Lose $100", "You went to go buy Groceries - Lose $150", "You went to a Fancy Restaurant - Lose $100", "Mr. Armstrong gives you Free Doughnuts - Gain $100"};
                        rand = new Random();
                        upperbound = tasks.length;
                        int_random = rand.nextInt(upperbound);
                    }
                    if(p1.getSteps() == 671 || p1.getSteps() == 1121 || p1.getSteps() == 1661 || p1.getSteps() == 2109){
                        p1.setBabies(1);

                    }
                    if(p1.getSteps() == 1271 || p1.getSteps() == 1381 || p1.getSteps() == 1866){
                        p1.setBabies(2);

                    }
                    try {
                        gameThread.currentThread().sleep(5 * 1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    rand = new Random();
                    upperbound = 12;
                    int_random = rand.nextInt(upperbound) + 1;
                    p2.setCnt(int_random);
                    while (p2.getCnt() > 0 && p2.getSteps() < 2750) {
                        movePieces();
                        System.out.println(p2.getCnt());
                        try {
                            gameThread.sleep(1000 / FPS);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if(p2.getSteps()!=431 && p2.getSteps()!=941 && p2.getSteps()!=1966 && p2.getSteps()!= 2750){
                        String[] tasks = new String[]{"Pay for Kid's School - Lose $10,000 per Kid", "Win TV Game Show - Gain $12,000", "File a Law suit sue against another player - Other Player Loses $5,000", "Go on a Family Cruise - Lose $2,000 per Family Member", "You Get into a Car Accident - Lose $5,000", "Enroll Your Child in Day Care - Lose $5,000 Per Child", "Taxes Due - Pay 5% of your Total Money", "Doctors Appointment - pay $200", "You Sold Some of Your Old Furniture - Gain $5,000", "Pay Rent - Pay 7% of House Cost", "You Undergo a Successful Surgery - pay $5,000", "Won a Community Talent Show! - Gain $5,000", "You Found $100 on the Street - Gain $100","You Won a Scholarship - $10,000", "Your Childhood Best Friend is a Millionaire - Gain $15,000", "You Were the 100th Caller in a Sweepstakes - Gain $500", "You Sold your Old College TV - $ 1,500", "You are Issued a Speeding Ticket - $Lose $125","You Get a Parking Ticket - Lose $50", "You Get Cashback on your Credit Card - Gain $500", "You Went on a Shopping Spree - Lose $1,500", "You Pay for Gas - Lose $100", "You went to go buy Groceries - Lose $150", "You went to a Fancy Restaurant - Lose $100", "Mr. Armstrong gives you Free Doughnuts - Gain $100"};
                        rand = new Random();
                        upperbound = tasks.length;
                        int_random = rand.nextInt(upperbound);

                    }
                    if(p2.getSteps() == 671 || p2.getSteps() == 1121 || p2.getSteps() == 1661 || p2.getSteps() == 2109){
                        p2.setBabies(1);

                    }
                    if(p2.getSteps() == 1271 || p2.getSteps() == 1381 || p2.getSteps() == 1866){
                        p2.setBabies(2);

                    }
                    try {
                        gameThread.currentThread().sleep(5 * 1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    p2.setCnt(0);
                }
                //print end game totals here
                System.out.println("Player 1's Money: "+ "$" + p1.getMoney());
                System.out.println("Player 1's Number of Children: " + p1.getBabies());
                System.out.println("Player 2's Number of Children: " + p2.getBabies());
                System.out.println("Player 2's Money: "+ "$" + p2.getMoney());
            }
        };


        gameThread.start();
    }




    //erika eat cheeseee
//test pushh

    public void movePieces() {

        if(p1.getSteps() < 2800 && p1.getCnt() > 0){
            p1.move();
            p1.setSteps();
            repaint();

        }
        if(p2.getSteps()< 2800 && p2.getCnt() > 0 ){
            p2.move();
            p2.setSteps();
            repaint();
        }

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Image img1 = Toolkit.getDefaultToolkit().getImage("gameBoard.jpg"); /*the image cannot be in the SRC folder*/
        g2.drawImage(img1, 0 , 0 , 870 , 580 , this);

        Image spinner = Toolkit.getDefaultToolkit().getImage("spinner.png");
        g2.drawImage(spinner, 12,271, 206  , 177, this);

        Image actionCard = Toolkit.getDefaultToolkit().getImage("actionCard.PNG");
        g2.drawImage(actionCard, 720,17, 125  , 125, this);

        Image houseCard  = Toolkit.getDefaultToolkit().getImage("houseCard.PNG");
        g2.drawImage(houseCard, 685,157, 170  , 85, this);

        Image careerCard  = Toolkit.getDefaultToolkit().getImage("careerCard.PNG");
        g2.drawImage(careerCard, 685,246, 170  , 85, this);

        if (p1 != null){
            p1.drawSelf(g, 1);
            //Image boyPeg = Toolkit.getDefaultToolkit().getImage("boyPeg.png"); /*the image cannot be in the SRC folder*/
            //g.drawImage(boyPeg, 80 , 70 , 50,50,this );
        }
        if(p2 != null){
            p2.drawSelf(g, 2);

        }







    }




}

