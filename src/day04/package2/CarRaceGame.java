package day04.package2;

import day04.package1.CarRace;

import java.util.Arrays;
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

        System.out.println();

        // 1번 시도할때 마다 각 자동차가 입력받는 전진 번호
        int[] carDistance = new int[carNum];
        int[] totalDistance = new int[carNum];
        for(int i=0; i<gameNum; i++) {
            for(int j=0; j<=carNum-1; j++) {
                carDistance[j] = (int)(Math.random()*9);
            }
            for(int j=0; j<=carNum-1; j++) {
                System.out.print(carName[j].getName() + " 자동차가 이동한 거리 : ");
                carName[j].move(carDistance[j]);
                carName[j].drive(carDistance[j]);
                totalDistance[j] = carName[j].getForward();
            }
            System.out.println();
        }
        // 최대거리 찾기
        int max=totalDistance[0];
        for(int i=0; i<=carNum-1; i++) {
            if(max < totalDistance[i]) {
                max = totalDistance[i];
            }
        }
        System.out.println("최종 우승자");
        // 최대 거리와 비교하여 같은 거리인 사람 출력
        for(int i=0; i<=carNum-1; i++) {
            if(max == totalDistance[i]) {
                System.out.println(carName[i].getName());
            }
        }
    }
}
