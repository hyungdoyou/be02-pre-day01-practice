package day03;

public class Battle {
    public static void main(String[] args) {
        FlyPoketmon butterful = new FlyPoketmon();
        FlyPoketmon pizone = new FlyPoketmon();

        Poketmon yadoran = new Poketmon();
        Poketmon pikachu = new Poketmon();

        butterful.z = 0;
        System.out.println(butterful.z);
        butterful.fly();
        System.out.println(butterful.z);
        butterful.land();
        System.out.println(butterful.z);

        pikachu.hp = 500;
        butterful.hp = 400;
        pikachu.attackPower=30;
        System.out.println(butterful.hp);
        pikachu.attackTo(butterful);
        System.out.println(butterful.hp);


    }
}
