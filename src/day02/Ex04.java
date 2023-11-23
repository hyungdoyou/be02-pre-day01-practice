package day02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[10];

        for(int i=0; i<10; i++) {
            System.out.print("10개의 숫자를 입력하세요 : ");
            input[i] = sc.nextInt();
        }
        int totalNum = 0;
        for(int i=0; i<10; i++) {
            totalNum += input[i];
        }
        System.out.println("평균값 : " + (totalNum / input.length));
    }
}
