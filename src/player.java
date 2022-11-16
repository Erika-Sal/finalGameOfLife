import java.awt.*;

public class player {
    GamePanel gp;
    int x, y;
    int money;
    String career;
    int salary;
    String house;
    int babies;
    int steps;

    public player(int m, String c, int s, String h, int b, int st, GamePanel gp, int xVal, int yVal) {
        money = m;
        career = c;
        salary = s;
        house = h;
        babies = b;
        steps = st;
        this.gp = gp;
        x = xVal;
        y = yVal;
    }
    public void move(){
    x+=3;
    }
    public int getMove(){
        return x;
    }
    public void drawSelf(Graphics g, int p){
        if(p == 1){
            g.setColor(Color.yellow);
            g.fillRect(x, y, 20, 20);
        }else{
            g.setColor(Color.blue);
            g.fillRect(x, y, 20, 20);
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




}
