package day02;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        // 정수로 된 돈의 액수를 입력받아,
        // 오만원권, 만원권, 천원권, 500원, 100원, 50원, 10원, 1원이 각각 몇개씩 필요한지 출력
        // unit 배열을 활용

        // 정수로 된 돈을 입력받기 위한 스캐너를 만는다.
        // 화폐의 개수를 저장할 새로운 배열 count 를 만든다.

        // 반복문을 사용하여 count 배열에 화폐의 개수를 저장한다. / 화폐의 개수는 입력받은 돈을 화폐 단위로 나눴을때의 몫이다.
        // 반복문을 실행할때, 입력받은 돈은 화폐 단위로 나눈 나머지 값을 저장한다.
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
        int[] count = new int[unit.length];

        Scanner sc = new Scanner(System.in);
        System.out.print("돈을 입력하시오 : ");
        int inputMoney = sc.nextInt();
        for(int i=0; i<unit.length; i++) {
                count[i] = inputMoney / unit[i];
                inputMoney %= unit[i];
        }
        System.out.println("50000원 : " + count[0] + "개");
        System.out.println("10000원 : " + count[1] + "개");
        System.out.println("5000원 : " + count[2] + "개");
        System.out.println("1000원 : " + count[3] + "개");
        System.out.println("500원 : " + count[4] + "개");
        System.out.println("100원 : " + count[5] + "개");
        System.out.println("50원 : " + count[6] + "개");
        System.out.println("10원 : " + count[7] + "개");
        System.out.println("1원 : " + count[8] + "개");
    }
}
