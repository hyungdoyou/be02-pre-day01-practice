package day05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        // 나중에 문법 더 배우고 쓸 형태
        // List<Integer> integerList = new ArrayList<Integer>();

        ArrayList arrayList = new ArrayList();

        // 리스트에 값을 추가하는 법
        arrayList.add("111");
        arrayList.add("222");
        arrayList.add("333");

        System.out.println(arrayList); // [111, 222, 333]   => 출력형태 기억 ( [ ] )

        // 값을 삭제하고 싶을 때 ( 중복된 것이 있으면, 제일 앞에 있는 것을 삭제 / 추가 삭제 원할 시 다시 명령어를 실행시킨다.)
        arrayList.remove("222");
        System.out.println(arrayList);

        // 리스트에서 원하는 위치에 추가하는 법
        arrayList.add(0, "000");

        // 리스트에서 원하는 위치에 있는 값 삭제
        arrayList.remove(0);

        // 리스트는 타입에 상관없이 저장은 가능하나, 결코 좋은 방법은 아니다
        arrayList.add(444);

        // 리스트에서 원하는 위치의 값 가져오기
        arrayList.get(0);    // 인덱스 번호

        // 그렇기 때문에 타입을 지정해서 리스트를 생성한다.
        // List<Integer> integerList = new ArrayList<Integer>();

        // 해시맵
        // 나중에 문법 배운 후 사용
        // HashMap<String, String> hashMap = new HashMap<String, String>();
        HashMap hashMap = new HashMap();

        // 맵에 값을 추가하는 것
        hashMap.put("키1", "값1");
        hashMap.put("키2", "키2");
        hashMap.put("키3", "키3");

        // 맵에서 원하는 위치의 값 가져오기 (키의 값으로 불러온다.)
        hashMap.get("키1");

        // 맵에서 삭제하는 법
        hashMap.remove("키1");

        System.out.println(hashMap);

    }
}
