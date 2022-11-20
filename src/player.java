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
        if(this.getSteps() < 40 ) {
            x += 1;
            y -= .4;
        }else if(this.getSteps() == 40){
            this.setCnt(-1);
        }else if(this.getSteps() >= 40 && this.getSteps() < 80 ) {
            x += 1;
            y -= .4;
        }else if(this.getSteps() == 80){
            this.setCnt(-1);
        }else if(this.getSteps() >= 80 && this.getSteps() < 130) {
            x += 1;
            y -= .05;
        }else if(this.getSteps() == 130){
            this.setCnt(-1);
        }else if(this.getSteps() >= 130 && this.getSteps() < 169) {
            x += 1;
            y -= .05;
        }else if(this.getSteps() == 169){
            this.setCnt(-1);
        }else if(this.getSteps() >= 169 && this.getSteps() < 210) {
            x += 1;
            y -= .05;
        }else if(this.getSteps() ==210){
            this.setCnt(-1);
        }else if(this.getSteps() >= 210 && this.getSteps() < 250) {
            x += 1;
            y -= .05;
        }else if(this.getSteps() == 250){
            this.setCnt(-1);
        }else if(this.getSteps() >= 250 && this.getSteps() < 310) {
            x += .5;
            y += .5;
        }else if(this.getSteps() == 310){
            this.setCnt(-1);
        }else if(this.getSteps() >= 310 && this.getSteps() < 345) {
            y += 1;
            x -= .1;
        }else if(this.getSteps() == 345){
            this.setCnt(-1);
        }else if(this.getSteps() >= 345 && this.getSteps() < 395){
            y+=.3;
            x-=1;
        }else if(this.getSteps() == 395){
            this.setCnt(-1);
        }else if(this.getSteps() >= 395 && this.getSteps() < 430) {
            y += .3;
            x -= 1;
        }else if(this.getSteps() == 430){
            this.setCnt((int)this.getCnt() * -1);
        }else if(this.getSteps() >= 430 && this.getSteps() < 475) {
            y += .3;
            x -= 1;
        }else if(this.getSteps() == 475){
            this.setCnt(-1);
        }else if(this.getSteps() >= 475 && this.getSteps() < 520) {
            x -= .5;
            y += .8;
        }else if(this.getSteps() == 520){
            this.setCnt(-1);
        }else if(this.getSteps() >= 520 && this.getSteps() < 600) {
            y += .5;
        }else if(this.getSteps() == 600){
            this.setCnt(-1);
        }else if(this.getSteps() >= 600 && this.getSteps() < 670) {
            x += .5;
            y += .4;
        }else if(this.getSteps() == 670){
            this.setCnt(-1);
        }else if(this.getSteps() >= 670 && this.getSteps() < 750){
            x+=.5;
            y+=.3;
        }else if(this.getSteps() == 750){
            this.setCnt(-1);
        }else if(this.getSteps() >= 750 && this.getSteps() < 830){
            x+=.5;
        }else if(this.getSteps() == 830){
            this.setCnt(-1);
        }else if(this.getSteps() >= 830 && this.getSteps() < 940){
            x+=.5;
            y-=.15;
        }else if(this.getSteps() == 940){
            this.setCnt(-1);
        }else if(this.getSteps() >= 940 && this.getSteps() < 1030){
            x+=.5;
            y-=.3;
        }else if(this.getSteps() == 1030){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1030 && this.getSteps() < 1120){
            x+=.5;
            y-=.3;
        }else if(this.getSteps() == 1120){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1120 && this.getSteps() < 1200){
            x+=.5;
            y-=.4;
        }else if(this.getSteps() == 1200){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1200 && this.getSteps() < 1270){
            x+=.5;
        }else if(this.getSteps() == 1270){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1270 && this.getSteps() < 1330){
            x+=.5;
            y+=.5;
        }else if(this.getSteps() == 1330){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1330 && this.getSteps() < 1380){
            y+=1;
        }else if(this.getSteps() == 1380){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1380 && this.getSteps() < 1415){
            x-=.5;
            y+=.85;
        }else if(this.getSteps() == 1415){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1415 && this.getSteps() < 1460){
            x-=.5;
            y+=.85;
        }else if(this.getSteps() == 1460){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1460 && this.getSteps() < 1560){
            x-=.5;
            y+=.1;
        }else if(this.getSteps() == 1560){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1560 && this.getSteps() < 1660){
            x-=.5;
            y+=.1;
        }else if(this.getSteps() == 1660){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1660 && this.getSteps() < 1765){
            x-=.5;
            y+=.1;
        }else if(this.getSteps() == 1765){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1765 && this.getSteps() < 1865){
            x-=.5;
            y+=.1;
        }else if(this.getSteps() == 1865){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1865 && this.getSteps() < 1965){
            x-=.5;
            y+=.1;
        }else if(this.getSteps() == 1965){
            this.setCnt(-1);
        }else if(this.getSteps() >= 1965 && this.getSteps() < 2030){
            x-=.5;
            y+=.6;
        }else if(this.getSteps() == 2030){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2030 && this.getSteps() < 2065){
            x+=.2;
            y+=1;
        }else if(this.getSteps() == 2065){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2065 && this.getSteps() < 2108){
            x+=.2;
            y+=.95;
        }else if(this.getSteps() == 2108){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2108 && this.getSteps() < 2160){
            x+=.9;
            y+=.3;
        }else if(this.getSteps() == 2160){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2160 && this.getSteps() < 2250){
            x+=.5;
        }else if(this.getSteps() == 2250){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2250 && this.getSteps() < 2350){
            x+=.9;
            y-=.1;
        }else if(this.getSteps() == 2350){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2350 && this.getSteps() < 2400){
            x+=.9;
            y-=.1;
        }else if(this.getSteps() == 2400){
            this.setCnt(-1);
        }else if(this.getSteps() >= 2400 && this.getSteps() < 2460) {
            x += .9;
            y += .1;
        }else if(this.getSteps() == 2460){
                this.setCnt(-1);
        }else if(this.getSteps() >= 2460 && this.getSteps() < 2500){
            x+=.9;
        }
    }
    public double getMove(){
        return x;
    }
    public void drawSelf(Graphics g, int p){
        if(p == 1){
            g.setColor(Color.black);
            g.fillRect((int)x, (int)y, 20, 20);
        }else{
            g.setColor(Color.blue);
            g.fillRect((int)x, (int)y, 20, 20);
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
