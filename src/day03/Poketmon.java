package day03;

public class Poketmon {
    Integer x;           // x 좌표
    Integer y;           // y 좌표
    String name;         // 포켓몬 이름
    Integer hp;          // 체력
    Integer exp;         // 경험치
    Integer attackPower; // 공격력
    Integer shield;      // 방어력
    Integer type;        // 포켓몬 타입
    Integer level;       // 레벨

    // 레벨업
    Integer levelUp() {
        level = level + 1;
        attackPower = attackPower * 120 / 100;
        shield = shield * 105 / 100;
        hp = hp * 110 / 100;

        return level;
    }
    // 경험치 얻기
    Integer expUp(String monster) {
        // 만약에 monster 가 빅보스면
        //      현재 경험치에 10 추가
        if (monster == "bigBoss") {
            exp = exp + 100;
        }
        // 그렇지 않고 만약에 monster가 중간보스면
        //      현재 경험치에 50 추가
        else if(monster == "middleBoss") {
            exp = exp + 50;
        }
        // 그렇지 않고 만약에 monster가 스몰보스면
        //      현재 경험치에 10 추가
        else if(monster == "smallBoss") {
            exp = exp + 10;
        }
        // 만약에 현재 경험치가 100보다 크면
        //      레벨업
        if(exp >= 100) {
            levelUp();
            exp = exp % 100;
        }
        return exp;
    }
    // 공격 하기
    void attackTo(Poketmon target) {
        // 1부터 100 사의 랜덤 숫자를 생성
        // 만약 90 이상이면
        //      3배 크리티컬 공격
        // 그렇지 않고 만약에 80 이상이면
        //      2배 크리티컬 공격
        // 그렇지 않으면
        //      일반 공격
        Integer random = (int)(Math.random()*100) + 1;
        if(random >= 90) {
            target.attacked(this.attackPower, 3);
        } else if(random >= 80) {
            target.attacked(this.attackPower, 2);
        } else {
            target.attacked(this.attackPower);
        }
    }
    // 공격 받음
    Integer attacked(Integer attackPower){
        this.hp = this.hp - attackPower;
        if(hp <= 0) {
            this.die();
        }
        return hp;
    }
    // 크리티컬 공격 받음 (오버로딩)
    Integer attacked(Integer attackPower, Integer num){
        this.hp = this.hp - attackPower * num;
        if(hp <= 0) {
            this.die();
        }
        return hp;
    }
    // 죽는다
    void die() {
        this.recall();
        this.hp = 100;
    }
    // 이동 기능
    void move(Integer x, Integer y) {
        this.x = x;     // 여기서 "this. " 을 적어주는 이유는 x 가 동일하기 때문에 표시해주기 위해서다.
        this.y = y;
    }
    // 마을로 귀환
    void recall() {
        x = 0;
        y = 0;
    }
}
