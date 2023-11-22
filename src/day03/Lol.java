package day03;

public class Lol {
    public static void main(String[] args) {
        Champion garen = new Champion();

        garen.name = "가렌";
        garen.attackPower = 45;
        garen.attackRange = 23;
        garen.hp = 500;
        garen.shield = 70;
        garen.exp = 1;
        garen.xPosition = 0;
        garen.yPosition = 0;
        garen.item = new String[6];
        for (int i=0; i<garen.item.length; i++) {
            garen.item[i] = "빈칸";
        }

        Champion darius = new Champion();
        darius.name = "다리우스";
        darius.attackPower = 60;
        darius.attackRange = 15;
        darius.hp = 500;
        darius.shield = 50;
        darius.exp = 1;
        darius.xPosition = 0;
        darius.yPosition = 0;
        darius.item = new String[6];
        for (int i=0; i<darius.item.length; i++) {
            darius.item[i] = "빈칸";
        }

        // 다리우스가 가렌을 공력한다.
        // 현재 가렌의 체력 출력
        darius.attackTO(garen);
        System.out.println(garen.hp);

        // 다리우스가 가렌을 공력한다.
        // 현재 가렌의 체력 출력
        darius.attackTO(garen);
        System.out.println(garen.hp);


        // 다리우스가 가렌을 공력한다.
        // 현재 가렌의 체력 출력
        darius.attackTO(garen);
        System.out.println(garen.hp);

    }
}
