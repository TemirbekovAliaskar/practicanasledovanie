package task3;

public class Spartak {

    private String name;
    private int count;

public Spartak(){}

    public Spartak(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public String getInfo(){
        return "Name" + getName()+"Count"+getCount();
    }

    @Override
    public String toString() {
        return "Spartak{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
