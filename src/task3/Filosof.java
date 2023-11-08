package task3;

public class Filosof extends Spartak{

    private String invention;
    private int age;

    public Filosof(String name, int count, String invention, int age) {
        super(name, count);
        this.invention = invention;
        this.age = age;
    }

    public String getInvention() {
        return invention;
    }

    public void setInvention(String invention) {
        this.invention = invention;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "Name" + getName()+"Count"+getCount();
    }

    @Override
    public String toString() {
        return "Filosof{" +
                "invention='" + invention + '\'' +
                ", age=" + age +
                '}'+super.toString();
    }
}
