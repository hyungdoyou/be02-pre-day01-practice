package day02;

public class Ex05 {
    public static void main(String[] args) {
        int[] input = new int[10];

        for(int i=0; i<10; i++) {
            input[i] = (int)(Math.random()*10) + 1;
        }
        int totalNum = 0;
        for(int i=0; i<10; i++) {
            totalNum += input[i];
        }
        System.out.println("총합 : " + totalNum);
    }
}
