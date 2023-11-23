package CodingTest;

public class Solution {
    public static String main(String[] seoul) {
        String answer = "";
        String answer1 = answer;
        for(int i = 0; i<1000; i++) {
            if(seoul[i] == "Kim") {
                answer1 = "김서방은" + i +"에 있다";
                break;
            }
        }
        return answer1;
    }
}
