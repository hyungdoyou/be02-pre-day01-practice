package day01;

class Solution {
    public int solution(int n) {
        for (int x = 0; x < n; x--) {
            if (n % x == 1) {
                return x;
            }
        }
        return n;
    }
}
