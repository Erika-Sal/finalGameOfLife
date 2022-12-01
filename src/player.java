import java.awt.*;

public class player {
    GamePanel gp;
    double x, y;
    int money;
    String career;
    int salary;
    String house;
    int babies;
    int steps;

    double count;
    public player(int m, String c, int s, String h, int b, int st, GamePanel gp, int xVal, int yVal, double cnt) {
        money = m;
        career = c;
        salary = s;
        house = h;
        babies = b;
        steps = st;
        this.gp = gp;
        x = xVal;
        y = yVal;
        count = cnt;
    }
    public void move(){

        if(this.getSteps() < 35 ) {
            x += 1;
            y -= .4;
        }
        else if(this.getSteps() == 35){
            this.setCnt(-1);
        }else if(this.getSteps() >= 35 && this.getSteps() < 85 ) {
            x += 1;
            y -= .2;
        }else if(this.getSteps() == 85){
            this.setCnt(-1);
        }else if(this.getSteps() >= 85 && this.getSteps() < 135) {
            x += 1;
            y -= .05;
        }else if(this.getSteps() == 135){
            this.setCnt(-1);
        }else if(this.getSteps() >= 135 && this.getSteps() < 185) {
            x += 1;
            y -= .05;
        }else if(this.getSteps() == 185){
            this.setCnt(-1);
        }else if(this.getSteps() >= 184 && this.getSteps() < 235) {
            x += 1;
            y += .2;
        }else if(this.getSteps() ==235){
            this.setCnt(-1);
            this.addMoney(this.getSalary());
        }else if(this.getSteps() >= 235 && this.getSteps() < 275) {
            x += 1;
            y += .55;
        }else if(this.getSteps() == 275){
            this.setCnt(-1);
        }else if(this.getSteps() >= 275 && this.getSteps() < 318) {
            y += 1;
            x-=.4;
        }else if(this.getSteps() == 318){
            this.setCnt(-1);
        }else if(this.getSteps() >= 318 && this.getSteps() < 370) {
            y += .35;
            x -= 1;
        }else if(this.getSteps() == 370){
            this.setCnt(-1);
        }else if(this.getSteps() >= 370 && this.getSteps() < 415){
            y+=.25;
            x-=1;
        }else if(this.getSteps() == 415){
            // this.setCnt((int)this.getCnt() * -1);
            this.setCnt(-1);
        }else if(this.getSteps() >= 415 && this.getSteps() < 465) {
            y += .3;
            x -= 1;
        }else if(this.getSteps() == 465){
            this.setCnt(-1);
        }else if(this.getSteps() >= 465 && this.getSteps() < 500) {
            y += 1;
            x -= 1;
        }else if(this.getSteps() == 500){
            this.setCnt(-1);
        }else if(this.getSteps() >= 500 && this.getSteps() < 545) {
            x -= 0;
            y += 1;
        }else if(this.getSteps() == 545){
            this.setCnt(-1);
        }else if(this.getSteps() >= 545 && this.getSteps() < 585) {
            y += .8;
            x+=1;
        }else if(this.getSteps() == 585){
            this.setCnt(-1);
            this.addMoney(this.getSalary());
        }else if(this.getSteps() >= 585 && this.getSteps() < 640) {
            x += 1;
            y += .3;
        }else if(this.getSteps() == 640){
            this.setCnt(-1);
        }else if(this.getSteps() >= 640 && this.getSteps() < 695){
            x+=1;
            y+=.1;
        }else if(this.getSteps() == 695){
            this.setCnt(-1);
        }else if(this.getSteps() >= 695 && this.getSteps() < 750){
            x+=1;
            y-=.3;
        }else if(this.getSteps() == 750){
            //this.setCnt((int) this.getCnt() * -1);\
            this.setCnt(-1);
        }else if(this.getSteps() >= 750 && this.getSteps() < 810){
            x+=1;
            y-=.4;
        }else if(this.getSteps() == 810){
            this.setCnt(-1);
        }else if(this.getSteps() >= 810 && this.getSteps() < 850){
            x+=1;
            y-=1;
        }else if(this.getSteps() == 850){
            this.setCnt(-1);
        }else if(this.getSteps() >= 850 && this.getSteps() < 950){
            x+=.5;
            y-=.3;
        }else if(this.getSteps() == 950){
            this.setCnt(-1);
        }else if(this.getSteps() >= 950 && this.getSteps() < 1055){
            x+=.5;
            y+=.1;
        }else if(this.getSteps() == 1055){
            this.setCnt(-1); //step 20
        }else if(this.getSteps() >= 1055 && this.getSteps() < 1140){
            x+=.5;
            y+=.3;
        }else if(this.getSteps() == 1140){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1140 && this.getSteps() < 1220){
            y+=.65;
        }else if(this.getSteps() == 1220){
            this.setCnt(-1);
            this.addMoney(this.getSalary());
        }else if(this.getSteps() >= 1220 && this.getSteps() < 1290){
            x-=.3;
            y+=.6;
        }else if(this.getSteps() == 1290){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1290 && this.getSteps() < 1360){
            x-=.6;
            y+=.4;
        }else if(this.getSteps() == 1360){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1360 && this.getSteps() < 1460){
            x-=.6;
            y+=.2;
        }else if(this.getSteps() == 1460){
            this.setCnt(-1);//25^
        }else if(this.getSteps() >= 1460 && this.getSteps() < 1560){
            x-=.6;
        }else if(this.getSteps() == 1560){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1560 && this.getSteps() < 1680){
            x-=.5;
            y+=.1;
        }else if(this.getSteps() == 1680){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1680 && this.getSteps() < 1780){
            x-=.5;
            y+=.1;
        }else if(this.getSteps() == 1780){
            this.setCnt(-1);
            this.addMoney(this.getSalary());
        }else if(this.getSteps() >= 1780 && this.getSteps() < 1880){
            x-=.5;
            y+=.2;
        }else if(this.getSteps() == 1880){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1880 && this.getSteps() < 1965){
            x-=.5;
            y+=.3;
        }else if(this.getSteps() == 1965){
            //this.setCnt((int) this.getCnt() * -1);
            this.setCnt(-1);
        }else if(this.getSteps() >= 1965 && this.getSteps() < 2030){
            y+=.7;
        }else if(this.getSteps() == 2030){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2030 && this.getSteps() < 2090){
            x+=.3;
            y+=.7;
        }else if(this.getSteps() == 2090){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2090 && this.getSteps() < 2170){
            x+=.6;
            y+=.2;
        }else if(this.getSteps() == 2170){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2170 && this.getSteps() < 2250){
            x+=.7;
            y+=.1;
        }else if(this.getSteps() == 2250){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2250 && this.getSteps() < 2330){
            x+=.7;
            y-=.1;
        }else if(this.getSteps() == 2330){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2330 && this.getSteps() < 2410){
            x+=.7;
            y-=.2;
        }else if(this.getSteps() == 2410){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2410 && this.getSteps() < 2470){
            x+=.7;
        }else if(this.getSteps() == 2470){
            this.setCnt(-1);
            // this.addMoney(this.getSalary());
        }else if(this.getSteps() >= 2470 && this.getSteps() < 2570) {
            x += .7;
        }else if(this.getSteps() == 2570){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2570 && this.getSteps() < 2800) {
            x += .7;
        }/*else if(this.getSteps() >= 2800){
           this.setCnt(-1);
       }*/

    }
    public double getMove(){
        return x;
    }
    public void drawSelf(Graphics g, int p){
        if(p==1){
            //g.setColor(Color.black);
            //g.fillRect((int)x, (int)y, 20, 20);
            Image boyPeg = Toolkit.getDefaultToolkit().getImage("boyPeg.png"); /*the image cannot be in the SRC folder*/
            g.drawImage(boyPeg, (int)x, (int)y, 50,50,gp );
        }else{
            Image girlPeg = Toolkit.getDefaultToolkit().getImage("girlPeg.png"); /*the image cannot be in the SRC folder*/
            g.drawImage(girlPeg,(int)x, (int)y, 50,50,gp );
            //g.setColor(Color.blue);
            //g.fillRect((int)x, (int)y, 20, 20);
        }


    }

    public int getMoney() {
        return money;
    }

    public int getSalary() {
        return salary;
    }

    public String getCareer() {
        return career;
    }

    public int getBabies() {
        return babies;
    }

    public void setBabies(int num){
        babies += num;
    }

    public String getHouse() {
        return house;
    }

    public int getSteps() {
        return steps;
    }

    public void addMoney(int val){
        money+= val;
    }

    public void subMoney(int val){
        money-=val;
    }

    public void setSalary(int val){
        salary = val;
    }

    public void setCareer(String car){
        career = car;
    }

    public void setHouse(String h){
        house = h;
    }

    public void setSteps(){
        steps+=1;
    }

    public double getCnt(){
        return count;
    }

    public void setCnt(int amount){
        count+=amount;
    }






}
