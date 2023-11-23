package day02;

public class Ex01 {
    public static void main(String[] args) {
        // 1부터 100까지 총합을 구하시오
        int totalNum = 0;
        for(int i=1; i<=100; i++) {
            totalNum += i;
        }
        System.out.println("총합 : " + totalNum);
    }
}
