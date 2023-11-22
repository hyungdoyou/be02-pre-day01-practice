package day03;

public class Main {
    public static void main(String[] args) {
        Student yhd = new Student();
        yhd.age = 31;
        yhd.name = "유형도";
        yhd.gender = "남자";
        yhd.fullness = 30;
        yhd.intellgence = 50;

        int result1 = yhd.eating("삼각김밥", 1);
        int result2 = yhd.studying("자바", 8);
        String result3 = yhd.achivement("가자","취업");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        yhd.goHome();
    }
}
