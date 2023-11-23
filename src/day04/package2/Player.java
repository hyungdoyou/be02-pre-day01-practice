package day04.package2;

import day04.package1.Yabawi;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {

        Yabawi player01 = new Yabawi(0, 5);
        Yabawi player02 = new Yabawi(0, 5);

        Scanner pl = new Scanner(System.in);

        while(true) {
            // 1 ~ 3의 숫자를 담은 박스 배열 생성
            int[] box = new int[3];
            for(int i=0; i<3; i++) {
                box[i] = i+1;
            }

            // 박스안의 값을 랜덤하게 섞어줌
            for(int i=0; i<100; i++) {
                int j=(int)(Math.random()*3);
                int temp = box[0];
                box[0] = box[j];
                box[j] = temp;
            }

            System.out.print("Player01님 1, 2, 3의 숫자 중 한개를 고르시오 : ");
            int number = pl.nextInt();
            player01.pickUp(box[number-1]);

            System.out.println();

            if(player01.gameSuccess()) {
                break;
            }

            System.out.println();

            System.out.print("Player02님 1, 2, 3의 숫자 중 한개를 고르시오 : ");
            int number2 = pl.nextInt();
            player02.pickUp(box[number2-1]);

            System.out.println();

            if(player02.gameSuccess()) {
                break;
            }
            if(player01.heartdie() && player02.heartdie()) {
                System.out.println("모든 플레이어가 하트를 소진하여 게임을 종료합니다.");
                break;
            }
        }
    }
}
