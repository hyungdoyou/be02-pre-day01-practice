package CodingTest;

public class Solution {
    public static void main(String[] args) {
        int x=13;
        int temp=x;
        boolean answer = true;
        int totalNum = 0;
        int[] arr = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = x % 10;
            x /= 10;
        }
        for(int i=0; i<5; i++) {
            totalNum += arr[i];
        }
        if(temp % totalNum != 0 ) {
            answer = false;
        }
        System.out.println(totalNum);
        System.out.println(temp);
        System.out.println(temp%totalNum);
        System.out.println(totalNum);
        System.out.println(answer);
    }
}
