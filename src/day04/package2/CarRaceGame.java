package day04.package2;

import day04.package1.CarRace;

import java.util.Scanner;

public class CarRaceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("경주할 자동차의 수를 입력하세요 : ");
        int carNum = sc.nextInt();  // 자동차 수 입력받음

        System.out.println();


        CarRace[] carName = new CarRace[carNum]; // 자동차 이름을 저장할 배열 생성

        System.out.println("경주할 자동차의 이름을 적어주세요");
        for(int i=0; i<=carNum-1; i++) {   // 입력받은 수만큼의 자동차 이름 지정
            carName[i] = new CarRace(sc.next());
        }

        System.out.println();

        System.out.print("시도할 횟수는 몇번 인가요? : ");
        int gameNum = sc.nextInt();

        // 1번 시도할때 마다 각 자동차가 입력받는 전진 번호
        int[] carDistance = new int[carNum];
        while(true){
            for(int i=0; i<=carNum-1; i++) {
                carDistance[i] = (int)(Math.random()*9);
            }
            for(int i=0; i<=carNum-1; i++) {
                System.out.print(carName[i].getName() + " 자동차가 이동한 거리 : ");
                carName[i].drive(carDistance[i]);
            }
        }
    }
}
