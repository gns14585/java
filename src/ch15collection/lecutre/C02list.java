package ch15collection.lecutre;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        // List : 순서가 있음, 중복된 객체 저장 가능
        List<String> list = new ArrayList<>();

        // 객체 추가
        list.add("java");
        list.add("spring");
        list.add("css");
        list.add("react");

        // 객체 꺼내기
        String s = list.get(0);
        String s1 = list.get(3);
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        // 몇 개의 객체가 있는지? 갯수
        int size = list.size();
        System.out.println(size);

        list.add("react");
        list.add("css");
        System.out.println(list.size());

        // 객체 삭제
        list.remove("react");
        System.out.println(list.size());
        list.remove("java");
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(3));

        // 있는지 확인
        boolean contains = list.contains("java");
        boolean contains1 = list.contains("react");
        System.out.println("contains = " + contains);
        System.out.println("contains1 = " + contains1);

        // 전체 원소 탐색 (for)
        System.out.println("for문 사용 전체 탐색");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("향상된 for문 사용 전체 탐색");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("foreach 메소드로 전체 탐색");
        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println);
    }
}
