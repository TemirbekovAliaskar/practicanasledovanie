package task3;

import javax.sound.midi.VoiceStatus;
import java.util.Arrays;




public class Main {
    public static void main(String[] args) {

        Spartak spartak = new Spartak("Aliaskar",5);

        Luchnik luchnik = new Luchnik("Jigit",5,"Jaa","Atacka");
        Luchnik luchnik1 = new Luchnik("Mirlan",3,"Arbalet","Atacka");


        Rysar rysar = new Rysar("Nurlan",4,"KAska","Horst");
        Rysar rysar1 = new Rysar("Eldiar",5,"Mech","Horst");

        System.out.println("<><><><><><><><><><><><><><><><><><><>");

        Vcadnik vcadnik = new Vcadnik("Nurislam",6,40,"Strong");
        Vcadnik vcadnik1 = new Vcadnik("Kairat",6,35,"not Strong");


        Filosof filosof =new Filosof("Esen",3,"LUK",67);
        Filosof filosof1 =new Filosof("Samat",2,"aplle",70);



        Spartak[]spartaks ={spartak,luchnik,luchnik1,rysar,rysar1,vcadnik,vcadnik1,filosof1,filosof};

        for (Spartak spart : spartaks){
            System.out.println(spart);
        }
        count(spartaks);

    }

    public static void count(Spartak [] spartaks){
        for (int i = 1; i < 20  ; i++) {
            for (int j = 0; j < spartaks.length  ; j++) {
                if (i == spartaks[j].getCount()) System.out.println("Name :"+spartaks[j].getName()+"  Количество :"+spartaks[j].getCount());

            }

        }
    }
}
