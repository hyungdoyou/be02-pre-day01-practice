package day04.package1;

public class Yabawi {
    private static Integer score; // 점수 (플레이어 간 공유)
    private Integer heart;   // 하트
    private Boolean success; // 성공기준
    private Boolean die;     // 하트 소진 기준
    public Yabawi(Integer score, Integer heart) {
        this.score = score;
        this.heart = heart;
    }

    // 숫자 고르기 기능
    public void pickUp(Integer num) {
        if(num == 3) {
            System.out.println("정답을 고르셨습니다. 점수가 1 증가합니다.");
            scoreChange(3);
        } else if(num == 2) {
            System.out.println("꽝을 고르셨습니다. 하트 개수가 1 감소합니다.");
            heartDown(2);
        } else if(num == 1) {
            System.out.println("폭탄을 고르셨습니다. 하트와 점수가 1씩 감소합니다.");
            scoreChange(1);
            System.out.println();
            heartDown(1);
        }
    }
    // 점수 변동 기능
    Integer scoreChange(Integer num) {
        if(num == 3) {
            this.score = score + 1;
        } else if(num == 1) {
            this.score = score - 1;
        }
        if(this.score < 0) {   // 점수는 0 미만으로 떨어지지 않음
            this.score = 0;
        }
        System.out.print("현재 점수 : " + score);
        return score;
    }

    // 하트 감소 기능
    Integer heartDown(Integer num) {
        if(num == 2) {
            this.heart = heart - 1;
        } else if(num == 1) {
            this.heart = heart - 1;
        }
        System.out.println("현재 하트 : " + heart);
        return heart;
    }
    // 하트 소진 기능
    public Boolean heartdie(){
        if(this.heart == 0) {
            this.die = true;
        } else {
            this.die = false;
        }
        return die;
    }
    // 게임 성공/실패 기능
    public Boolean gameSuccess() {
        if(this.score == 3) {
            System.out.println("야바위 게임을 클리어 하셨습니다.");
            this.success = true;
        } else {
            this.success = false;
        }
        return success;
    }
}
