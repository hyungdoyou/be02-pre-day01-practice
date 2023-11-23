package day04.package1;

public class CarRace {
    private String name; // 자동차의 이름
    private int forward; // 전진 횟수

    private String far;
    public CarRace(String name) {
        this.name = name;
        this.forward = 0;
        this.far = "";
    }

    public String getName() {
        return name;
    }

    // 전진 거리
    public void drive(int distance){
        if(distance >= 4) {
            this.forward = forward + 10;
        }
        // System.out.println(this.forward);
    }
    // 전진한 막대기
    public void move(int moving) {
        if(moving >= 4) {
            this.far = far + "-";
        }
        System.out.println(this.far);
    }

    public int getForward() {
        return forward;
    }
}
