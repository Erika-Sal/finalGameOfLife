import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.util.Random;

public class spinner extends Applet {

    static Image[] spinNums;
    int index;

    public spinner() {
        spinNums = new Image[10];
        spinNums[0] = Toolkit.getDefaultToolkit().getImage("1__1__AdobeExpress.gif");
        spinNums[1] = Toolkit.getDefaultToolkit().getImage("2__1__AdobeExpress.gif");
        spinNums[2] = Toolkit.getDefaultToolkit().getImage("3__1__AdobeExpress.gif");
        spinNums[3] = Toolkit.getDefaultToolkit().getImage("4__1__AdobeExpress.gif");
        spinNums[4] = Toolkit.getDefaultToolkit().getImage("5__1__AdobeExpress.gif");
        spinNums[5] = Toolkit.getDefaultToolkit().getImage("6mp4_AdobeExpress.gif");
        spinNums[6] = Toolkit.getDefaultToolkit().getImage("ezgif.com-gif-maker.gif");
        spinNums[7] = Toolkit.getDefaultToolkit().getImage("8__1__AdobeExpress.gif");
        spinNums[8] = Toolkit.getDefaultToolkit().getImage("9__1__AdobeExpress.gif");
        spinNums[9] = Toolkit.getDefaultToolkit().getImage("10__2__AdobeExpress.gif");
    }
    public Image showSpin(int num){
        num-=1;
        return spinNums[num];
    }

    public static ImageIcon getIcons(int num){
        ImageIcon temp = new ImageIcon(spinNums[num]);
        return temp;
    }
}


