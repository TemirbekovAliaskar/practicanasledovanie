package task1;

public class Computer extends Tehnialogy {
    private String prosessor;

    public Computer(String name, String brand, String version, String prosessor) {
        super(name, brand, version);
        this.prosessor = prosessor;
    }

    public String getProsessor() {
        return prosessor;
    }

    public void setProsessor(String prosessor) {
        this.prosessor = prosessor;
    }
    public String turOn(){
        return getName() + "Kuidu ";
    }
    public String turnOf (){
        return getName()+"Ochtu ";
    }

    @Override
    public String toString() {
        return "task1.Computer{" +
                "prosessor='" + prosessor + '\'' +
                '}'+ super.toString();
    }
}
