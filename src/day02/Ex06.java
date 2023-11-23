package day02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] week = {"월","화","수","목","금","토","일"};
        System.out.print("1 ~ 6 사이 숫자를 입력하세요 : ");
        int num = sc.nextInt();

        if(num >= 0 && num <=6) {
            System.out.println(week[num]);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
