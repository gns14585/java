package ch15collection.book.sec04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class HashMapexample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();

        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + " : " + value);
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(key);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        map.remove("홍길동");

        System.out.println("향상된 for문 전체 탐색");
        for (Map.Entry<String, Integer> entryset : entrySet) {
            System.out.println(entryset.getKey() + " : " + entryset.getValue());
        }
        System.out.println();

        map.put("이정훈", 29);
        map.put("이수현", 35);

        System.out.println("forEach 문 전체 탐색");
        map.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
    }
}
