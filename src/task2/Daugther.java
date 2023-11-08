package task2;

public class Daugther extends Mother {

    private String haircolor;

    private int heigh;

    public Daugther(String name, int age, String eyeColor, String haircolor, int heigh) {
        super(name, age, eyeColor);
        this.haircolor = haircolor;
        this.heigh = heigh;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }
    public String callMe (){
        return getName() + " pretty this ia girl !";
    }

    @Override
    public String toString() {
        return "Daugther{" +
                "haircolor='" + haircolor + '\'' +
                ", heigh=" + heigh +
                '}'+ super.toString();
    }
}
