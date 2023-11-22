package day02;

public class Practice01 {
    // 총합을 저장하기 위한 변수 만들기
    // i가 1부터 100까지 1씩 증가하면서 반복
    // 총합에 i를 더해서 저장
    public static void main(String[] args) {
        int totalsum = 0;
        for(int i=1; i<=100; i++) {
               totalsum += i;
        }
        System.out.println("총합 : " + totalsum);
    }
}
