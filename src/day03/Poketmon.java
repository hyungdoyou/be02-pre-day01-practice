package day03;

public class Poketmon {
    Integer x;
    Integer y;
    String name;
    Integer hp;
    Integer exp;
    Integer attackPower;
    Integer type;
    Integer level;

    // 레벨업
    Integer levelUp() {
        level = level + 1;
        attackPower = attackPower * 120 / 100;
        hp = hp * 110 / 100;

        return level;
    }
    // 경험치 얻기
    Integer expUp() {
        exp = exp + 10;
        if(exp >= 100) {
            levelUp();
            exp = exp % 100;
        }
        return exp;
    }
    // 공격하기
    void attackTo(Poketmon target) {
        target.attacked(this.attackPower);
    }
    // 공격받기
    Integer attacked(Integer attackPower){
        this.hp = this.hp - attackPower;
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
    // 마을로 귀환
    void recall() {
        x = 0;
        y = 0;
    }
}
