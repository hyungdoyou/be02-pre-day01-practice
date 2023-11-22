package day02;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        // 숫자를 입력받을 크기가 10인 배열 만들기
        // 0부터 9까지 반복
        // 배열의 반복 횟수 번째에 숫자를 입력받아서 저장
        // 모든 수를 저장할 변수를 생성
        // 0부터 9까지 반복
        // 모든 수를 저장할 변수에 반복 횟수에 해당하는 배열의 값을 더해서 저장
        // 모든 수를 저장한 변수에 배열의 크기만큼 나눠서 출력

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<=9; i++) {
            System.out.print("10개의 숫자를 입력하시오 : ");
            arr[i] = sc.nextInt();
        }

        int toalNum = 0;
        for(int i=0; i<=9; i++) {
            toalNum += arr[i];
        }
        System.out.println("최종 값 : " + (toalNum / arr.length));
    }
}
