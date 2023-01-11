import java.applet.*;
import java.awt.*;
import java.net.URL;
import java.util.Random;


public class careerCard {
    Image[] cc;
    int index;
    String career;
    int value;
    public careerCard(){
        cc = new Image[14];
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

value = 0;
    }

    public Image pickCard(){
        Random rand = new Random();
        int upperbound =  14;
        int int_random = rand.nextInt(upperbound) + 1;
        int_random-=1;
        setIndex(int_random);
        setValue();

        return cc[int_random];
    }

    public void setIndex(int val){
        index = val;
    }

    public int getIndex(){
        return index;
    }

    public String getCar(){
        return career;
    }

    public void setValue(){
        int val = getIndex();
        if(val == 0){
            value =  100000;
        }else if(val==1){
            value = 130000;
        }else if(val == 2){
            value = 80000;
        }else if(val == 3){
            value = 70000;
        }else if(val == 4){
            value = 100000;
        }else if(val == 5){
            value = 120000;
        }else if(val == 6){
            value = 60000;
        }else if(val == 7){
            value = 80000;
        }else if(val == 8){
            value = 100000;
        }else if(val == 9){
            value = 80000;
        }else if(val == 10){
            value = 110000;
        }else if(val == 11){
            value = 90000;
        }else if(val == 12){
            value = 90000;
        }else{
            value = 100000;
        }

    }

    public int getValue(){

        return value;
    }


}

