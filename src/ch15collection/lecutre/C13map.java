package ch15collection.lecutre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        // map 전체 탐색
        Map<String, String> map = new HashMap<>();
        map.put("학생1" , "흥민");
        map.put("학생2" , "강인");
        map.put("학생3" , "민재");

        // 향상된 for문
        System.out.println("향상된 for문으로 전체 탐색");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // keySet
        System.out.println("keySet사용해서 전체 탐색");
        Set<String> keys = map.keySet();
        for (String keyy : keys) {
            System.out.println(keyy + " : " + map.get(keyy));
        }

        // forEach
        System.out.println("forEach문으로 전체 탐색");
        map.forEach((key, v) -> System.out.println(key + " : " + v));
    }
}
