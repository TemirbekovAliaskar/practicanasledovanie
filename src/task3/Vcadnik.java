package task3;

public class Vcadnik extends  Spartak{

    private int speed;
    private String strong;

    public Vcadnik(String name, int count, int speed, String strong) {
        super(name, count);
        this.speed = speed;
        this.strong = strong;
    }

    public String getStrong() {
        return strong;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getInfo(){
        return "Name" + getName()+"Count"+getCount();
    }

    @Override
    public String toString() {
        return "Vcadnik{" +
                "speed=" + speed +
                ", strong='" + strong + '\'' +
                '}'+ super.toString();
    }
}
