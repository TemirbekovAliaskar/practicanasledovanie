package task3;

public class Luchnik extends Spartak{

    private String orujie;
    private String position;

    public Luchnik(String name, int count, String orujie, String position) {
        super(name, count);
        this.orujie = orujie;
        this.position = position;
    }

    public String getOrujie() {
        return orujie;
    }

    public void setOrujie(String orujie) {
        this.orujie = orujie;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public String getInfo(){
        return "Name" + getName()+"Count"+getCount();
    }

    @Override
    public String toString() {
        return "Luchnik{" +
                "orujie='" + orujie + '\'' +
                ", position='" + position + '\'' +
                '}'+super.toString();
    }
}
