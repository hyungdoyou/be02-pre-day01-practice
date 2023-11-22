package day02;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        // 입력받기 위한 스캐너 만들기
        // 숫자를 입력받을 크기가 6인 배열 만들기
        // 0부터 5까지 반복
        // 배열의 반복 횟수 번째에 숫자를 입력받아서 저장

        // 5부터 0까지 반복
        // 배열의 반복 횟수 번째에 숫자를 출력

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for(int i=0; i<=5; i++) {
            System.out.print("6개의 숫자를 차례로 입력하시오 : ");
            int inputNum = sc.nextInt();
            arr[i] = inputNum;
        }
        for(int i=5; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
