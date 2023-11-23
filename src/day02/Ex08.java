package day02;

public class Ex08 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        boolean flag = true;

        while(flag) {
            flag = false;
            for(int i=0; i<6; i++) {
                lotto[i] = (int)(Math.random()*45) + 1;
            }
            for(int i=0; i<6; i++) {
                for(int j=0; j<i; j++) {
                    if(lotto[j] == lotto[i]) {
                        flag = true;
                    }
                }
            }
        }
        System.out.print("이번주 로또번호 : ");
        for(int i=0; i<6; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
