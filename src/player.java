public class player {
    int money;
    String career;
    int salary;
    String house;
    int babies;
    int steps;

    public player(int m, String c, int s, String h, int b, int st) {
        money = m;
        career = c;
        salary = s;
        house = h;
        babies = b;
        steps = st;
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
