package day03;

class Student {
        String name;
        Integer age;
        String gender;
        Integer fullness;
        Integer intellgence;
        // 밥먹기
        Integer eating(String menu, Integer amount) {
            fullness = fullness + amount;
            return fullness;
        }
        // 공부하기
        Integer studying(String subject, Integer time) {
            intellgence = intellgence + 2*time;
            return intellgence;
        }
        String company;
        String achivement(String goal, String history) {
            company = goal + history;
            return company;
        }
        // 밥먹기
        void goHome() {    // 매개변수는 안써줘도 되고, 리턴 반환값이 없을 때는 반환 클래스 이름을 void로 해준다.
            System.out.println("집에 간다");
        }
}
