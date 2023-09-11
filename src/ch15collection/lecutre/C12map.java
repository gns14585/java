package ch15collection.lecutre;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        // map : key, value 쌍(Entry)을 저장
        // key가 중복된 entry가 있을 수 없다.

        Map<String, String> map = new HashMap<>();

        // put: etnry 추가 메소드
        map.put("student1", "손흥민");
        map.put("student2", "이강인");
        map.put("student3", "김민재");

        // entry의 갯수 확인
        System.out.println("map.size() = " + map.size());

        // entry 를 교체 메소드
        map.put("student3", "박지성");

        // entry 를 삭제 메소드 ( key값만 넣어주면됨 )
        map.remove("student2");

        // entry의 value를 얻는 메소드
        String s = map.get("student1");
        System.out.println("s = " + s);
        System.out.println("map.get(\"student3\") = " + map.get("student3"));
        System.out.println("map.get(\"student2\") = " + map.get("student2")); // 없는걸 꺼내면 null
    }
}
