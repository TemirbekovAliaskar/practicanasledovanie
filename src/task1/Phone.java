package task1;

public class Phone extends Tehnialogy {
    private String screen;


    public Phone(String name, String brand, String version,String screen) {
        super(name, brand, version);
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String turOn(){
        return getName() + "Kuidu ";
    }
    public String turnOf (){
        return getName()+"Ochtu ";
    }

    @Override
    public String toString() {
        return "task1.Phone{" +
                "screen='" + screen + '\'' +
                '}'+ super.toString();
    }
}
