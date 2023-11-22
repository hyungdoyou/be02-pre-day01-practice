package day03;

import java.lang.reflect.Constructor;

class Champion {
    String name;
    Integer attackPower;
    Integer attackRange;
    Integer hp;
    Integer shield;
    Integer level;
    Integer exp;
    Integer xPosition;
    Integer yPosition;
    String[] item;

    // 레벨업 기능
    Integer levelUp() {
        // 현재 level에 1더해서 저장
        level = level + 1;                         // this. 이 생략되어있다.
        // attackPower에 10% 증가시켜서 저장
        attackPower = attackPower * 110 / 100;     // this. 이 생략되어있다.
        // shield에 5% 증가시켜서 저장
        shield = shield * 105 / 100;    // this. 이 생략되어있다.
        // hp에 20% 증가시켜서 저장
        hp = hp * 120 / 100;            // this. 이 생략되어있다.

        return level;
    }
    // 경험치업 기능
    Integer expUp(String enemy) {
        // 만약에 enemy 가 미니언이면
        //      현재 경험치에 10 추가
        if (enemy == "minian") {
            exp = exp + 10;
        }
        // 그렇지 않고 만약에 enemy가 용이면
        //      현재 경험치에 50 추가
        else if(enemy == "dragon") {
            exp = exp + 50;
        }
        // 그렇지않고 만약에 enemy가 타워면
        //      현재 경험치에 100 추가
        else if(enemy == "tower") {
            exp = exp + 100;
        }
        // 만약에 현재 경험치가 100보다 크면
        //      레벨업
        if(exp >= 100) {
            levelUp();      // this. 이 생략되어있다.
            exp = exp % 100;
        }
        // 현재 경험치에 100으로 나눈 나머지를 저장한다.

        return exp;
    }
    // 이동 기능
    void move(Integer xPosition, Integer yPosition) {
        this.xPosition = xPosition;     // 여기서 this. 을 적어주는 이유는 xPosition이 동일하기 때문에 표시해줘야 된다.
        this.yPosition = yPosition;
    }
    // 귀환 기능
    void recall() {
        xPosition = 0;
        yPosition = 0;
    }
    // 공격 받음
    Integer attacked(Integer attackPower){
        this.hp = this.hp - attackPower;
        if(hp <= 0) {
            this.die();
        }
        return hp;
    }

    // 공격 받음 메서드를 숫자를 하나 더 전달받는 메서드로 만든다. (메서드 오버로딩) 크리티컬로 공격받음
    Integer attacked(Integer attackPower, Integer num){
        this.hp = this.hp - attackPower * num;

        if(hp <= 0) {
            this.die();
        }
        return hp;
    }

    // 공격 하기
    /*
    void attackTO(Champion target) {
        //target.hp = target.hp - this.attackPower;   // 썩 좋은 코드는 아니다. 남의 변수를 바꾸는것은 좋지 않다.

        target.attacked(this.attackPower);            // 타겟이 받은 피해량인데 나의 공격력을 입력받는 것
    }
     */
    void attackTO(Champion target) {
        // 1부터 100 사의 랜덤 숫자를 생성
        // 만약 90 이상이면
        //      3배 크리티컬 공격
        // 그렇지 않고 만약에 80 이상이면
        //      2배 크리티컬 공격
        Integer random = (int)(Math.random()*100) + 1;
        if(random >= 90) {
            target.attacked(this.attackPower, 3);
        } else if(random >= 80) {
            target.attacked(this.attackPower, 2);
        } else {
            target.attacked(this.attackPower);
        }
    }
    // 죽는다
    void die() {
        this.recall();
        this.hp = 100;
    }
    // 아이템 구매
    String[] buyItem(String itemName) {
       for(int i=0; i< this.item.length; i++) {
           if(this.item[i] == "빈칸") {
               this.item[i] = itemName;
               break;
           }
       }
       return item;
    }
}
