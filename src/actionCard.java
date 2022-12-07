import java.applet.*;
import java.awt.*;
import java.net.URL;


public class actionCard extends Applet{

    Image[] bob;
    public actionCard(int n){
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
    }
}
