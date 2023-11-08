package task2;

public class Main {
    public static void main(String[] args) {


        Mother mother = new Mother("Aliman",50,"black");
        Mother mother1 = new Mother("Batma",55,"blue");

        Daugther daugther = new Daugther("Aizat",20,"green","Green",170);
        Daugther daugther1 = new Daugther("Datka",23,"grown","black",170);

        System.out.println(mother);
//        System.out.println(mother.callM);


        System.out.println("------------------");


        System.out.println(mother1);
//        System.out.println(mother1.callMe());

        System.out.println(">>>>>>>>>>>>>>>>>>");

        System.out.println(daugther);
        System.out.println(daugther.callMe());

        System.out.println(">>>>>>>>>>>>>>>>>>>");

        System.out.println(daugther1);
        System.out.println(daugther1.callMe());
    }
}
