package day02;

import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        // 배열에 월~일 까지 초기화하고 0부터 6까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는
        // 요일을 출력하고, 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다" 를 출력

        // 입력받기 위한 스캐너 만들기
        // 월~일 저장할 배열 만들기
        // 배열에 월~일 저장
        // 숫자를 입력받을 변수 생성
        // 숫자를 입력받아 변수에 저장
        // 만약에 입력받응 숫자가 0 ~ 6이면 배열에 입력받은 숫자번째 값을 출력
        // 그렇지 않으면 "잘못 입력하셨습니다" 를 출력

        Scanner sc = new Scanner(System.in);
        String[] arr = {"월", "화", "수", "목", "금", "토", "일"};

        System.out.print("숫자를 입력하세요 : ");
        int inputNum = sc.nextInt();
        if(inputNum >= 0 && inputNum <=6) {
            System.out.println(arr[inputNum]);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
