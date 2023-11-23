package day02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] count = new int[unit.length];

        Scanner sc = new Scanner(System.in);
        System.out.print("돈을 입력하세요 : ");
        int input = sc.nextInt();

        for(int i=0; i<unit.length; i++) {
            count[i] = input / unit[i];
            input %= unit[i];
        }
        System.out.println("50000원 권 : " + count[0] + "개");
        System.out.println("10000원 권 : " + count[1] + "개");
        System.out.println("5000원 권 : " + count[2] + "개");
        System.out.println("1000원 권 : " + count[3] + "개");
        System.out.println("500원 동전 : " + count[4] + "개");
        System.out.println("100원 동전 : " + count[5] + "개");
        System.out.println("50원 동전 : " + count[6] + "개");
        System.out.println("10원 동전 : " + count[7] + "개");
        System.out.println("1원 동전 : " + count[8] + "개");
    }
}
