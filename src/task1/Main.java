package task1;

public class Main {
    public static void main(String[] args) {


        Phone phone = new Phone("Samsung","J7","13.0","6.9");
        Phone phone1 = new Phone("Apple","Pro","14","6.3");
        Computer computer = new Computer("Aplle","IPS","12300","i7");
        Computer computer1 = new Computer("Allion","TN","10300","i9");

        SmartWatch smartWatch = new SmartWatch("Samrt7","VVHHH","mODE",4000);
        SmartWatch smartWatch1 = new SmartWatch("hUAWEI","Vafsdf","TTE",55000);

        System.out.println(phone);
        System.out.println(phone.turOn());
        System.out.println(phone.turnOf());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(phone1);
        System.out.println(phone1.turOn());
        System.out.println(phone1.turnOf());

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println(computer);
        System.out.println(computer.turOn());
        System.out.println(computer.turnOf());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(computer1);
        System.out.println(computer1.turOn());
        System.out.println(computer1.turnOf());

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println(smartWatch);
        System.out.println(smartWatch.turOn());
        System.out.println(smartWatch.turnOf());

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println(smartWatch1);
        System.out.println(smartWatch1.turOn());
        System.out.println(smartWatch1.turnOf());
    }
}
