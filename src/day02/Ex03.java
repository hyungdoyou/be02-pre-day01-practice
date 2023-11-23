package day02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = new int[6];
        for(int i=0; i<6; i++) {
            System.out.print("6개의 숫자를 입력하세요 : ");
            input[i] = sc.nextInt();
        }
        System.out.print("입력받은 숫자를 거꾸로 출력하면 : ");
        for(int i=5; i>=0; i--) {
            System.out.print(input[i] + " ");
        }
    }
}
