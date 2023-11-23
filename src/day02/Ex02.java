package day02;

public class Ex02 {
    public static void main(String[] args) {
        int totalNum = 0;
        for(int i=1; i<=100; i++) {
            if(i % 2 != 0) {
                totalNum += i;
            }
        }
        System.out.println("홀수 총 합 : " + totalNum);
    }
}
