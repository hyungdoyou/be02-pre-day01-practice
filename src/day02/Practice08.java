package day02;

public class Practice08 {
    public static void main(String[] args) {
        // 로또 번호 생성기 만들기
        // 로또 번호는 1 ~ 45 중 중복이 없이 6개를 고르는 것
        // 변수, 조건문, 반복문, 배열만 사용할 것, 랜덤 숫자 생성
        int[] lotto = new int[6];
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < 6; i++) {
                lotto[i] = (int) (Math.random() * 45)+1;
            }
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < i; j++) {
                    if (lotto[i] == lotto[j]) {
                        flag = true;
                    }
                }
            }
            for (int i=0; i< 6; i++) {
                if(lotto[i] == 6 || lotto[i] == 7 || lotto[i] == 15 || lotto[i] == 22 || lotto[i] == 26 || lotto[i] == 40) {
                    flag = true;
                }
            }
        }
        for(int i=0; i<6; i++){
            System.out.print(lotto[i] + " ");
        }
    }
}