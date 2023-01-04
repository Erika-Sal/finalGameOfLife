import java.applet.*;
import java.awt.*;
import java.net.URL;
import java.util.Random;


public class careerCard {
    Image[] cc;
    int index;
    public careerCard(){
        cc = new Image[23];
        cc[0] = Toolkit.getDefaultToolkit().getImage("athlete.PNG");
        cc[1] = Toolkit.getDefaultToolkit().getImage("brainSurgeon.PNG");
        cc[2] = Toolkit.getDefaultToolkit().getImage("farmer.PNG");
        cc[3] = Toolkit.getDefaultToolkit().getImage("fashionDesigner.PNG");
        cc[4] = Toolkit.getDefaultToolkit().getImage("filmStar.PNG");
        cc[5] = Toolkit.getDefaultToolkit().getImage("lawyer.PNG");
        cc[6] = Toolkit.getDefaultToolkit().getImage("mechanic.PNG");
        cc[7] = Toolkit.getDefaultToolkit().getImage("musician.PNG");
        cc[8] = Toolkit.getDefaultToolkit().getImage("pilot.PNG");
        cc[9] = Toolkit.getDefaultToolkit().getImage("policeOfficer.PNG");
        cc[10] = Toolkit.getDefaultToolkit().getImage("rocketScientist.PNG");
        cc[11] = Toolkit.getDefaultToolkit().getImage("stuntPerformer.PNG");
        cc[12] = Toolkit.getDefaultToolkit().getImage("teacher.PNG");
        cc[13] = Toolkit.getDefaultToolkit().getImage("vet.PNG");

    }

    public Image pickCard(){
        Random rand = new Random();
        int upperbound =  14;
        int int_random = rand.nextInt(upperbound) + 1;
        int_random-=1;
        setIndex(int_random);
        return cc[int_random];
    }

    public void setIndex(int val){
        index = val;
    }

    public int getIndex(){
        return index;
    }

}

