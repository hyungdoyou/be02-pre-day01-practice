package day01;

public class CodingTest {
    public static int main(String[] args) {
        int n=10;
        for (int i=0 ; i<n; i++) {
            if(n % i == 1) {
                return i;
            }
        }
        return n;
    }
}

