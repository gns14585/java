package P97homePractice.Practice8;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("apple", 10);
        treeMap.put("forever", 60);
        treeMap.put("description", 40);
        treeMap.put("ever", 50);
        treeMap.put("zoo", 80);
        treeMap.put("base", 20);
        treeMap.put("guess", 70);
        treeMap.put("cherry", 30);

        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println();

        Map.Entry<String, Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("제일 앞 단어 : " + entry.getKey() + " - " + entry.getValue());
        entry = treeMap.lastEntry();
        System.out.println("제일 뒷 단어 : " + entry.getKey() + " - " + entry.getValue());
        entry = treeMap.lowerEntry("ever");
        System.out.println("ever 앞 단어 : " + entry.getKey() + " - " + entry.getValue());
        entry = treeMap.higherEntry("ever");
        System.out.println("ever 뒷 단어 : " + entry.getKey() + " - " + entry.getValue());
        System.out.println();

        NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
        Set<Map.Entry<String, Integer>> descendingSet = descendingMap.entrySet();
        for (Map.Entry<String, Integer> e : descendingSet) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println();

        System.out.println("[ c ~ h 사이의 단어 검색 ]");
        NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
        Set<Map.Entry<String, Integer>> rangeSet = rangeMap.entrySet();
        for (Map.Entry<String, Integer> e : rangeSet) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
