package day02;

import java.util.ArrayList;

public class ListPractice {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("abc");   // String 타입의 데이터를 arrayList1에 추가
        arrayList1.add("def");
        arrayList1.add("ghi");

        int size = arrayList1.size();   // arrayList1 에 저장된 총 객체 수 출력
        String index0 = arrayList1.get(0); // arrayList1 에 저장된 0번 인덱스의 객체 출력

        for(int i=0; i<arrayList1.size(); i++) {   // arrayList1에 저장된 모든 객체 출력
            String str = arrayList1.get(i);
            System.out.println(i + " 번 인덱스 : " + str);
        }
        System.out.println("----------------------------------");

        System.out.println("인덱스 추가 전 : " + arrayList1);
        arrayList1.add(2, "hello");    // 2번 인덱스에 hello 객체 추가
        System.out.println("인덱스 추가 후 : " + arrayList1);
        System.out.println("----------------------------------");

        System.out.println("3번 인덱스 변경 전 : " + arrayList1.get(3));
        arrayList1.set(3, "world");   // 3번 인덱스의 값을 "workd" 로 변경
        System.out.println("3번 인덱스 변경 후 : " + arrayList1.get(3));
        System.out.println("----------------------------------");

        System.out.println("인덱스 삭제 전 크기 : " + arrayList1.size());
        arrayList1.remove(3); // 3번 인덱스 삭제
        System.out.println("인덱스 삭제 후 크기 : " + arrayList1.size());
        System.out.println("----------------------------------");

        System.out.println(arrayList1);
        System.out.println(size);
        System.out.println(index0);
    }
}
