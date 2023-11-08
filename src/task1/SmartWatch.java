package task1;

public class SmartWatch extends Tehnialogy {
    private int price ;

    public SmartWatch(String name, String brand, String version, int price) {
        super(name, brand, version);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String turOn(){
        return getName() + "Kuidu ";
    }
    public String turnOf (){
        return getName()+"Ochtu ";
    }

    @Override
    public String toString() {
        return "task1.SmartWatch{" +
                "price=" + price +
                '}'+ super.toString();
    }
}
