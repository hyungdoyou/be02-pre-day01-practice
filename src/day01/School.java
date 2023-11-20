package day01;

class School {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        // 객체를 저장할 수 있는 변수 생성
        Student kty;

        // 앞에서 만든 변수에 new로 객체를 생성해서 "=" 로 저장
        kty = new Student();
        kty.age=26;
        kty.name = "김태윤";
        kty.major = true;


        Student yhd;
        yhd = new Student();

        // 객체는 변수와 메소드로 구성되어 있고,
        // 클래스로 객체를 생성하고, 객체를 저장할 수 있는 변수를 생성하고,
        // 객체 안에 있는 변수, 메소드를 사용할 때는 [변수이름] + "." 사용
        // yhd 에는 student 객체가 저장되어 있고, student 객체 안에는 변수가 있는데,
        // 그 변수에는 age 와 name 이 있고, age와 name을 사용하려면 "." 을 사용하고,
        // 변수는 저장할 때 쓰고, 변수를 저장할 때는 "=" 를 사용한다.

        yhd.age = 31;
        yhd.name = "유형도";

        Student kkm;
        kkm = new Student();
        kkm.age = 27;
        kkm.name = "김경미";
        kkm.major = false;

        Integer totalAge = kty.age + yhd.age * kkm.age;

        // 괄호 -> 산술 -> 비교 -> 논리 -> 대입

        Integer result;
        result = kty.age + yhd.age; // 57
        System.out.println(result);

        result = kty.age - yhd.age; // -5
        System.out.println(result);

        result = kty.age * yhd.age; // 806
        System.out.println(result);

        result = kty.age / yhd.age; // 몫만 나옴 0
        System.out.println(result);

        result = kty.age % yhd.age; // 26
        System.out.println(result);

        Boolean result2;
        result2 = kty.age > yhd.age;
        System.out.println(result2);

        Curriculam linux;
        linux = new Curriculam();
        linux.name="리눅스";
        linux.time=2;

        Curriculam db;
        db = new Curriculam();
        db.name="데이터베이스";
        db.time=8;

        Curriculam sw;
        sw = new Curriculam();
        sw.name="SW 공학";
        sw.time=3;
    }
}