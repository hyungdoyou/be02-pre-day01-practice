package day03;

public class Inheritance {
    public static void main(String[] args) {
        Parents parents = new Parents();

        Child child = new Child("k5");
        System.out.println(child.money);
        System.out.println(child.land);
        System.out.println(child.building);
    }
}
