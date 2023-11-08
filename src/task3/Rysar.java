package task3;

public class Rysar extends  Spartak {
    private String clothers;
    private String transport;

    public Rysar(String name, int count, String clothers, String transport) {
        super(name, count);
        this.clothers = clothers;
        this.transport = transport;
    }

    public String getClothers() {
        return clothers;
    }

    public void setClothers(String clothers) {
        this.clothers = clothers;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
    public String getInfo(){
        return "Name" + getName()+"Count"+getCount();
    }

    @Override
    public String toString() {
        return "Rysar{" +
                "clothers='" + clothers + '\'' +
                ", transport='" + transport + '\'' +
                '}'+super.toString();
    }
}
