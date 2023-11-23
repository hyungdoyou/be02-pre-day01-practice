package day04.package2;

import day04.package1.Card;

public class Main2 {
    public static void main(String[] args) {
        Card heart01 = new Card(1,"하트",50,80);
        Card heart02 = new Card(2,"하트",50,80);
        Card heart03 = new Card(3,"하트",100,160);

        // heart03에서 가로, 세로 길이를 변경하여 생성해줬는데;
        // 가로, 세로 길이는 static 으로 서로 공유해서 사용토록 설정이 되어 있기 때문에
        // hear01, heart02 의 가로, 세로 길이도 heart03 생성 시 입력해 준 값으로 덮어쓰여지게 된다.

        System.out.println(heart01.toString());
        System.out.println(heart02.toString());
        System.out.println(heart03.toString());
    }
}
