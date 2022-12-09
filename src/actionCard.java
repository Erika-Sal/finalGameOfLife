import java.applet.*;
import java.awt.*;
import java.net.URL;
import java.util.Random;


public class actionCard extends Applet{

    Image[] bob;
    public actionCard(){
    bob = new Image[23];
    bob[0] = Toolkit.getDefaultToolkit().getImage("animalRescue.PNG");
    bob[1] = Toolkit.getDefaultToolkit().getImage("aquarium.PNG");
    bob[2] = Toolkit.getDefaultToolkit().getImage("birthday.PNG");
    bob[3] = Toolkit.getDefaultToolkit().getImage("buildMaze.PNG");
    bob[4] = Toolkit.getDefaultToolkit().getImage("business.PNG");
    bob[5] = Toolkit.getDefaultToolkit().getImage("buySuit.PNG");
    bob[6] = Toolkit.getDefaultToolkit().getImage("children'sBook.PNG");
    bob[7] = Toolkit.getDefaultToolkit().getImage("cinema.PNG");
    bob[8] = Toolkit.getDefaultToolkit().getImage("drivingTest.PNG");
    bob[9] = Toolkit.getDefaultToolkit().getImage("familyTree.PNG");
    bob[10] = Toolkit.getDefaultToolkit().getImage("familyBand.PNG");
    bob[11] = Toolkit.getDefaultToolkit().getImage("mountEverest.PNG");
    bob[12] = Toolkit.getDefaultToolkit().getImage("painting.PNG");
    bob[13] = Toolkit.getDefaultToolkit().getImage("playground.PNG");
    bob[14] = Toolkit.getDefaultToolkit().getImage("pool.PNG");
    bob[15] = Toolkit.getDefaultToolkit().getImage("sellFlowers.PNG");
    bob[16] = Toolkit.getDefaultToolkit().getImage("setSchool.PNG");
    bob[17] = Toolkit.getDefaultToolkit().getImage("skateboardContest.PNG");
    bob[18] = Toolkit.getDefaultToolkit().getImage("skyDive.PNG");
    bob[19] = Toolkit.getDefaultToolkit().getImage("snailFarm.PNG");
    bob[20] = Toolkit.getDefaultToolkit().getImage("taxRefund.PNG");
    bob[21] = Toolkit.getDefaultToolkit().getImage("winAward.PNG");
    bob[22] = Toolkit.getDefaultToolkit().getImage("winContest.PNG");
    }

    public Image pickCard(){
        System.out.println("yes");
        Random rand = new Random();
        int upperbound =  23;
        int int_random = rand.nextInt(upperbound) + 1;
        int_random-=1;
        return bob[int_random];
    }


}
