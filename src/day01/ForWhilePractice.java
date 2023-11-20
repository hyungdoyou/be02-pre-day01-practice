package day01;

public class ForWhilePractice {
    public static void main(String[] args) {
        Integer num1;
        num1 = 10;

        // 만약에 num1 이 5보다 크면
        // "크다"를 출력하는 걸 반복한다.

        while(num1 > 5) {
            System.out.println("크다");
            // 조건을 변경시키는 코드
            num1 = num1 - 1;
        }
    }
}
