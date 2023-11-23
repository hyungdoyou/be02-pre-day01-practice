package day04.package1;

public class CarRace {
    private String name; // 자동차의 이름
    private int forward; // 전진 횟수

    public CarRace(String name) {
        this.name = name;
        this.forward = 0;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // 전진 기능
    public void drive(int distance){
        if(distance >= 4) {
            this.forward = forward + 10;
        }
        System.out.println(this.forward);
    }

    // 우승자 출력 기능
}
