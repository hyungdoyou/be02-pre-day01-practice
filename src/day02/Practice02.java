package day02;

public class Practice02 {
    public static void main(String[] args) {
        // 총합을 저장하기 위한 변수를 만들고
        // i가 1부터 100까지 1씩 증가하면서 반복
        // 만약 i가 홀수면
        // 총합에 i를 더해서 저장 후 총합을 출력

        int totalsum=0;
        for(int i=1; i<=100; i++) {
            if(i%2 != 0) {
                totalsum += i;
            }
        }
        System.out.println("홀수 총합 : " + totalsum);
    }
}
