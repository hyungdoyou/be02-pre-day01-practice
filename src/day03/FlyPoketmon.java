package day03;

public class FlyPoketmon extends Poketmon{
    Integer z;

    // 난다
    void fly() {
        z = z + 10;
    }

    // 착륙한다
    void land() {
        z = z - 10;
    }
}
